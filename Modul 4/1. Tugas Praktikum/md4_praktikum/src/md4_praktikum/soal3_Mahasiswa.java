package md4_praktikum;

class Mahasiswa{
    String namaLengkap;
    String npm;
    char kelamin;
    int semester;

    Mahasiswa(String namalengkap, String npm, char kelamin, int semester){
        this.namaLengkap = namalengkap;
        this.npm = npm;
        this.kelamin = kelamin;
        this.semester = semester;
    }

    void tampil(){
        System.out.println("Nama Lengkap\t: " + namaLengkap);
        System.out.println("NPM \t: " + npm);
        System.out.println("Kelamin\t: " + kelamin);
        System.out.println("semester\t: " + semester);
    }
}

public class soal3_Mahasiswa {
    public static void main(String[] args){
        Mahasiswa simpan = new Mahasiswa("Ananda", "06.2021.1.07474", 'L', 7);
        simpan.tampil();
    }
}
