
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
public class Fagyi {
    private String iz;
    private int ar;

    public Fagyi(String iz) {
        this.iz = iz;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "Fagylalt{" + "iz=" + iz + ", ar=" + ar + '}';
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Fagyi)){
            return false;
        }
        
        Fagyi f = (Fagyi) obj;
        
        return this.iz.equals(f.getIz());
    }
    
}
