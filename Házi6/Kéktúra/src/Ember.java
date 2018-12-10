
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Ember implements Comparable<Ember>{
    private String nev;
    private List<String> hossz;
    

    public Ember(String nev) {
        this.nev = nev;
        this.hossz=new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<String> getHossz() {
        return hossz;
    }

    public void setHossz(List<String> hossz) {
        this.hossz = hossz;
    }
    
    @Override
    public int compareTo(Ember t) {
        Ember e=(Ember) t;
        return this.nev.compareTo(t.getNev());
    }

    @Override
    public String toString() {
        return nev;
    }
    
    
    
    
}
