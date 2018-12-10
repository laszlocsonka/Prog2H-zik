
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
public class Elelmiszer implements Comparable<Elelmiszer>{
    
    public String csoport;
    public String nev;
    public String egyseg;
    public float egysegAr;
    public int szavatossagiIdo;
    public int mennyiseg=1;
    
    public Elelmiszer(String csoport,String nev,String egyseg,float egysegAr,int szavatossagiIdo,int mennyiseg){
        this.csoport=csoport;
        this.nev=nev;
        this.egyseg=egyseg;
        this.egysegAr=egysegAr;
        this.szavatossagiIdo=szavatossagiIdo;
        this.mennyiseg=mennyiseg;
    }

    public Elelmiszer(String csoport, String nev, String egyseg, float egysegAr, int mennyiseg) {
        this.csoport = csoport;
        this.nev = nev;
        this.egyseg = egyseg;
        this.egysegAr = egysegAr;
        this.mennyiseg = mennyiseg;
    }
    
//    public String getCsoport(){
//        return csoport;
//    }
//    
//    public void setCsoport(String csoport){
//        this.csoport=csoport;
//    }

    public String getCsoport() {
        return csoport;
    }

    public void setCsoport(String csoport) {
        this.csoport = csoport;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEgyseg() {
        return egyseg;
    }

    public void setEgyseg(String egyseg) {
        this.egyseg = egyseg;
    }

    public float getEgysegAr() {
        return egysegAr;
    }

    public void setEgysegAr(float egysegAr) {
        this.egysegAr = egysegAr;
    }

    public int getSzavatossagiIdo() {
        return szavatossagiIdo;
    }

    public void setSzavatossagiIdo(int szavatossagiIdo) {
        this.szavatossagiIdo = szavatossagiIdo;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString(){
        return csoport + nev + egyseg + egysegAr + mennyiseg + szavatossagiIdo;
    }

    @Override
    public int compareTo(Elelmiszer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
