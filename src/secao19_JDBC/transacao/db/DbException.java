package secao19_JDBC.transacao.db;

public class DbException extends RuntimeException{
    public DbException(String msg){
        super(msg);
    }
}