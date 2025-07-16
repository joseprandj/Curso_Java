package secao19_JDBC.deletandoDados.db;

public class DbException extends RuntimeException{
    public DbException(String msg){
        super(msg);
    }
}