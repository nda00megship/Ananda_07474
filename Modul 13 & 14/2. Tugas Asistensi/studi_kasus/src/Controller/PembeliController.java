package Controller;

import Entity.daftarpemesan;
import Entity.PembeliEntity;
import javax.swing.table.DefaultTableModel;

public class PembeliController implements ControllerInterface {
    int indexLogin = 0;
    public PembeliController() {
    }
    public PembeliEntity getData() {
        return  AllObjectModel.pemesan.getPembeliEntityArrayList(indexLogin);
    }
    
    public void daftarfilm(int indexfilm,PembeliEntity pembeliEntity,boolean isVerified) {
        AllObjectModel.daftar.insertDataDaftar(new daftarpemesan(pembeliEntity,isVerified, indexfilm));
}

    @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel.pemesan.cekData(nama, password);
    }
    
    public void insert(String nama, String password, String notelp) {
        AllObjectModel.pemesan.insert(new PembeliEntity(nama,password,notelp));
    }
    
    public PembeliEntity pembeliEntity() {
        return AllObjectModel.pemesan.getPembeliEntityArrayList(indexLogin);
    }
    
    public int cekDaftarPemesan(String nama) {
        int cek = AllObjectModel.daftar.cekData(nama, null);
        return cek;
    }
    public daftarpemesan showDaftarPemesan(int index) {
        return AllObjectModel.daftar.showDaftarPemesan(index);
    }
    
    public void update(String Film, int UpdateFilm) {
        AllObjectModel.daftar.update(Film, UpdateFilm);
    }
    
    public void deleteDatapembeli(int index) {
        AllObjectModel.daftar.hapuspembeliModel(index);
    }
    
    public DefaultTableModel daftarpemesan() {
        DefaultTableModel dtmdaftarpemesan = new DefaultTableModel() ;
        Object[] kolom = {"nama","password","notelp","verifikasi"};
        dtmdaftarpemesan.setColumnIdentifiers(kolom);
        int size = AllObjectModel.daftar.alldatapemesan().size();
        String verif = null;
        for(int i=0; i<size;i++){
            if(AllObjectModel.daftar.alldatapemesan().get(i).isIsVerified()==false) {
                verif = "NO";
            } else {
                verif = "DONE";
            }
            Object [] data = new Object[5];
            data[0] = AllObjectModel.daftar.alldatapemesan().get(i).getPembeli().getNama();
            data[1] = AllObjectModel.daftar.alldatapemesan().get(i).getPembeli().getPassword();
            data[2] = AllObjectModel.daftar.alldatapemesan().get(i).getPembeli().getNotelp();
            data[3] = verif;
            dtmdaftarpemesan.addRow(data);
        } 
        return dtmdaftarpemesan;
    }

    public void updateIsVerified(int index, int indexFilm, PembeliEntity pembeli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
