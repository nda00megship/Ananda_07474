import java.util.ArrayList;
import java.util.Scanner;

class data{
    ArrayList <String> obj = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    //attribute 
    private String nm_film;
    private String sesi;
    private String waktu;
    private String pmbyrn;
    private String nmr_kursi;
    
    public data(String name, String sesi, int par2, String waktu){
        this.nm_film = name;
        this.sesi = sesi;
        this.waktu = waktu;
    }
    public void data2(String nmr_kursi, String pmbyrn){
        this.nmr_kursi = nmr_kursi;
        this.pmbyrn = pmbyrn;
    }
    
    public String nm_film(){
        return nm_film;
    }
    public String waktu(){
        return waktu;
    }
    public String sesi(){
        return sesi;
    }
    public String nmr_kursi(){
        return nmr_kursi;
    }
    public String pmbyrn(){
        return pmbyrn;
    }
    
    public void daftar(){
        System.out.print("Masukkan Nama Film : ");
        nm_film = in.nextLine();
        nm_film = nm_film();
        obj.add(nm_film);
        System.out.print("Masukkan Jam Tayang : ");
        waktu = in.nextLine();
        waktu = waktu();
        obj.add(waktu);
        System.out.print("Masukkan Sesi : ");
        sesi = in.nextLine();
        sesi = sesi();
        obj.add(sesi);
        System.out.print("Masukkan Nomor Kursi : ");
        nmr_kursi = in.nextLine();
        nmr_kursi = nmr_kursi();
        obj.add(nmr_kursi);
        System.out.print("Masukkan Pembayaran : Rp ");
        pmbyrn = in.nextLine();
        pmbyrn = pmbyrn(); 
        obj.add(pmbyrn);
    }
    public void show(){
        System.out.println("-------------------------");
        System.out.println("Film : " + obj.get(0));
        System.out.println("Waktu : " + obj.get(1));
        System.out.println("Sesi : " + obj.get(2));
        System.out.println("Nomor Kursi : " + obj.get(3));
        System.out.println("Total Pembayaran : Rp " + obj.get(4));
        System.out.println("--------------------------"); 
    }
}