package secao19_JDBC.ProjetoDao.application;

import secao19_JDBC.ProjetoDao.module.dao.DaoFactory;
import secao19_JDBC.ProjetoDao.module.dao.SellerDao;
import secao19_JDBC.ProjetoDao.module.entities.Department;
import secao19_JDBC.ProjetoDao.module.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("--- TESTE 1: seller findById");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n--- TESTE 2: seller findByDepartment");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n--- TESTE 3: seller findAll");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n--- TESTE 4: seller insert");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.print("Inserido com sucesso");
    }
}
