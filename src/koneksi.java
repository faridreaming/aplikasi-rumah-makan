import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost/rm-padang";
                String user = "root";
                String password = "";  // Sesuaikan jika ada password untuk user root
                
                // Menggunakan driver terbaru
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi berhasil!");
                
            } catch (SQLException e) {
                System.out.println("Gagal membuat koneksi: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.out.println("Driver MySQL tidak ditemukan: " + e.getMessage());
            }
        }
        return koneksi;
    }
}
