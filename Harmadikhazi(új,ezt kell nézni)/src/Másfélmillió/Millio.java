/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Másfélmillió;

/**
 *
 * @author LacGep
 */
public class Millio {
    private String nev;
    private String utvonal;

    public Millio(String nev, String utvonal) {
        this.nev = nev;
        this.utvonal = utvonal;
    }

    public String getNev() {
        return nev;
    }

    public String getUtvonal() {
        return utvonal;
    }

    @Override
    public String toString() {
        return nev ;
    }
    
    
}
