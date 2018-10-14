/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Gyerek {
    private String nev;
    private String x;

    public Gyerek(String nev, String x) {
        this.nev = nev;
        this.x = x;
    }

    public String getNev() {
        return nev;
    }

    public String getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Gyerek{" + "nev=" + nev + ", x=" + x + '}';
    }
    
    
    
}
