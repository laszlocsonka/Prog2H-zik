/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Arrays;

/**
 *
 * @author LacGep
 */
public class Orarend {
    private String nap;
    private Ora []oratomb;
    private int darab;

    

    public Orarend(String nap) {
        this.nap = nap;
        this.darab=0;
        this.oratomb=new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getT() {
        return oratomb;
    }

    public void setT(Ora[] t) {
        this.oratomb = t;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    @Override
    public String toString() {
        return "Órarend!-->" + "Tanítási nap: " + nap + ", t=" + Arrays.toString(oratomb) + ", darab=" + darab + '}';
    }
    
    public boolean oratHozzaad(Ora or){
        if (this.darab>=12) {
            return false;
        }else{
            for(int i=0;i<this.darab;i++){
                if(this.oratomb[i].getK()==or.getK()){
                    return false;                       
                }             
                
                }
                this.oratomb[this.darab]=or;
                this.darab++; 
                return true;
            }
        
       
    } 
    
}
