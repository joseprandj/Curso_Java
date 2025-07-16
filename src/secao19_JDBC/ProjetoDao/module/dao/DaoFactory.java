package secao19_JDBC.ProjetoDao.module.dao;

import secao19_JDBC.ProjetoDao.module.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
