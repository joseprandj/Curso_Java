package secao19_JDBC.ProjetoDao.application;

import secao19_JDBC.ProjetoDao.module.dao.DaoFactory;
import secao19_JDBC.ProjetoDao.module.dao.DepartmentDao;
import secao19_JDBC.ProjetoDao.module.entities.Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);
        List<Department> list = new ArrayList<>();


        System.out.println("--- TESTE 1: department findById");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n--- TESTE 2: department findAll");
        list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }

        System.out.println("\n--- TESTE 3: department insert");
        Department newDepartment = new Department(null, "IFOOD");
        //departmentDao.insert(newDepartment);
        System.out.print("Inserted success");

        System.out.println("\n--- TESTE 4: department update");
        department = departmentDao.findById(22);
        department.setName("Ifood");
        departmentDao.update(department);
        System.out.print("Updated completed");

        System.out.println("\n--- TESTE 5: department delete");
        System.out.print("enter id delete teste: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.print("Delete completed");

        sc.close();
    }
}
