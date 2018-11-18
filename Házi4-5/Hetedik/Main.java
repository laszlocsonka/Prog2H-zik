/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hetedik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author LacGep
 */
public class Main {
    public static List<Lakóház> tágas(List<Lakóház> lh, double térfogat) {
        
        List<Lakóház> l2 = new ArrayList<>();
        for(Lakóház i:lh) 
            if(i.légköbméter()> térfogat)
                l2.add(i);
             
            return l2;
        
        
    }
    
    
    public static void main(String[] args) {
        List<Lakóház> lh= new ArrayList(); //az arraylist osztály konstruktora hívódik meg 
        lh.add(new Lakóház("Egy 1", 12, 5.6));
        lh.add(new Lakóház("Egy 2", 15, 4.6));
        lh.add(new Lakóház("Egy 3", 3, 7.6));
        lh.add(new Lakóház("Egy 4", 2, 17.6));
       
        System.out.println(lh.get(0));
        lh.add(3,new Lakóház("Egy 11", 22, 1.6));
        
        //for (Lakóház i:lh)
            //System.out.println(i);
            
        for(int i=0; i<lh.size(); i++){
            System.out.println(lh.get(i));
        }
    lh.set(0, new Lakóház("Egy 222", 2, 4)); //alapterülethez hozzá kell adni egy settert!!!!!!! (hogy ez működjön)
    
        System.out.println(lh.get(0));
    
        System.out.println(lh.contains(new Lakóház("Egy 222", 2, 4)));
    
    
        System.out.println(lh.lastIndexOf(new Lakóház("Egy 222", 2, 4)));
        
        
        List<Lakóház> l3 = tágas(lh, 55);
        Collections.sort(l3);
        for(Lakóház i:l3)
            System.out.println(i);
 
    }
}
