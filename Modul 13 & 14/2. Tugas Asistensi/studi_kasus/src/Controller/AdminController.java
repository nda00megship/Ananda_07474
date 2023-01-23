package Controller;

import java.util.ArrayList;
import java.util.Date;

import Entity.AdminEntity;
import Entity.daftarpemesan;
import Entity.PembeliEntity;
import java.util.ArrayList;

public class AdminController implements ControllerInterface {
    int indexLogin = 0;
    public AdminController() {
    }
    
    public void dataPenjual() {
        String namaPenjual[] = {"Min1","Min2","Min3"};
        String passwordPenjual[] = {"1","2","3"};
        String bios[] = {"Bios1","Bios2","Bios3"};
        
        for (int i=0; i<namaPenjual.length;i++) {
            AllObjectModel.penjual.inserPenjual(new AdminEntity(namaPenjual[i], passwordPenjual[i], bios[i]));
        }
    }
    public void viewpenjual() {
        AllObjectModel.penjual.view();
    }
    
    public void listPembeliBaju() {
        AllObjectModel.daftar.view();
    }
    
    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel.penjual.cekData(nama, password);
    }
    
    public AdminEntity penjualEntity() {
        return AllObjectModel.penjual.showDataPenjual(indexLogin);
    }
    
    public void updateIsVerified(int index, int indexBaju, PembeliEntity pembeliEntity) {
        AllObjectModel.daftar.updateIsVerified(index, new daftarpemesan(pembeliEntity, true, indexBaju));
    }
    
    public ArrayList<daftarpemesan> cekDaftarModel() {
        return AllObjectModel.daftar.getDaftarArrayList();
    }
}