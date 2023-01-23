package Controller;

import Entity.AkunEntity;

public class FilmController {
    public FilmController(){
    }
    
    public AkunEntity getData(int index){
        return AllObjectModel.filmModel.getIndex(index);
    }
    public void insert(String film, String hari, String sesi, String waktu){
        AllObjectModel.filmModel.insert(new AkunEntity(film, hari, sesi,  waktu));
    }
    public void delete(int index){
        AllObjectModel.filmModel.delete(index);
    }
}
