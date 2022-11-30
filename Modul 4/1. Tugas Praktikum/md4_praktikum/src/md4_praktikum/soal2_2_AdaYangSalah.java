package md4_praktikum;

class Segitiga{
    int alas = 10;
    int tinggi = 12;
    
    void luas(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    void tampil(){
        int luas = (this.alas*this.tinggi)/2;
        System.out.println("luas\t: " + luas);
    }
}

public class soal2_2_AdaYangSalah {
    public static void main(String[] args){
        Segitiga obj_segitiga = new Segitiga();
        
        obj_segitiga.tampil();
    }
}
