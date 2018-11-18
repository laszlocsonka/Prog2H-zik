/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zárthelyi_eredmények;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Zárthelyi implements Comparable <Zárthelyi>{
    private String név;
    public int pont;
    private List<Zárthelyi> zh;

    public Zárthelyi(String név, int pont) {
        this.név = név;
        this.pont = pont;
        this.zh=new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public List<Zárthelyi> getZh() {
        return zh;
    }

    public void setZh(List<Zárthelyi> zh) {
        this.zh = zh;
    }

    @Override
    public String toString() {
        return név + ": " + pont + " pont";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Zárthelyi)){
            return false;
        }
        Zárthelyi zh=(Zárthelyi) obj;
        return this.név.equals(zh.getNév())&&
                this.pont==zh.getPont()&&
                Objects.equals(this.zh,zh.getZh());
    }

    @Override
    public int compareTo(Zárthelyi t) {
        if(this.pont==t.getPont()){
            return this.név.compareTo(t.getNév());
        }else{
            return (-1)*Integer.compare(this.pont,t.getPont());
        }
    }
    
    
}
