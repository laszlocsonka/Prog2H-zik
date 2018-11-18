/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztálypénz;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Osztaly implements Comparable<Osztaly>{
    private String nev;
    public int penz;
    private List<Osztaly>osz;

    public Osztaly(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
        this.osz=new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    public List<Osztaly> getOsz() {
        return osz;
    }

    public void setOsz(List<Osztaly> osz) {
        this.osz = osz;
    }

    @Override
    public String toString() {
        return nev + ";" + penz;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Osztaly)){
            return false;
        }
        
        Osztaly os=(Osztaly) obj;
        return this.nev.equals(os.getNev()) &&
                this.penz==os.getPenz() &&
                Objects.equals(this.osz,os.getOsz());
        
    }

   
    

    @Override
    public int compareTo(Osztaly t) {
        if(this.penz==t.getPenz()){
            return this.nev.compareTo(t.getNev());
        }else{
            return (-1)*Integer.compare(this.penz,t.getPenz());
        }
    }
}
