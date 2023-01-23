package Model;
import Entity.AkunEntity;        
import java.util.ArrayList;
public class FilmModel{
    private ArrayList<AkunEntity> akunEntityArrayList;
    public FilmModel(){
        akunEntityArrayList = new ArrayList<AkunEntity>();
    }
    public void insert(AkunEntity akunEntity){
        akunEntityArrayList.add(akunEntity);
    }
    public AkunEntity getIndex(int index){
        return akunEntityArrayList.get(index);
    }
    public void delete(int index){
        akunEntityArrayList.remove(index);
    }
}