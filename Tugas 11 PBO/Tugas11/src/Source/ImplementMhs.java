/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 11 Juni 2020
    Waktu	: 21.21 WITA
*/
package Source;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplementMhs implements interfaceMhs{
    @Override
    public mahasiswa insert(mahasiswa o) throws SQLException {
        PreparedStatement st = koneksiDatabase.getConnection().prepareStatement("insert into tabel_mahasiswa values(?,?,?)");
        st.setString(1, o.getNomhs());
        st.setString(2, o.getNama());
        st.setString(3, o.getJurusan());
        st.executeUpdate();
        return o;
    }
    @Override
    public void update(mahasiswa o, String stbAwal) throws SQLException {
        PreparedStatement st = koneksiDatabase.getConnection().prepareStatement("update tabel_mahasiswa set Nama='"+o.getNama()+"',Jurusan='"+o.getJurusan()+
                "', Nomhs='"+o.getNomhs()+"' where Nomhs='"+stbAwal+"'");

//        st.setString(1, o.getNomhs());
//        st.setString(2, o.getNama());
//        st.setString(3, o.getJurusan());
        st.executeUpdate();
    }
    @Override
    public void delete(String Nomhs) throws SQLException {
        PreparedStatement st = koneksiDatabase.getConnection().prepareStatement("delete from tabel_mahasiswa where Nomhs=?");
        st.setString(1, Nomhs);
        st.executeUpdate();
    }
    @Override
    public List getAll() throws SQLException {
        Statement st = koneksiDatabase.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from tabel_mahasiswa");
        List list = new ArrayList();
        while (rs.next()) {
            mahasiswa p = new mahasiswa();
            p.setNomhs(rs.getString("Nomhs"));
            p.setNama(rs.getString("Nama"));
            p.setJurusan(rs.getString("Jurusan"));
            list.add(p);
        }
        return list;
    }
    @Override
    public List getSearch(String code) throws SQLException {
        Statement st = koneksiDatabase.getConnection().createStatement();
        ResultSet rs = st.executeQuery("select * from tabel_mahasiswa where Nama LIKE '"+code+"%'");
        List list = new ArrayList();
        while (rs.next()) {
            mahasiswa p = new mahasiswa();
            p.setNomhs(rs.getString("Nomhs"));
            p.setNama(rs.getString("Nama"));
            p.setJurusan(rs.getString("Jurusan"));
            list.add(p);
        }
        return list;
    }
}
