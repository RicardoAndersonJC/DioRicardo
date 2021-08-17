package ConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {
        String urlConnection = "jdbc:mysql://localhost/javaestudo";
        Connection conn = DriverManager.getConnection(urlConnection,"root","Deus@123");
    }
}
