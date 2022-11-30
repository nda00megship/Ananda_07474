package soal_4;

import java.util.ArrayList;

class Mahasiswa
{
    ArrayList <String> nama = new ArrayList<>();
    ArrayList <String> npm = new ArrayList<>();

    public void setNama(String nama)
    {
        this.nama.add(nama);
    }

    public void setNpm(String npm) {
        this.npm.add(npm);
    }
}
