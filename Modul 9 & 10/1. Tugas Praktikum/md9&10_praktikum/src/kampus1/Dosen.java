package kampus1;

public class Dosen {
    private String nama, nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public void display(){
        System.out.println("Nama Dosen : " + this.nama);
        System.out.println("NIP Dosen  : " + this.nip);
    }
}
