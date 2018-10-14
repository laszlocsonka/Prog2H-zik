/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Angol_magyar;

import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        szot=new Szotar[n];
        
        for(int i=0;i<n;i++){
            String sor=sc.nextLine();
            String st[]=sor.split(":");
            szot[i]=new Szotar(st[0],st[1]);
        }
        
        System.out.println("\n");
        rendez(szot);
        kiir(szot);
    }
    
    
    
    private static Szotar szot[];
    
    private static void kiir(Szotar []sz){
        for(int i=0;i<sz.length;i++){
            System.out.println(sz[i]);
        }
    }
    
    private static void rendez(Szotar [] sz){
        for(int i=0;i<sz.length-1;i++)
            for(int j=i+1;j<sz.length;j++)
                if(sz[i].getAngol_szo().compareTo(sz[j].getAngol_szo())>0){
                    Szotar tmp=sz[i];
                    sz[i]=sz[j];
                    sz[j]=tmp;
                }else if(sz[i].getAngol_szo().equals(sz[j].getAngol_szo())){
                    if(sz[i].getMagyar_szo().compareTo(sz[j].getMagyar_szo())>0){
                        Szotar tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;
                    }
                }
    }
    
}
