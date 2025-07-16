package secao19_JDBC.ProjetoDao.application;

import secao19_JDBC.ProjetoDao.module.entities.Department;
import secao19_JDBC.ProjetoDao.module.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "Books");
        System.out.println(department);

        Seller seller = new Seller(1, "Teste", "teste@gmail.com", new Date(),1500.00, department);
        System.out.println(seller);
    }
}
