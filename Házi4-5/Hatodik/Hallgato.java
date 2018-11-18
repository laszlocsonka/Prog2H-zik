/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem;

import java.util.Random;
import zh.Dolgozat;

/**
 *
 * @author LacGep
 */
public class Hallgato {
     private int mennyitKeszult;
    private boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    public  Dolgozat dolgozatotIr(){
        
        if(sokatTanul==true){
            Random rnd=new Random();
            int random=0;
            random=(rnd.nextInt((7-4)+1)+4)*mennyitKeszult;
            Dolgozat dolgozat=new Dolgozat(random);
            return dolgozat;
        }else if(sokatTanul==false){
            Random rnd=new Random();
            int random=0;
            random=(rnd.nextInt((5-0)+1)+0)*mennyitKeszult;
            Dolgozat dolgozat=new Dolgozat(random);
            return dolgozat;
        }else{
            Dolgozat dolgozat=new Dolgozat(-1);
            System.out.println("Nem írt!");
            return dolgozat;
        }
                  
    }
}
