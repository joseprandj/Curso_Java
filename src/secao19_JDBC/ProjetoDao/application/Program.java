package secao19_JDBC.ProjetoDao.application;

import secao19_JDBC.ProjetoDao.module.dao.DaoFactory;
import secao19_JDBC.ProjetoDao.module.dao.SellerDao;
import secao19_JDBC.ProjetoDao.module.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);


        System.out.println(seller);
    }
}
