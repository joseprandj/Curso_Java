package secao19_JDBC.transacao.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection(){
        if (conn == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");

                conn = DriverManager.getConnection(url, props);
                System.out.println("Conexão estabelecida com sucesso.\n");
            } catch (SQLException e) {
                System.out.println("Erro - " + e.getMessage());
            }
        }
        return conn;
    }


    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeConnection(){
        try{
            if (conn != null) {
                conn.close();
                System.out.print("\nConexao fechada com sucesso.\n");
            }
       } catch (SQLException e) {
            throw new DbException(e.getMessage());
       }
    }

    public static void closeStatement(Statement st){
        if (st != null){
            try{
                st.close();
                System.out.println("\nStatement encerrado com sucesso.\n");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs){
        if (rs != null){
            try{
                rs.close();
                System.out.println("ResulSet encerrado com sucesso.");
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
