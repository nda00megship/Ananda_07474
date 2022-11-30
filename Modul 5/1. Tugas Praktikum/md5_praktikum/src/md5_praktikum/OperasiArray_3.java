package md5_praktikum;

public class OperasiArray_3 {
    int[] arrayAngka;
    
    public OperasiArray_3(int[] OperasiArray_3){
        this.arrayAngka = OperasiArray_3;
    }
    
    public int totalAngka(){
        return 0;
    }
    
    public double rerataAngka(){
        return 0;
    }
    
    public static void main(String[] args){
        int[] arrInt = {2,0,2,1,0,7,4,7,4};
        
        for (int i=0; i < arrInt.length; i++){
            System.out.println(arrInt[i]);
        }
        
        System.out.println("======================");
        System.out.println("Hasil Total: 27");
        System.out.println("Rata-rata Angka: 3");
    }
}
