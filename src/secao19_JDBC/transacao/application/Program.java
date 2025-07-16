package secao19_JDBC.transacao.application;

import secao19_JDBC.transacao.db.DB;
import secao19_JDBC.transacao.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate(
            "UPDATE EXT_1.TGFCTT " +
                "SET APELIDO = 'TesteJJ1' " +
                "WHERE " +
                    "CODPARC = 1" +
                    " AND CODCONTATO = 2"
            );
            /*
            int x = 1;
            if(x < 2){
                throw new SQLException("Fake error");
            }*/
            int rows2 = st.executeUpdate(
                    "UPDATE EXT_1.TGFCTT " +
                            "SET APELIDO = 'TesteJJ2' " +
                            "WHERE " +
                            "CODPARC = 1" +
                            " AND CODCONTATO = 3"
            );

            conn.commit();

            System.out.print("rows1" + rows1);
            System.out.print("rows2" + rows2);

        } catch (SQLException e) {
            try{
                conn.rollback();
                throw new DbException("Transação interrompida " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Erro ao tentar interromper a transação." + ex.getMessage());
            }
        } finally {
          DB.closeStatement(st);
          DB.closeConnection();
        }
    }
}
