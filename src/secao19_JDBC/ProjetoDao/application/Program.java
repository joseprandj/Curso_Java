package secao19_JDBC.ProjetoDao.application;

import secao19_JDBC.ProjetoDao.module.entities.Department;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.print(obj);
    }
}
