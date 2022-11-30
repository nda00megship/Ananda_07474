package pemesanantiketbioskop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String kode = null, jam;
       int harga = 50000;
       Scanner input = new Scanner(System.in);
       Tiket user = new Tiket();
       
        System.out.println("Pemesanan Tiket Bioskop");
        System.out.print("Nama\t: ");
        String nama = input.next();
        System.out.print("No Telp\t: ");
        String nomor = input.next();
        System.out.println("\n");
        
        user.setNama(nama);
        user.setTelepon(nomor);
        
        System.out.println("Pilih Film :");
        System.out.println("1. Koboy");
        System.out.println("2. Perang");
        System.out.println("3. Sedih");
        System.out.println("Masukkan Pilihan :");
        int a = input.nextInt();
        if (a==1){
            kode = "B14";
        }else if(a == 2){
            kode = "A24";
        }else{
            kode = "Z91";
        }
        
        System.out.println("Pilihan Jam Film");
        System.out.println("1. 12.00");
        System.out.println("2. 15.00");
        System.out.println("3. 16.00");
        System.out.println("Masukkan Pilihan :");
        int b = input.nextInt();
        if (b==1){
            jam = "12.00";
        }else if(b == 2){
            jam = "15.00";
        }else{
            jam = "16.00";
        }
        
        user.setKode(kode);
        user.setWaktu(jam);
        user.setHarga(harga);
        
        System.out.println("========Pemesanan========");
        System.out.println("Nama\t: " + user.getNama());
        System.out.println("Nomor Hp\t: " + user.getTelepon());
        System.out.println("\n");
        System.out.println("Kode Film\t: " + user.getKode());
        System.out.println("Jam Film\t: " + user.getWaktu());
        System.out.println("Harga Film\t: " + user.getHarga()+"Rupiah");
    }
}
