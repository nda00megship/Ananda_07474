package soal_4;

public class Main
{
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Mega");   mhs.setNpm("06.2021.1.07474");
        mhs.setNama("Bambang");   mhs.setNpm("06.2077.1.6989");
        for (int i=0; i<mhs.nama.size(); i++)
        {
            System.out.println(i+1+".");
            System.out.println("Nama : "+mhs.nama.get(i));
            System.out.println("NPM : "+mhs.npm.get(i));
        }
    }
}
