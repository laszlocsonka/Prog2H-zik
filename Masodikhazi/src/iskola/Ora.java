/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

/**
 *
 * @author LacGep
 */
public class Ora {
    private int kod;
    private String nev;
    private int kezdet;

    public Ora(int kod,String nev, int kezdet) {
        this.kod = kod;
        this.nev=nev;
        this.kezdet = kezdet;
    }   

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getK() {
        return kezdet;
    }

    public void setK(int k) {
        this.kezdet = k;
    }

    @Override
    public String toString() {
        return "Kód: " + kod + ", Név: " + nev + ", óra kezdete: " + kezdet+" ///";
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Ora other = (Ora) obj;
        if (this.kod != other.kod) {
            return false;
        }
        if (this.kezdet != other.kezdet) {
            return false;
        }
        return true;
    }
    
    
}
