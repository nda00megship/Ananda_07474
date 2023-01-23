package studi_kasus;
import studi_kasus.emak;
import java.util.Date;

public class User extends emak{
    public User(String nama, String kode, String password, String nomor, String film, String hari, Date tanggal, String sesi, String jam) {
        super.nama = nama;
        super.kode = kode;
        super.password = password;
        super.nomor = nomor;
        super.film = film;
        super.hari = hari;
        super.tanggal = tanggal;
        super.sesi = sesi;
        super.jam = jam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    public String getSesi() {
        return sesi;
    }

    public void setSesi(String sesi) {
        this.sesi = sesi;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String waktu) {
        this.jam = jam;
    }

}
