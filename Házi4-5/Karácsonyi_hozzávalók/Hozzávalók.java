
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Hozzávalók implements Comparable<Hozzávalók> {
   private String hozzavalo;
    public int mennyiseg;
    private List<Hozzávalók> hoz;

    public Hozzávalók(String hozzavalo, int mennyiseg) {
        this.hozzavalo = hozzavalo;
        this.mennyiseg = mennyiseg;
        this.hoz=new ArrayList<>();
    }

    public String getHozzavalo() {
        return hozzavalo;
    }

    public void setHozzavalo(String hozzavalo) {
        this.hozzavalo = hozzavalo;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public List<Hozzávalók> getHoz() {
        return hoz;
    }

    public void setHoz(List<Hozzávalók> hoz) {
        this.hoz = hoz;
    }

    @Override
    public String toString() {
        return hozzavalo + ";" + mennyiseg;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hozzávalók other = (Hozzávalók) obj;
        if (this.mennyiseg != other.mennyiseg) {
            return false;
        }
        if (!Objects.equals(this.hozzavalo, other.hozzavalo)) {
            return false;
        }
        if (!Objects.equals(this.hoz, other.hoz)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public int compareTo(Hozzávalók t) {
        if(this.mennyiseg==t.getMennyiseg()){
            return this.hozzavalo.compareTo(t.getHozzavalo());
        }else{
            return (-1)*Integer.compare(this.mennyiseg,t.getMennyiseg());
        }
    }
    
    
    
}
