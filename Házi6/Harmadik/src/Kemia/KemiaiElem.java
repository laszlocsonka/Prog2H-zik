/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kemia;

/**
 *
 * @author LacGep
 */
public class KemiaiElem implements ReakcioKepes{

    
    public String vegyjel;
    public String rendszám;
    public int főcsoport;
    
    
    @Override
    public boolean reakciobaLephet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public KemiaiElem() {
        
    }
    
    public KemiaiElem(String vegyjel, String rendszám, int főcsoport) {
        this.vegyjel = vegyjel;
        this.rendszám = rendszám;
        this.főcsoport = főcsoport;
    }

    public String getVegyjel() {
        return vegyjel;
    }

    public void setVegyjel(String vegyjel) {
        this.vegyjel = vegyjel;
    }

    public String getRendszám() {
        return rendszám;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    public int getFőcsoport() {
        return főcsoport;
    }

    public void setFőcsoport(int főcsoport) {
        this.főcsoport = főcsoport;
    }
    
    
}
