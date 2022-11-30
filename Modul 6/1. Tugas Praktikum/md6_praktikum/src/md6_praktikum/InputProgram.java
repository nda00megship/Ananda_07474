package md6_praktikum;

import java.util.Scanner;
//soal 2
public class InputProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka : ");
        int num = input.nextInt();
        input.nextLine(); //cuman dikasih ini ges
        System.out.print("Masukkan Kata : ");
        String kata = input.nextLine();
    }
}
