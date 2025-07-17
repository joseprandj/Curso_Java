package secao19_JDBC.ProjetoDao.module.dao.impl;

import secao19_JDBC.ProjetoDao.module.dao.SellerDao;
import secao19_JDBC.ProjetoDao.module.entities.Department;
import secao19_JDBC.ProjetoDao.module.entities.Seller;
import secao19_JDBC.transacao.db.DB;
import secao19_JDBC.transacao.db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;
    public SellerDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement(
            "SELECT " +
                    "SEL.*, " +
                    "DEP.NAME AS DEPNAME " +
                    "FROM EXT_1.JJSELLER SEL " +
                    "INNER JOIN EXT_1.JJDEPARTMENT DEP ON DEP.ID = SEL.ID " +
                    "WHERE SEL.ID = ?"
            );
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Department dep = instantiateDepartment(rs);
                Seller obj = instantiateSeeler(rs, dep);
                return  obj;
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

    private Seller instantiateSeeler(ResultSet rs, Department dep) throws SQLException {
        Seller obj = new Seller();
        obj.setId(rs.getInt("ID"));
        obj.setName(rs.getString("NAME"));
        obj.setEmail(rs.getString("EMAIL"));
        obj.setBaseSalary(rs.getDouble("BASESALARY"));
        obj.setBirthDate(rs.getDate("BIRTHDATE"));
        obj.setDepartment(dep);
        return obj;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("DEPARTMENTID"));
        dep.setName(rs.getString("DEPNAME"));
        return dep;
    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement(
                "SELECT\n" +
                    "SEL.*,\n" +
                    "DEP.NAME AS DEPNAME\n" +
                "FROM EXT_1.JJSELLER SEL\n" +
                "INNER JOIN EXT_1.JJDEPARTMENT DEP ON DEP.ID = SEL.DEPARTMENTID\n" +
                "ORDER BY DEP.NAME"
            );
            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {

                Department dep = map.get(rs.getInt("DEPARTMENTID"));
                if (dep == null){
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DEPARTMENTID"), dep);
                }
                Seller obj = instantiateSeeler(rs, dep);
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

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = conn.prepareStatement(
            "SELECT\n" +
                    "SEL.*,\n" +
                    "DEP.NAME AS DEPNAME\n" +
                "FROM EXT_1.JJSELLER SEL\n" +
                "INNER JOIN EXT_1.JJDEPARTMENT DEP ON DEP.ID = SEL.DEPARTMENTID\n" +
                "WHERE DEP.ID = ?\n" +
                "ORDER BY DEP.NAME"
            );
            st.setInt(1, department.getId());
            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (rs.next()) {

                Department dep = map.get(rs.getInt("DEPARTMENTID"));
                if (dep == null){
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("DEPARTMENTID"), dep);
                }
                Seller obj = instantiateSeeler(rs, dep);
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
