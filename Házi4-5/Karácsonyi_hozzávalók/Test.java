
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Test {
    public static void main(String[] args) {
        
        List<Hozzávalók> sz=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int uresalista=0,voltalistaban,i=0;
        
     
        while(sor.length()>0){
            String [] d=sor.split(";");
            voltalistaban=0;
            if(uresalista==0){
                sz.add(new Hozzávalók(d[0],Integer.parseInt(d[1])));
                uresalista++;
            }else{
                Hozzávalók h=new Hozzávalók(d[0],Integer.parseInt(d[1]));
                for(i=0;i<sz.size();i++){
                    if(sz.get(i).getHozzavalo().compareTo(d[0])==0){
                        voltalistaban++;
                        int mennyi=sz.get(i).mennyiseg;
                        h.mennyiseg+=mennyi;
                        sz.set(i, h);
                        
                    }
                }
                uresalista++;
                if(voltalistaban==0){
                    sz.add(h);
                }
            }
            
             sor=sc.nextLine();
        }
            Collections.sort(sz);
            for(Hozzávalók x:sz){
            System.out.println(x);
    
        }
    }
} 
