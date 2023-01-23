package soal4;

public class Main implements AdaYangSalah{
    public void iniMethod(int iniParam){
        System.out.println(iniParam);
    }
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.iniMethod(10);
    }
}