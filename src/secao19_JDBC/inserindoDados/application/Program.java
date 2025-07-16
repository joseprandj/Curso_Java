package secao19_JDBC.inserindoDados.application;

import secao19_JDBC.inserindoDados.db.DB;

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
            "INSERT INTO EXT_1.TGFCTT (CODPARC, CODCONTATO, NOMECONTATO)" +
                " VALUES (?, ?, ?)"
            );
            st.setInt(1, 1);
            st.setInt(2, 3);
            st.setString(3, "JJTESTE");

            int rowsAffected = st.executeUpdate();
            System.out.printf("Done! Rows affected: %d", rowsAffected);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
