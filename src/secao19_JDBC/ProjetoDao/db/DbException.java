package secao19_JDBC.ProjetoDao.db;

public class DbException extends RuntimeException{
    public DbException(String msg){
        super(msg);
    }
}