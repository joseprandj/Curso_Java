package secao19_JDBC.deletandoDados.application;

import secao19_JDBC.deletandoDados.db.DB;
import secao19_JDBC.deletandoDados.db.DbIntegrityException;

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
                "DELETE FROM EXT_1.TGFCTT " +
                "WHERE CODPARC = 1 AND CODCONTATO = ?"
            );
            st.setInt(1, 3);

            int rowsAffected = st.executeUpdate();
            System.out.printf("Done! Rows affected %d", rowsAffected);

        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
          DB.closeStatement(st);
          DB.closeConnection();
        }
    }
}
