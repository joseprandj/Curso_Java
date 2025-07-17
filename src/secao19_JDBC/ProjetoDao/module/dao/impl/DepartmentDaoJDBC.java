package secao19_JDBC.ProjetoDao.module.dao.impl;

import secao19_JDBC.ProjetoDao.db.DB;
import secao19_JDBC.ProjetoDao.db.DbException;
import secao19_JDBC.ProjetoDao.module.dao.DepartmentDao;
import secao19_JDBC.ProjetoDao.module.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;
    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }


    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
            "INSERT INTO EXT_1.JJDEPARTMENT (NAME)\n" +
                "VALUES (?)"
            );
            st.setString(1, obj.getName());

            int rowsAffectd = st.executeUpdate();

            if (rowsAffectd > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("Unexpected error! No rows affected");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
            "UPDATE EXT_1.JJDEPARTMENT\n" +
                "SET NAME = ?\n" +
                "WHERE ID = ?"
            );
            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());

            int rows = st.executeUpdate();
            if (rows == 0){
                throw new DbException("Id informed does not exist.");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try{
            st = conn.prepareStatement(
            "DELETE FROM EXT_1.JJDEPARTMENT WHERE ID = ?"
            );
            st.setInt(1, id);

            int rows = st.executeUpdate();
            if (rows == 0){
                throw new DbException("Id informed does not exist.");
            }
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement(
            "SELECT DEP.*\n" +
                "FROM EXT_1.JJDEPARTMENT DEP\n" +
                "WHERE DEP.ID = ?"
            );
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department dep = instantiateDepartment(rs);
                return dep;
            } else {
                return null;
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("ID"));
        dep.setName(rs.getString("NAME"));
        return dep;
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement(
            "SELECT DEP.* FROM EXT_1.JJDEPARTMENT DEP"
            );
            rs = st.executeQuery();

            List<Department> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {
                Department dep = map.get(rs.getInt("ID"));
                if (dep == null){
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("ID"), dep);
                }
                Department obj = instantiateDepartment(rs);
                list.add(obj);
            }
            return  list;
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
