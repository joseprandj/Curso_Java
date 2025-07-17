package secao19_JDBC.ProjetoDao.module.dao;

import secao19_JDBC.ProjetoDao.module.dao.impl.DepartmentDaoJDBC;
import secao19_JDBC.ProjetoDao.module.dao.impl.SellerDaoJDBC;
import secao19_JDBC.transacao.db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
