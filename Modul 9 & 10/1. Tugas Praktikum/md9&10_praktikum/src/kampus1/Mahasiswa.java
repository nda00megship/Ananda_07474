package kampus1;

public class Mahasiswa {
    protected String nama, nip;

    public Mahasiswa(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public void display(){
        System.out.println("Nama : "+ this.nama);
        System.out.println("NIP  : "+ this.nip);
    }
}
