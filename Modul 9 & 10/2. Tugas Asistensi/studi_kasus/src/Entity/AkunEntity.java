package Entity;

import Entity.induk;
public class AkunEntity extends induk{
    public AkunEntity(String film, String hari, String sesi, String waktu){ 
        super.film = film;
        super.hari = hari;
        super.sesi = sesi;
        super.waktu = waktu;
    }
    public AkunEntity(int index, int indekursus){
        super.index = index;
        super.indexfilm = indexfilm;
    }
     @Override
    public String getFilm() {
        return super.getFilm();
    }

    public void setKelas(String kelas) {
        this.film = kelas;
    }

    @Override
    public String getHari() {
        return super.getHari();
    }

    public void setHari(String hari) {
        this.hari = hari;
    }
    
    @Override
    public String getWaktu() {
        return super.getWaktu();
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    
    @Override
    public int getIndex() {
        return super.getIndex();
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int getIndexfilm () {
        return super.getIndexfilm();
    }

    public void setIndexfilm(int indexfilm) {
        this.indexfilm = indexfilm;
    }

}
