/*
    Nama	: Paramadina Mulya Majid
    Stambuk	: 13020180006
    Hari/Tgl	: Kamis, 11 Juni 2020
    Waktu	: 21.37 WITA
*/
package Source;

import java.util.Objects;

public class mahasiswa {
    String Nomhs; 
    String Nama; 
    String Jurusan;
    
    public mahasiswa() { }
        public mahasiswa(String Nomhs, String Nama, String Jurusan) {
            this.Nomhs = Nomhs;
            this.Nama = Nama; 
            this.Jurusan = Jurusan; 
        }
    public String getJurusan() { 
        return Jurusan; 
    }
    public void setJurusan(String Jurusan) { 
        this.Jurusan = Jurusan; 
    }
    public String getNama() { 
        return Nama; 
    }
    public void setNama(String Nama) { 
        this.Nama = Nama; 
    }
    public String getNomhs() { 
        return Nomhs; 
    } 
    public void setNomhs(String Nomhs) { 
        this.Nomhs = Nomhs; 
    } 
    @Override 
    public String toString() { 
        return "Mahasiswa{" + "Nomhs=" + Nomhs + ", Nama=" + Nama + ", Jurusan=" + Jurusan + '}'; 
    } 
    @Override 
    public int hashCode() { 
        int hash = 3; 
        hash = 89 * hash + Objects.hashCode(this.Nomhs); 
        hash = 89 * hash + Objects.hashCode(this.Nama);
        hash = 89 * hash + Objects.hashCode(this.Jurusan); 
        return hash; 
    } 
    @Override 
    public boolean equals(Object obj) { 
        if (this == obj) { 
            return true; 
        } 
        if (obj == null) { 
            return false; 
        } 
        if (getClass() != obj.getClass()) { 
            return false; 
        } 
        final mahasiswa other = (mahasiswa) obj; 
        if(!Objects.equals(this.Nomhs, other.Nomhs)) { 
            return false; 
        } 
        if (!Objects.equals(this.Nama, other.Nama)) { 
            return false; 
        } if (!Objects.equals(this.Jurusan, other.Jurusan)) { 
            return false; 
        } 
        return true; 
    }
}
