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
    private Ora []t;
    private int darab;

    public Orarend(String nap, Ora[] t, int darab) {
        this.nap = nap;
        this.t = t;
        this.darab = darab;
    }

    public Orarend(String nap) {
        this.nap = nap;
        this.darab=0;
        this.t=new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getT() {
        return t;
    }

    public void setT(Ora[] t) {
        this.t = t;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", t=" + Arrays.toString(t) + ", darab=" + darab + '}';
    }
    
}
