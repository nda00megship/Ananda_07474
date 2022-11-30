package soal_2;

public class OperasiArray_2 {
    int[] arrayAngka;
    public OperasiArray_2(int[] arrayAngka) {
        this.arrayAngka = arrayAngka;
    }
    public double totalAngka()
    {
        int total = 0, temp;
        for (int i = 0; i < arrayAngka.length; i++)
        {
            temp = total + arrayAngka[i];
            total = temp;;
        }
        return total;
    }

    public double rerataAngka()
    {
        return totalAngka() / arrayAngka.length;
    }
}
