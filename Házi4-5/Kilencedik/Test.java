/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kilencedik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LacGep
 */
public class Test {
     public static void main(String[] args) {
        List<Hatizsak> tatyi=new ArrayList<>();
        tatyi.add(new Hatizsak("Puma",2.5,5,true));
        tatyi.add(new Hatizsak("Adidas",2,6,true));
        tatyi.add(new Hatizsak("Nike",10,3,true));
        tatyi.add(new Hatizsak("Puma",2.8,1,false));
        tatyi.add(new Hatizsak("Adidas",3,5,true));
        tatyi.add(new Hatizsak("Puma",2.5,5,false));
        tatyi.add(new Hatizsak("Budmil",2.5,5,true));
        tatyi.add(new Hatizsak("Budmil",4.1,8,true));
        tatyi.add(new Hatizsak("Puma",5,5,true));
        tatyi.add(new Hatizsak("Adidas",3.4,4,true));
        tatyi.add(new Hatizsak("Puma",1.8,2,false));
        tatyi.add(new Hatizsak("Nike",2.5,5,true));
        
        rendez(tatyi);
        
    }
    
    public static void rendez(List<Hatizsak>taska)
    {//hiányzik a névsorba rendezés

        Hatizsak nevtmp;
         Hatizsak[] hati= taska.toArray(new Hatizsak[taska.size()]);
         
        for(int i=0;i<hati.length;++i)
            { 

            for(int j=i+1;j<hati.length;++j)
                
            {
                if(hati[i].comperTo(hati[j])>0)
                {
                    nevtmp=hati[i];
                    hati[i]=hati[j];
                    hati[j]=nevtmp;
                    
                
                }
            
            }
            
        }
        for(Hatizsak i: hati)
            System.out.println(i);
        
    }
}
