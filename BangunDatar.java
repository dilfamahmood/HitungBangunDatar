
public class BangunDatar {
    private int p;
    private int s;
    private int l;
    
    //konstruktor untuk pesegi
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    //konstruktor untuk bujur sangkar
    BangunDatar(int s){
        this.s = s;
    }
    
    void setPanjangLebar(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setSisi(int s){
        this.s = s;
    }
    
    int getPanjang(){
        return p;
    }
    
    int getLebar(){
        return l;
    }
    
    int getSisi(){
        return s;
    }
}
