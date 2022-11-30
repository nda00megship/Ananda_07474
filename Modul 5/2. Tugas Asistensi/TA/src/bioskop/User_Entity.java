package bioskop;

public class User_Entity{
    //attribut
     String film;
     String fnama;
     String lnama;
     String noTelp;
     String tanggal;
     String filmnew;

    public User_Entity(String film, String fnama, String lnama, String noTelp, String tanggal, String filmnew) {
        this.film = film;
        this.fnama = fnama;
        this.lnama = lnama;
        this.noTelp = noTelp;
        this.tanggal = tanggal;
        this.filmnew = filmnew;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getFnama() {
        return fnama;
    }

    public void setFnama(String fnama) {
        this.fnama = fnama;
    }

    public String getLnama() {
        return lnama;
    }

    public void setLnama(String lnama) {
        this.lnama = lnama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getFilmnew() {
        return filmnew;
    }

    public void setFilmnew(String filmnew) {
        this.filmnew = filmnew;
    }
     
     

}