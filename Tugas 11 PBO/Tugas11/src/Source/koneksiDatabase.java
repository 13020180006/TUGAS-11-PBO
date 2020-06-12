/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 11 Juni 2020
    Waktu	: 21.14 WITA
*/
package Source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksiDatabase {
     private static Connection con;
    public static Connection getConnection(){ 
        if(con==null){ 
            try { 
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahasiswa","root","");             
            } catch (SQLException ex) { 
                Logger.getLogger(koneksiDatabase.class.getName()).log(Level.SEVERE, null, ex);  
            }
        } 
        return con;
    }
}
