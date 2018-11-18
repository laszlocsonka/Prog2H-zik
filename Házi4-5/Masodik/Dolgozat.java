/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ital;

import java.util.Arrays;

/**
 *
 * @author LacGep
 */
public class Dolgozat {
    public static void main(String[] args) {
         Ital []it =new Ital[]{
         new Ital("Majom1","15dl",355),
         new SzeszesItal("Majom2","5dl",31245,30),
         new Ital("Majom3","45dl",45),
         new SzeszesItal("Majom4","5dl",34545,60),
         new Ital("Majom5","5dl",345),
         new SzeszesItal("Majom6","52dl",77345,10),
         new SzeszesItal("Majom7","51dl",98345,1576),
         };
         
        System.out.println("A három legmagasabb alkoholtartalmú szeszesital");      
        SzeszesItal[]szesz=harom(it);
        System.out.println(szesz[0]);
        System.out.println(szesz[1]);
        System.out.println(szesz[2]);
   
        
    }
    
    private static void kiir(Ital []t){
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    
    public static SzeszesItal[] harom(Ital [] k){
        int count=0;
        for(int i=0;i<k.length;i++){
            if(k[i] instanceof SzeszesItal){
                count++;
            }
        }
        
        SzeszesItal[] sz=new SzeszesItal[count];
        int f=0;
        for(int i=0;i<k.length;i++){
            if(k[i] instanceof SzeszesItal){
                SzeszesItal p=(SzeszesItal)k[i];
                sz[f]=p;
                f++;
            }
        }
        
        if(sz.length<3){
            return null;
        }else{
        
         for(int i=0;i<sz.length-1;i++){    
                for(int j=i+1;j<sz.length;j++){
                    SzeszesItal r=(SzeszesItal)sz[i];
                    SzeszesItal t=(SzeszesItal)sz[j];
                    
                    if(r.getAlkoholTartalom()<t.getAlkoholTartalom()){
                        SzeszesItal tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;
                    }
            }
               
        }
    }
            return sz;
    }
   
    
    
    
 
    
        
}