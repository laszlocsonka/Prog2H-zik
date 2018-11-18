/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kilencedik;

/**
 *
 * @author LacGep
 */
public class Hatizsak implements Comparable<Hatizsak>{
    String marka;
     private double urtartalom;
     private int zsebekSzama;
     private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public boolean isVizhatlan() {
        return vizhatlan;
    }

    public void setVizhatlan(boolean vizhatlan) {
        this.vizhatlan = vizhatlan;
    }
    StringBuffer string = new StringBuffer();
    @Override
    public String toString() {
        return "Hatizsak:" +string.append(marka+" "+zsebekSzama+" "+urtartalom+" "+vizhatlan);
    }

    @Override
    public int comperTo(Hatizsak T) {
    
        if (this.marka.compareTo(T.marka) < 0) 
                       return -1;
                    
              else if((this.marka.compareTo(T.marka) == 0))
                   if(Integer.compare(this.zsebekSzama,T.zsebekSzama) < 0)
                          return 1;
        
        return this.marka.compareTo(T.marka);}
     
     
}
