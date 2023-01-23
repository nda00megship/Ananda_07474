package main;
//import kampus1.*;
//import kampus1.Dosen;
//import kampus1.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        kampus1.Dosen dosen = new kampus1.Dosen("Pak Bambang","123");
        dosen.display();
        
        kampus1.Mahasiswa mhs = new kampus1.Mahasiswa("Ananda","0747");
        mhs.display();
    }
}
