package Soal1_3;

public class kuda_2 {
    String warna;
    int jmlkaki;

    public kuda(String warnaAwal, int jmlkaki){
        this.jmlkaki = jmlkaki;
        warna = warnaAwal;
    }

    public static void main(String[] args){
        Kuda kuda = new Kuda("coklat, 4");
        System.out.println(kuda.warna);
        System.out.println(kuda.jmlkaki);
    }
}
