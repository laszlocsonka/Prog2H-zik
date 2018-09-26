/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
import java.util.Date;
import java.util.Objects;


public class Ital {
    protected String nev;
    protected String kiszereles;
    private static int ar=10;
    protected Date gyartasiDatum;

    public Ital() {
        this.nev="Pepsi";
        this.kiszereles="5 dl";
        this.gyartasiDatum=new Date();
        
    }

    public String getNev() {
        return this.nev;
    }

    public String getKiszereles() {
        return this.kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return this.gyartasiDatum;
    }

    public static void setAr(int ar) {
        Ital.ar = ar;
    }

    @Override
    public String toString() {
        return nev + ", " + kiszereles + ", " + gyartasiDatum;
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
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        if (!Objects.equals(this.kiszereles, other.kiszereles)) {
            return false;
        }
        if (!Objects.equals(this.gyartasiDatum, other.gyartasiDatum)) {
            return false;
        }
        return true;
    }
    
    /*
    public double kerekit(double x){
        return Math.round(x*100.0)/100.0;
    }
    */
    
    public static double getArEuroban(){
        return ar/323;
    }
}
