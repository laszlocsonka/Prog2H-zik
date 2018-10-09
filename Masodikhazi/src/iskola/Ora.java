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
    private  static String nev;
    private int kezdet;

    public Ora(int kod,String nev, int kezdet) {
        this.kod = kod;
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
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", t=" + kezdet + '}';
    }
}
