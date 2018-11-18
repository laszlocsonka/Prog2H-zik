/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zárthelyi_eredmények;

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
        List<Zárthelyi> lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        
        int uresalista=0,voltalistaban,i=0;
        
        while(sor.length()>0){
            String [] d=sor.split(";");
            voltalistaban=0;
            if(uresalista==0){
                lista.add(new Zárthelyi(d[0],Integer.parseInt(d[1])));
                uresalista++;
            }else{
                Zárthelyi o=new Zárthelyi(d[0],Integer.parseInt(d[1]));
                for(i=0;i<lista.size();i++){
                    if(lista.get(i).getNév().compareTo(d[0])==0){
                        voltalistaban++;
                        int mennyi=lista.get(i).pont;
                        o.pont+=mennyi;
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
            for(Zárthelyi x:lista){
            System.out.println(x);
    }
    }
}
