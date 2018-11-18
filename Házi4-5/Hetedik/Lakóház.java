/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hetedik;

import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Lakóház implements Comparable<Lakóház>{
    public static final double emeletMagasság= 3.2;
    private String cím;
    private int emeletSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletSzáma, double alapterület) {
        this.cím = cím;
        this.emeletSzáma = emeletSzáma;
        this.alapterület = alapterület;
    }


    public String getCím() {
        return cím;
    }

    public int getEmeletSzáma() {
        return emeletSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }
    
    
    public double légköbméter(){
        
       return this.alapterület*this.emeletSzáma*emeletMagasság; 
           
    }

    public void setAlapterület(double alapterület) {
        this.alapterület = alapterület;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cím).append(":\n");
        sb.append(this.légköbméter());
        
        return sb.toString();
    }

    @Override
    public int compareTo(Lakóház o) {
        return Double.compare(this.légköbméter(), o.légköbméter());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cím);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Lakóház))
            return false;
        
            Lakóház l = (Lakóház) obj;
            
            return this.cím.equals(l.getCím());
        
    }
 
}
