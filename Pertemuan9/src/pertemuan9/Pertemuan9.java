package pertemuan9;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author arlya dewi
 * tgl 17 mei 2025
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        dbkoneksi dbk = new dbkoneksi ();
        Statement st = dbk.koneksi().createStatement();
        
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()){
            
            System.out.println("Nama : "+rs.getString("NAMA"));
            System.out.println("Nim : "+rs.getString("NIM"));
            System.out.println("jurusan : "+rs.getString("JURUSAN"));
            System.out.println("Alamat : "+rs.getString("ALAMAT"));
        }
    }
    
}
