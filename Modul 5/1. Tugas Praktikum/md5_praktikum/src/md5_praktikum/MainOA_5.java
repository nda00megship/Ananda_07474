package md5_praktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOA_5 {
    
    public MainOA_5(int[] MainOA_5){
        Scanner input = new Scanner(System.in);
        ArrayList<OperasiArray> data=new ArrayList<OperasiArray>();
        ArrayList<biodata> data_2 = new ArrayList<biodata>();
        int pertama, kedua;
        
        System.out.print("Masukkan Angka Pertama: ");
        pertama = input.nextInt();

        System.out.print("Masukkan Lebar PP: ");
        kedua = input.nextInt();
            
        System.out.println("");
            
        OperasiArray anjay = new OperasiArray(pertama, kedua);
        input
    }
}
