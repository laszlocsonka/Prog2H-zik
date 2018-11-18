
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        
        Bor b[]=new Bor[]{
            new Bor("Piros","Tokaj","jó",30.1) {},
            new Bor("Fehér","Eger","rossz",23.5) {},
            new Aszu(7,"Piros","Tokaj","jó",18.2) {},
            new Bor("Barna","Veszprém","jó",10.4) {},
            new Aszu(4,"Mustár","Balaton","jó",32.8) {},
            new Aszu(5,"Bika","Tokaj","jó",30.1) {},
        };
        
        System.out.println(Arrays.toString(otputtonyosE(b)));
       
    }
    
    
    public static Bor[] otputtonyosE(Bor [] b){
        
      
        
        int count=0;
        for(int i=0;i<b.length;i++){
            if(b[i] instanceof Aszu){
            Aszu p=(Aszu) b[i];
            
                if(p.hanyPuttonyos()==5){
                    count++;
                }
            
            }
        }
        
        Aszu []aszu=new Aszu[count];
        int k=0;
        for(int i=0;i<b.length;i++){
            if(b[i] instanceof Aszu){
            Aszu p=(Aszu) b[i];  
                if(p.hanyPuttonyos()==5){
                    aszu[k]=p;
                    k++;
                    
                }
            
            }
        }
        return aszu;
        
        
    }
    
}
