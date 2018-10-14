/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vasut;

/**
 *
 * @author LacGep
 */
public class HullamVasut {
    private String vasut_neve;
    private String vilag_neve;
    private int min_magassag;
    private int varakozasi_ido;

    public HullamVasut(String vasut_neve, String vilag_neve, int min_magassag, int varakozasi_ido) {
        this.vasut_neve = vasut_neve;
        this.vilag_neve = vilag_neve;
        this.min_magassag = min_magassag;
        this.varakozasi_ido = varakozasi_ido;
    }

    public String getVasut_neve() {
        return vasut_neve;
    }

    public String getVilag_neve() {
        return vilag_neve;
    }

    public int getMin_magassag() {
        return min_magassag;
    }

    public int getVarakozasi_ido() {
        return varakozasi_ido;
    }

    @Override
    public String toString() {
        return "HullamVasut{" + "vasut_neve=" + vasut_neve + ", vilag_neve=" + vilag_neve + ", min_magassag=" + min_magassag + ", varakozasi_ido=" + varakozasi_ido + '}';
    }
    
    
}
