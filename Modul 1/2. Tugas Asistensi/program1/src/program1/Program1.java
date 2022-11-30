package program1;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        //deklarasi variabel
        String nama, alamat, kota;
        int usia, tgllahir;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //menampilkan output pada user
        System.out.println("Biodata");
        System.out.print("Nama : ");
        
        //menggunakan scanner dan menyimpan di variabel
        nama = keyboard.nextLine();
        
        System.out.print("Alamat : ");
        alamat = keyboard.nextLine();
        
        System.out.print("Kota : ");
        kota = keyboard.nextLine();
        
        
        System.out.print("Usia : ");
        usia = keyboard.nextInt();
        
        System.out.print("Tanggal Lahir : ");
        tgllahir = keyboard.nextInt();
        
        
        //Menampilkan yang sudah disimpan pada variabel
        System.out.println("\n====================");
        System.out.println("Nama : "+nama);
        System.out.println("Usia : "+usia);
        System.out.println("Tanggal Lahir : "+tgllahir);
        System.out.println("Alamat : "+alamat);
        System.out.println("Kota : "+kota);
    }
}
