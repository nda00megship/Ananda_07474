package md4_praktikum;

class segitiga{
     int alas;
     int tinggi;
    
    public segitiga(int a, int t){
    this.alas = a;
    this.tinggi = t;
    }
    double luas(){
    return this.alas*this.tinggi/2;
    }
}

public class soal2_1_segitiga {
    
    public static void main(String[] args){
    segitiga objek = new segitiga(34, 2);
        
    System.out.println("Segitiga : ");
    System.out.println("----------------------------------");
    System.out.println("Luas Segitiga : " + objek.luas());
    
    }
}
