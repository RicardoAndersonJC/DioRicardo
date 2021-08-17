import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionJDBC {
    public static void main(String[] args) {
        String urlConnection = "jdbc:mysql://localhost:3306/javaestudo";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(urlConnection, "root", "Deus@123");
            System.out.println("Conexão com sucesso ");
        }
        catch (Exception e) {
            System.out.println("Conexão falhou ");
        }


    }
}
