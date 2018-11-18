/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyolcadik;

import java.util.Random;

/**
 *
 * @author LacGep
 */
public class tomb {
    public static void main(String[] args) {         
        
        valoszam vsz = new valoszam();
        
        Random rand = new Random();
        
        for(int i=0;i<10;i++){            
            vsz.add(rand.nextDouble()+rand.nextInt());
        }
        
        vsz.add(135.54);
        vsz.delete(9);
        
        for(int i=0;i<10;i++){ 
        System.out.println(vsz.get(i));
        }
        
    }   
}
