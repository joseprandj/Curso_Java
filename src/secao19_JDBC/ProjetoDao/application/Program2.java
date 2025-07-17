package secao19_JDBC.ProjetoDao.application;

import secao19_JDBC.ProjetoDao.module.dao.DaoFactory;
import secao19_JDBC.ProjetoDao.module.dao.DepartmentDao;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- TESTE 6: department delete");
        System.out.print("enter id delete teste: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.print("Delete completed");

        sc.close();
    }
}
