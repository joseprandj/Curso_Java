package secao19_JDBC.consultandoDados.application;

import secao19_JDBC.consultandoDados.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DB.getConnection();

            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM EXT_1.TGFCAB WHERE ROWNUM <= 5 ORDER BY NUNOTA ASC");

            while (rs.next()){
                System.out.println(
                        rs.getInt("NUNOTA") + ", "
                        + rs.getDouble("VLRNOTA"));
            }

        } catch (SQLException e) {
           e.printStackTrace();
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
