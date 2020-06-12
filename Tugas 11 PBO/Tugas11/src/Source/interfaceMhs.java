/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 11 Juni 2020
    Waktu	: 21.22 WITA
*/
package Source;

import java.sql.SQLException;
import java.util.List;

public interface interfaceMhs {
    mahasiswa insert(mahasiswa o) throws SQLException;
    void update(mahasiswa o, String stbAwal) throws SQLException;
    void delete(String Nomhs) throws SQLException;
    List getAll() throws SQLException;
    List getSearch(String code) throws SQLException;
}
