import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost/rm-padang";
                user = "root";
                password = "root";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("Gagal membuat koneksi: " + e.getMessage());
            }
        }
        return koneksi;
    }
}