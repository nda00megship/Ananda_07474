package bioskop;

import java.util.ArrayList;
import java.util.Scanner;

public class studi_kasus {

    static ArrayList<User_Entity> arrUser = new ArrayList<>();
    static Scanner input= new Scanner (System.in);
    
    User_Entity bioskop;
    int menu;
    String film, fnama, lnama, tanggal, noTelp, filmnew;
    
    public studi_kasus(){
   do{
       System.out.println("================================");
       System.out.println("Selamat Datang Di Cinema Bioskop");
       System.out.println("================================");
       System.out.println("1. Pembelian");
       System.out.println("2. List Pembeli");
       System.out.println("3. Remove Pembeli");
       System.out.println("4. Update Data Pembeli");
       System.out.println("5. Exit");
       System.out.println("Pilih Menu: ");
       menu=input.nextInt();
       input.nextLine();
       if (menu==1){
           do{
                System.out.println("Masukkan Film Yang Ingin Di Tonton: ");
                film=input.nextLine();
               
           }while(film.length()<2 || film.length()>10);
           
              System.out.println("Masukkan Nama Depan Anda: ");
              fnama =input.nextLine();
              System.out.println("Masukkan Nama Belakang Anda: ");
              lnama =input.nextLine();
              System.out.println("Masukkan No Telp: ");
              noTelp =input.nextLine();
              System.out.println("Masukkan Tanggal Pemesanan: ");
              tanggal=input.nextLine();
              
              bioskop = new User_Entity(film, fnama, lnama, noTelp,tanggal,filmnew);
              arrUser.add(bioskop);
              
       } else if(menu==2){
           if (arrUser.size()== 0){
               System.out.println("Tidak ada data !");
               input.nextLine();
           } else{
               viewBios();
               input.nextLine();
           }
       } else if (menu ==3){
           if (arrUser.size() == 0){
               System.out.println("Tidak ada data !");
               input.nextLine();
           }else {
               viewBios();
               System.out.println("Masukkan Nama Depan = ");
               fnama= input.nextLine();
               int index = 0, flag =0;
               for (User_Entity Bios : arrUser){
                   if (Bios.getFnama().equals(fnama)){
                       flag = 1;
                       arrUser.remove (index);
                       break ;
                   }
                   index++;
               }
               if (flag==0) {
                   System.out.println("Data Tidak Di temukan");
                   input.nextLine();
               }
           }
       } else if (menu ==4){
           System.out.println("Masukkan Nama Depan = ");
           fnama= input.nextLine();
           System.out.println("Masukkan Data Film yang Di rubah = ");
           filmnew= input.nextLine();
           update (fnama,filmnew);
       }
       
   } while (menu!=5);
   
}    

    private int cari (String fnama){
        int index = -1;
        for (int i=0; i<arrUser.size(); i++){
            if (fnama.equals(arrUser.get(i).fnama)) {
                index = i;
            }
        }
        return index;
    }
    
    public void update(String fnama, String filmnew){
        if (cari(fnama) !=-1){
            arrUser.get(cari(fnama)).film= filmnew;
        }
    }

    public void viewBios(){
        System.out.println("Data Pembeli");
        System.out.println("============");
        for (User_Entity Bios : arrUser){
            System.out.println("Nama            = " + Bios.getFnama()+ " " + Bios.getLnama());
            System.out.println("Judul Film      = " + Bios.film);
            System.out.println("No Telp         = " + Bios.noTelp);
            System.out.println("Tanggal         = " + Bios.tanggal);
        }
        System.out.println("============");
    }
    
    public static void main(String[] args){
        studi_kasus xxi = new studi_kasus();
    }
}


