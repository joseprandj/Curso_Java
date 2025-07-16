package secao19_JDBC.alterandoDados.application;

import secao19_JDBC.alterandoDados.db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE EXT_1.TGFCTT SET NOMECONTATO = ?" +
                    "WHERE CODPARC = 1 AND CODCONTATO = 3"
            );
            st.setString(1, "JJteste");

            int rowsAffected = st.executeUpdate();
            System.out.printf("Done! Rows affected %d", rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          DB.closeStatement(st);
          DB.closeConnection();
        }
    }
}
