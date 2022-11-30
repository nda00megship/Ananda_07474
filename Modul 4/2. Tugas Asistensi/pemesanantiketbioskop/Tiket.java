package pemesanantiketbioskop;

public class Tiket extends Customer{
    private String Kode;
    private int hargaTiket;
    private String Jam;
    
    public String getKode(){
        return this.Kode;
    }
    
    public void setKode(String kd){
        this.Kode = kd;
    }
    
    public int getHarga(){
        return this.hargaTiket;
    }
    
    public void setHarga(int hrg){
        this.hargaTiket = hrg;
    }
    
    public String getWaktu(){
        return this.Jam;
    }
    
    public void setWaktu(String waktu){
        this.Jam = waktu;
    }
}
