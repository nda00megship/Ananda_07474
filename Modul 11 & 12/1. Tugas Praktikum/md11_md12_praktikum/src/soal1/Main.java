package soal1;

public class Main {
    public static void main(String[] args) {
        bangunDatar luass = new bangunDatar();
        
        System.out.println("=== Ini adalah semua luas bangun datar ===");
        System.out.println("output");
        System.out.println("Luas Lingkaran: "+luass.luasLingkaran(0));
        System.out.println("Luas Segitiga: "+ luass.luasSegitiga(0, 0));
        System.out.println("Luas Persegi: "+ luass.luasPersegi(0));
        System.out.println("Luas Persegi Panjang: " + luass.luasPersegiPanjang(0, 0));
    }
}
