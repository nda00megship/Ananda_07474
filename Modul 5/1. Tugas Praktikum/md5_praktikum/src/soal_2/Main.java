package soal_2;

public class Main {
    public static void main(String[] args)
    {
        int [] array = {2,0,2,1,7,4,6,1};
        OperasiArray_2 operasiArray;
        operasiArray = new OperasiArray_2(array);

        System.out.println(operasiArray.totalAngka());
        System.out.println(operasiArray.rerataAngka());
    }
}
