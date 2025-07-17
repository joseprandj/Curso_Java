package secao19_JDBC.ProjetoDao.module.dao;

import secao19_JDBC.ProjetoDao.module.entities.Department;
import secao19_JDBC.ProjetoDao.module.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}