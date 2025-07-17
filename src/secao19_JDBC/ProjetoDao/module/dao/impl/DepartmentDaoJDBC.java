package secao19_JDBC.ProjetoDao.module.dao.impl;

import secao19_JDBC.ProjetoDao.db.DB;
import secao19_JDBC.ProjetoDao.db.DbException;
import secao19_JDBC.ProjetoDao.module.dao.DepartmentDao;
import secao19_JDBC.ProjetoDao.module.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection conn;
    public DepartmentDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

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
        return null;
    }

    @Override
    public List<Department> findAll() {
        return Collections.emptyList();
    }
}
