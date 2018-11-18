/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkoló;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Parkoló implements Comparable<Parkoló>{
    String cim;
    float terulet;
    int kapacitas;
    String rendszam;
    private List<Parkoló> parkol;

    public Parkoló(String cim, int terulet, int kapacitas, String rendszam) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.rendszam = rendszam;
        this.parkol=new ArrayList<>();
    }
    public Parkoló(String cim, int terulet, int kapacitas) {
        this.cim = cim;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.parkol=new ArrayList<>();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public float getTerulet() {
        return terulet;
    }

    public void setTerulet(int terulet) {
        this.terulet = terulet;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public List<Parkoló> getParkol() {
        return parkol;
    }

    public void setParkol(List<Parkoló> parkol) {
        this.parkol = parkol;
    }

    @Override
    public String toString() {
        return cim + ": " + kapacitas + " szabad hely";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Parkoló)){
            return false;
        }else{
            Parkoló p=(Parkoló) obj;
            return this.cim.equals(p.getCim())&&
                    this.kapacitas==p.getKapacitas()&&
                        this.rendszam.equals(p.getRendszam())&&
                        this.terulet==p.getTerulet()&&
                        Objects.equals(this.parkol,p.getParkol());
        }
    }

    @Override
    public int compareTo(Parkoló t) {
        if(this.kapacitas==t.getKapacitas()){
            return this.cim.compareTo(t.getCim());
        }else{
            return (-1)*Integer.compare(this.kapacitas,t.getKapacitas());
        }
}
}