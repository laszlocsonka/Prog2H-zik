/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KicsiKatonak;

/**
 *
 * @author LacGep
 */
public class Teszt {
    public static void main(String[] args) {
        Landzsas Jani=new Landzsas(10,15);
        Nyilas Sanyi=new Nyilas(4,17,6);
        Nyilas Pisti=new Nyilas(10,13,8);
        
        Katona elodonto = megkuzd(Jani,Sanyi);
        System.out.println("A bajnok pedig: "+megkuzd(elodonto,Pisti));
    }
    
    public static Katona megkuzd(Katona k1,Katona k2){
        if(k1.getTamado()-k2.getVedo()>k2.getTamado()-k1.getVedo()){
            System.out.println(k1+" küzdött "+k2+" ellen, a győztes pedig "+k1);
            return k1;
        }
        if(k1.getTamado()-k2.getVedo()==k2.getTamado()-k1.getVedo()){
            System.out.println(k1+" küzdött "+k2+" ellen, a győztes pedig "+k1);
            return k1;
        }else{
            System.out.println(k1+" küzdött "+k2+" ellen, a győztes pedig "+k2);
            return k2;
        }
    }
}
