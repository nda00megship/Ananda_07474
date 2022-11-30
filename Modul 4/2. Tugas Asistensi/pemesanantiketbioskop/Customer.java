
package pemesanantiketbioskop;

public class Customer {
    protected String CustomerNama;
    protected String CustomerHp;
    
    public String getNama(){
        return this.CustomerNama;
    }
    
    public void setNama(String n){
        this.CustomerNama = n;
    }
    
    public String getTelepon(){
        return this.CustomerHp;
    }
    
    public void setTelepon(String t){
        this.CustomerHp = t;
    }
}
