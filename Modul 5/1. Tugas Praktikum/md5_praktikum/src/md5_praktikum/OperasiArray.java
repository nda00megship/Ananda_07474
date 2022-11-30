package md5_praktikum;

public class OperasiArray {
    int[] arrayAngka;
    int pertama, kedua;
    
    public OperasiArray(int[] arrayAngka){
        this.arrayAngka = arrayAngka;
    }
    
    void totalAngka(){
        int total = pertama+kedua;
        System.out.println("Total Angka = " + total);
    }
    
    void rerataAngka(){
       int rerataAngka = kedua/pertama;
        System.out.println("Rata-rata Angka: " + rerataAngka);
    }
}
