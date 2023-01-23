package project;

import Controller.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import View.GUIi;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
//    
//    private static Scanner in = new Scanner(System.in);
//    private static UserController user = new UserController();
//    private static FilmController akun = new FilmController();
//    private static int cekdata, loop = -1;
//    
    public static void main(String[]args){
        GUIi g = new GUIi();
        
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        double width = screenSize.getWidth();
//        double height = screenSize.getHeight();
//        System.out.println(width);
//        System.out.println(height);
    }
}    
//        lihatfilm();
//        int pil;
//        do{
//            System.out.println("====================================");
//            System.out.println("  Selamat Datang di Bioskop Meguy   ");
//            System.out.println("====================================");
//            System.out.println("Pilihan :                           ");
//            System.out.println("--------------------------------------");
//            System.out.println("1. Daftar akun                        ");
//            System.out.println("2. Login                              ");
//            System.out.println("3. exit                               ");
//            System.out.println("--------------------------------------");
//            System.out.print("Masukkan Pilihan : ");
//            pil = in.nextInt();
//            switch(pil){
//                case 1 :
//                    daftarakun();
//                    break;
//                case 2 : 
//                    login();
//                    break;
//                case 3 : 
//                    System.out.println("Terimakasih sudah mengunjungi program kami");
//                    break;
//            }
//        }while(pil != 3);
//    }
//    
//    private static void daftarakun(){
//        try{
//            System.out.print("Masukkan Nama : ");
//            String nama = in.next();
//            System.out.print("Masukkan Kode : "); 
//            String kode = in.next();
//            System.out.print("Masukkan Nomor Handphone : ");
//            String nomor = in.next();
//            System.out.print("Masukkan Password : ");
//            String password  = in.next();
//            System.out.print("Masukkan Jadwal Nonton (mm/dd/yyyy) : "); 
//            Date jdwlNonton = new Date(in.next());
//            user.insert(nama, kode, nomor, password, jdwlNonton);
//        }catch(Exception e){
//            System.out.println("Mohon, Maaf data anda salah silahkan mengisi data kembali");
//        }
//    }
//    
//    private static void login(){
//        try{
//            int pil;
//            System.out.print("Masukkan Nama : ");
//            String nama = in.next();
//            System.out.print("Masukkan Password : ");
//            String password = in.next();
//            cekdata = user.cekdataAkun(nama, password);
//            System.out.println("Selamat datang " + user.getData(cekdata).getNama());
//            do{
//                System.out.println("================");
//                System.out.println("    MENU        ");
//                System.out.println("1. Lihat Film"); 
//                System.out.println("2. Cetak Struk"); 
//                System.out.println("3. Update Data"); 
//                System.out.println("Masukkan Pilihan : ");
//                pil = in.nextInt();
//                switch(pil){
//                    case 1 : 
//                        lihat_film(); 
//                        break;
//                    case 2 :
//                        viewStruk(); 
//                        break;
//                    case 3 : 
//                        update();
//                        break;
//                }
//            }while(pil<=2);
//        }catch(Exception e){
//            System.out.println("Password yang anda masukkan salah");
//        }
//    }
//    private static void lihatfilm(){
//        String film[] = {"The Boy", "Toy Storhehe", "Man in Pink"};
//        String hari[] = {"Senin", "Selasa", "Rabu"};
//        String waktu[]  = {"10.00", "12.00", "16.00"};
//        String sesi[] = {"1", "2", "3"};
//        for(int i=0; i < film.length; i++){
//            akun.insert(film[i], hari[i], sesi[i], waktu[i]);
//        }
//    }
//    private static void lihat_film(){
//        System.out.println("List Film : ");
//        for(int i=0;i< 3 ;i++){
//            System.out.println(i+1);
//            System.out.println("=============================");
//            System.out.println("Film : " + akun.getData(i).getFilm());
//            System.out.println("Hari : " + akun.getData(i).getHari());
//            System.out.println("Sesi : " + akun.getData(i).getSesi());
//            System.out.println("Waktu : " + akun.getData(i).getWaktu());
//            System.out.println("=============================");
//        }
//        System.out.println("Masukkan List Film yang ingin anda daftar : ");
//        int film = in.nextInt();
//        loop++;
//        akun.getData(loop).setIndexfilm(cekdata);
//        akun.getData(loop).setIndex(film -1);
//        System.out.println("Akun untuk Film" + akun.getData(akun.getData(loop).getIndex()).getNama() + "Berhasil Terdaftar");
//    }
//    
//    static void viewStruk(){
//        System.out.println("Film yang anda pilih : ");
//        if(loop > 0){
//            System.out.println("Belum, ada akun yang terdaftar");
//        }
//        else{
//            for(int i = 0;i<= loop;i++){
//                if(akun.getData(i).indexfilm == cekdata){ 
//                    System.out.println("==========================");
//                    System.out.println("Film : " + akun.getData(akun.getData(loop).getIndex()).getNama());
//                    System.out.println("Sesi : " + akun.getData(akun.getData(loop).getIndex()).getSesi());
//                    System.out.println("Hari : " + akun.getData(akun.getData(loop).getIndex()).getHari());
//                    System.out.println("Waktu : " + akun.getData(akun.getData(loop).getIndex()).getWaktu());
//                }
//            }
//        }
//        System.out.println("Masukkan Akun yang ingin di cetak : ");
//        int cetak = in.nextInt();
//        System.out.println("Nama : " + akun.getData(cekdata).getNama());
//        System.out.println("========================================");
//        System.out.println("Film : " + akun.getData(cetak -1 ).getNama());
//        System.out.println("Sesi : " + akun.getData(cetak - 1).getSesi());
//        System.out.println("Hari : " + akun.getData(cetak - 1 ).getHari());
//        System.out.println("Waktu : " + akun.getData(cetak - 1).getWaktu());
//        System.out.println("==========================================");
//        akun.delete(cetak - 1);
//        loop--;
//    }
//    private static void update(){
//        try{
//            System.out.println("=======================");
//            System.out.println("List Data yang ingin dirubah : ");
//            System.out.println("========================");
//            System.out.println("1. Nama ");
//            System.out.println("2. Password");
//            System.out.println("3. Nomor telepon");
//            System.out.println("4. Tanggal Nonton");
//            System.out.print("Masukkan Nomor Data yang ingin dirubah : ");
//            int pilih = in.nextInt();
//            switch (pilih) {
//                case 1:
//                    System.out.print("Masukkan Nama baru : ");
//                    String newnama = in.next();
//                    user.getData(cekdata).setNama(newnama);
//                    System.out.println("Nama berhasil diupdate");
//                    break;
//                case 2:
//                    System.out.print("Masukkan Password baru : ");
//                    String newpassword = in.next();
//                    user.getData(cekdata).setPassword(newpassword);
//                    System.out.println("Password berhasil diupdate");
//                    break;
//                case 3:
//                    System.out.print("Masukkan Nomor Telepon baru :");
//                    String newnotelp = in.next();
//                    user.getData(cekdata).setNomor(newnotelp);
//                    System.out.println("No telp berhasil diupdate");
//                    break;
//                case 4:
//                    System.out.print("Masukkan Tanggal Nonton baru : ");
//                    Date newtglnonton = new Date(in.next());
//                    user.getData(cekdata).setTanggalLahir(newtglnonton);
//                    System.out.println("tanggal Nonton berhasil diupdate");
//                    break;
//            }
//        }catch(Exception e){
//        }
//    }
//}