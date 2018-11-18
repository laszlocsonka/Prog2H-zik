/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizedik;

import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Auto implements Comparable<Auto>{
    public String rendszam;
    public int teljesitmeny;
    public boolean automata;
    public int db=0;
    public String []extrak;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
        db++;
    }

    public String[] extradelet(String s) {
        for(int i=0; i< this.extrak.length;i++)
            if(this.extrak[i].equals(s)){
                this.extrak[i]=null;
                for(int j=i+1;j<this.extrak.length;j++){
                    this.extrak[i]=this.extrak[j];
                    i++;
                }
            }
    return extrak;
        
    }
    
    public void setExtrak(String[] extrak) {
        this.extrak = extrak;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }
    StringBuffer string = new StringBuffer();
    @Override
    public String toString() {
        return "Auto: " + string.append(rendszam+" "+ teljesitmeny+ " "+automata);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.rendszam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Auto)) {
            return false;
        }
        Auto a=(Auto)obj;
        return this.rendszam==a.rendszam;
    }

    public int getDb() {
        return db;
    }
    
    public Auto namelyikanagyobb(Auto egyik, Auto masik)
    {
        if(egyik.teljesitmeny>masik.teljesitmeny)
            return egyik;
        return masik;
    }


    @Override
    public int compareTo(Auto o) {
        return this.teljesitmeny-o.teljesitmeny;
    }

 
}
