/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok2;

/**
 *
 * @author LacGep
 */
public class Szinesz implements Comparable<Szinesz>{
    private String nev;
    private int szul_dat;

    public Szinesz(String nev, int szul_dat) {
        this.nev = nev;
        this.szul_dat = szul_dat;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzul_dat() {
        return szul_dat;
    }

    public void setSzul_dat(int szul_dat) {
        this.szul_dat = szul_dat;
    }


    
    @Override
    public int compareTo(Szinesz t) {
       if(this.szul_dat==t.getSzul_dat()){
           return this.nev.compareTo(t.getNev());
       }else{
           return Integer.compare(this.szul_dat,t.getSzul_dat());
       }
    }

    @Override
    public String toString() {
        return this.szul_dat +": "+ this.nev;
    }
    
    
    
}
