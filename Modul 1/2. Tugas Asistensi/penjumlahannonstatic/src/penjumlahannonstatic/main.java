/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjumlahannonstatic;

/**
 *
 * @author Megcip
 */
public class main {
    public static void main(String[] args){
        Penjumlahannonstatic myClass = new Penjumlahannonstatic();
        myClass.angka1 = 3;
        myClass.angka2 = 2;
        int hasil_penjumlahan = myClass.penjumlahan();
        System.out.println("Hasil Penjumlahan: " + hasil_penjumlahan);
    }
}
