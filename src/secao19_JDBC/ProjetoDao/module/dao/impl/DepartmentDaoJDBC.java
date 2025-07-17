package secao19_JDBC.ProjetoDao.module.dao.impl;

import secao19_JDBC.ProjetoDao.db.DB;
import secao19_JDBC.ProjetoDao.db.DbException;
import secao19_JDBC.ProjetoDao.module.dao.DepartmentDao;
import secao19_JDBC.ProjetoDao.module.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;
    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }


    @Override
    public void insert(Department obj) {}

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
        return Collections.emptyList();
    }
}
