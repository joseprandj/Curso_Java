package secao19_JDBC.consultandoDados.db;

public class DbException extends RuntimeException{
    public DbException(String msg){
        super(msg);
    }
}