/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jégkorongmérkőzések;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Mérkőzés implements Comparable<Mérkőzés>{
    int pont;
    String csapatnev;
    int gólok;
    private List<Mérkőzés> mérk;

    public Mérkőzés(int pont, String csapatnev,int gólok) {
        this.pont = pont;
        this.csapatnev = csapatnev;
        this.gólok=gólok;
        this.mérk=new ArrayList<>();
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public String getCsapatnev() {
        return csapatnev;
    }

    public void setCsapatnev(String csapatnev) {
        this.csapatnev = csapatnev;
    }

    public int getGólok() {
        return gólok;
    }

    public void setGólok(int gólok) {
        this.gólok = gólok;
    }

    
    
    public List<Mérkőzés> getMérk() {
        return mérk;
    }

    public void setMérk(List<Mérkőzés> mérk) {
        this.mérk = mérk;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Mérkőzés)){
            return false;
        }else{
            Mérkőzés mrk=(Mérkőzés) obj;
            return this.csapatnev.equals(mrk.getCsapatnev()) &&
                    this.pont==mrk.getPont()&&
                    this.gólok==mrk.getGólok()&&
                    Objects.equals(this.mérk,mrk.getMérk());
        }
    }
    
    

    @Override
    public String toString() {
        return csapatnev+": "+pont+" ("+gólok+" scored goals)";
    }

    @Override
    public int compareTo(Mérkőzés t) {
        if(this.pont==t.getPont()){
            if(this.gólok==t.getGólok()){
                return this.csapatnev.compareTo(t.getCsapatnev());
            }else{
                return (-1)*Integer.compare(this.gólok,t.getGólok());
            }
        }else{
            return (-1)*Integer.compare(this.pont,t.getPont());
        }
    }
    
    
}
