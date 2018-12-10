
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
public class Merleg implements Comparable<Merleg> {
    public String cegnev;
    public String telephely;
    public List<Integer> ev;
    public int bevetel;

    public Merleg(String cegnev, String telephely) {
        this.cegnev = cegnev;
        this.telephely = telephely;
        this.ev = new ArrayList<>();
        this.bevetel = 0;
    }

    public String getCegnev() {
        return cegnev;
    }

    public void setCegnev(String cegnev) {
        this.cegnev = cegnev;
    }

    public String getTelephely() {
        return telephely;
    }

    public void setTelephely(String telephely) {
        this.telephely = telephely;
    }

    public List<Integer> getEv() {
        return ev;
    }

    public void setEv(List<Integer> ev) {
        this.ev = ev;
    }

    

    public int getBevetel() {
        return bevetel;
    }

    public void setBevetel(int bevetel) {
        this.bevetel = bevetel;
    }
    
    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
   
        sb.append(this.cegnev);
        sb.append(" (").append(this.telephely).append("): ");
        sb.append(this.bevetel);
        return sb.toString();
    }

    @Override
    public int compareTo(Merleg t) {
        if (this.getBevetel() == t.getBevetel()){
            if (this.getEv().size() == t.getEv().size()){
                return this.getCegnev().compareTo(t.getCegnev());
            } else {
                return Integer.compare(this.getEv().size(),t.getEv().size());
            }
        } else {
            return -1 * Integer.compare(this.getBevetel(), t.getBevetel());
        }
    }
    

   @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Merleg)){
            return false;
        }
        
        Merleg m = (Merleg) obj;
        
        return this.getCegnev().equals(m.getCegnev()) && this.getTelephely().equals(m.getTelephely());
    }
    
    
    
}
