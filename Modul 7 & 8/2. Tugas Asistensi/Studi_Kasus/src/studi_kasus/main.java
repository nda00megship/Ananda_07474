package studi_kasus;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class main {
    
    static ArrayList<User> dataUser = new ArrayList();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("Selamat Datang di Bioskop Meguy");
        System.out.println("===============================");
        int pil;
        do{
            System.out.println("== The Menu ==");
            System.out.println("--------------------");
            System.out.println("1. Daftar User");
            System.out.println("2. Login");
            System.out.println("3. Delete Data");
            System.out.println("4. Exit");
            System.out.println("--------------------");
            System.out.print("Pilih menu : ");
            pil = input.nextInt();
            switch(pil){
                case 1 -> daftar_user();
                
                case 2 -> {
                    System.out.print("Username : ");
                    String username = input.next();
                    System.out.print("Password : ");
                    String password = input.next();
                    view(username, password);
                }
                case 3 -> {
                    if(dataUser.isEmpty() == true){
                        System.out.println("Tidak ada data !");
                        String nama = input.nextLine();
                    }
                    else{
                        lihatAkun();
                        System.out.println("Masukkan Nama Depan : ");
                        String nama = input.next();
                        int index = 0, flag =0;
                        for (User data : dataUser){
                            if (data.getNama().equals(nama)){
                                flag = 1;
                                dataUser.remove(index);
                                break ;
                            }
                            index++;
                        }
                        if (flag==0) {
                            System.out.println("Data Tidak Di temukan");
                        }
                    }
                }
                case 4 -> System.out.println("Terimakasih telah mengunkungi program kami");
            }
        }while(pil != 3);
    }
    
    static void daftar_user(){
        System.out.print("Username : ");
        String nama = input.next();
        System.out.print("Kode Akun : ");
        String kode = input.next();
        System.out.print("Password : ");
        String password = input.next();
        System.out.print("Nomor Handphone : ");
        String nomor = input.next();
        System.out.print("Film : ");
        String film = input.next();
        System.out.print("Hari : ");
        String hari = input.next();
        System.out.print("Tanggal (mm/dd/yyyy) : ");
        Date tanggal = new Date(input.next());
        System.out.print("Sesi : ");
        String sesi = input.next();
        System.out.print("Jam : ");
        String jam = input.next();
        
        dataUser.add(new User(nama, kode, password, nomor, film, hari, tanggal, sesi, jam));
    }
    
    static void view(String username, String password) {
        for(int i = 0; i < dataUser.size(); i++){
            if(username.equals(dataUser.get(i).getNama()) && password.equals(dataUser.get(i).getPassword())){
                System.out.println("--------------------------");
                System.out.println("Your Data  : ");
                System.out.println("--------------------------");
                System.out.println("Username : " + dataUser.get(i).getNama());
                System.out.println("Kode : " + dataUser.get(i).getKode());
                System.out.println("Nomor Handphone : " + dataUser.get(i).getNomor());
                System.out.println("Film : " + dataUser.get(i).getFilm());
                System.out.println("Hari : " + dataUser.get(i).getHari());
                System.out.println("Tanggal : " + new SimpleDateFormat("dd-mm-yyyy").format(dataUser.get(i).getTanggal()));
                System.out.println("Sesi : " + dataUser.get(i).getSesi());
                System.out.println("Jam : " + dataUser.get(i).getJam());
                System.out.println("---------------------------");
            }
            else{
                System.out.println("Username atau Password anda salah");
            }
        }
    }
    
    static void lihatAkun(){
        System.out.println("Your Data");
        System.out.println("============");
        for(User data : dataUser){
           System.out.println("Nama : " + data.getNama());
           System.out.println("Password :  " + data.getPassword());
           System.out.println("Nomor Handphone : " + data.getNomor());
        }
        System.out.println("============");
    }
}