/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author LacGep
 */
public class Dolgozat implements Pontozhato{
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(this.pontszam>35){
           return true;
       }else if(this.pontszam==-1){
           System.out.println("Nem írt");
           return false;
           
       }else{
           return false;
       }
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Dolgozat pontszam: " + pontszam;
    }
    
   
    
}
