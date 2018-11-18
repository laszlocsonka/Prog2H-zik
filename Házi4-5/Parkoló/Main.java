/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parkoló;

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
        List<Parkoló> lista=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        while(sor.length()>0){
            String[] d=sor.split(";");
            if(d.length>=4){
            Parkoló p=new Parkoló(d[0], (int) Float.parseFloat(d[1]),Integer.parseInt(d[2]),d[3]);
            for(int j=0;j<lista.size();j++){
                int hely=(lista.get(j).kapacitas)-((d.length)-4);
                lista.set(j, p);
                
            }
            lista.add(p);
            
        }else{
                Parkoló p1=new Parkoló(d[0], (int) Float.parseFloat(d[1]),Integer.parseInt(d[2]));
//            for(int j=0;j<lista.size();j++){
////                int hely=(lista.get(j).kapacitas)-((d.length)-4);
////                lista.set(j, p1);
//                
//            }
            lista.add(p1);
            }
            
            sor=sc.nextLine();
        }
        Collections.sort(lista);
            for(Parkoló x:lista){
            System.out.println(x);
        }
    }
}
