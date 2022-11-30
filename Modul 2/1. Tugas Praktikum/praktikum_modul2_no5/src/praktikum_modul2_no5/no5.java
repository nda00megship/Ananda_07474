package praktikum_modul2_no5;
import java.util.Scanner;

public class no5 {

String nama;
    int nomor_kursi, bayar;
    double jam_nonton;
    boolean status;
    
    //Method Set
    void setNama(String nama){
        this.nama = nama;
    }
    void setnomor_kursi(int nomor_kursi){
        this.nomor_kursi = nomor_kursi;
    }
    void setjam_nonton(double jam_nonton){
        this.jam_nonton = jam_nonton;
    }
    void setbayar(int bayar){
        this.bayar = bayar;
    }
    //Method Get
    String getNama(){
        return nama;
    }
    int getnomor_kursi(){
        return nomor_kursi;
    }
    double getjam_nonton(){
        return jam_nonton;
    }
    int getbayar(){
        return bayar;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        //Membuat Objek dari Class
        no5 data = new no5();
        Scanner input=new Scanner(System.in);
        String nama;
        int nomor_kursi, bayar;
        double jam_nonton;
        
        System.out.print("Masukkan Nama Film: ");
        nama=input.nextLine();
        System.out.print("Nomor Kursi: ");
        nomor_kursi = input.nextInt();
        System.out.print("Jam Tayang: ");
        jam_nonton = input.nextDouble();
        System.out.print("Total Pembayaran: Rp ");
        bayar = input.nextInt();
        
        System.out.println("");
        //============== INPUT ==============
        data.setNama(nama);
        data.setnomor_kursi(nomor_kursi);
        data.setjam_nonton(jam_nonton);
        data.setbayar(bayar);
        
        //============== OUTPUT ==============
        System.out.println("==OUTPUT==");
        System.out.println("Film yang dipilih: "+data.getNama());
        System.out.println("Nomor Kursi: "+data.getnomor_kursi());
        System.out.println("Jam Tayang: "+data.getjam_nonton());
        System.out.println("Total Pembayaran: "+data.getbayar());
    }
}