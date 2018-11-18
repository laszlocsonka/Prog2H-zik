/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Osztálypénz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        List<Osztaly> lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int uresalista=0,voltalistaban,i=0;
        
        while(sor.length()>0){
            String [] d=sor.split(";");
            voltalistaban=0;
            if(uresalista==0){
                lista.add(new Osztaly(d[0],Integer.parseInt(d[1])));
                uresalista++;
            }else{
                Osztaly o=new Osztaly(d[0],Integer.parseInt(d[1]));
                for(i=0;i<lista.size();i++){
                    if(lista.get(i).getNev().compareTo(d[0])==0){
                        voltalistaban++;
                        int mennyi=lista.get(i).penz;
                        o.penz+=mennyi;
                        lista.set(i,o);
                        
                    }
                }
                uresalista++;
                if(voltalistaban==0){
                    lista.add(o);
                }
            }
            
             sor=sc.nextLine();
        }
        
            Collections.sort(lista);
            for(Osztaly x:lista){
            System.out.println(x);
    }
}
}
