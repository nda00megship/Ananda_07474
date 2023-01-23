package soal2;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Input Operasi");
            String angkaStr = input.nextLine();

            String[] inputUser = angkaStr.split(" ");
        
            int angka1 = Integer.parseInt(inputUser[0]);
            String operator = inputUser[1];
            int angka2 = Integer.parseInt(inputUser[2]);
        
            switch (operator){
                case "+":
                int hasil = angka1 + angka2;
                System.out.println("Hasil " + hasil);
                break;
            }
        }catch (Exception e){
            System.out.println("Terdapat kesalahan pada : " + e);
        }
    }
}

////dibawah ini soalnya
//public class Kalkulator {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Input Operasi: ");
//        String angkaStr = input.nextLine();
//        
//        String[] inputUser = angkaStr.split(" ");
//                
//        int angka1 = Integer.parseInt(inputUser[0]);
//        String operatot = inputUser[1];
//        int angka2 = Integer.parseInt(inputUser[2]);
//        
//        switch (operator){
//            case "+":
//                int hasil = angka1 + angka2;
//                System.out.println("Hasil "+ hasil);
//                break;
//                //case...
//        }  
//    }
//}