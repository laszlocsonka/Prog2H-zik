/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullámvasutak;

import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
     public static void main(String[] args) {
         int n;
        Scanner beker=new Scanner(System.in);
        n=Integer.parseInt(beker.nextLine());  
        h= new HullamVasut[n];
        
        for(int i=0;i<n;i++){
            String sor=beker.nextLine();
            String st[]=sor.split(";");            
            int har=Integer.parseInt(st[2]);
            int negy=Integer.parseInt(st[3]);
            h[i]= new HullamVasut(st[0],st[1],har,negy); // 0-> márka 1->panorámaképe
            
        
        }
        
        rendez(h);
        kiir(h);
        
    }
    
    
    private static HullamVasut h[];
    private static void kiir(HullamVasut []t){
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    
    
    
    private static void rendez(HullamVasut []k){
        for(int i=0;i<k.length-1;i++)
            for(int j=i+1;j<k.length;j++)
                if(k[i].getVarakozasi_ido()>k[j].getVarakozasi_ido()){
                    HullamVasut tmp=k[i];
                    k[i]=k[j];
                    k[j]=tmp;
    }else if(k[i].getVarakozasi_ido()==k[j].getVarakozasi_ido()){
        if(k[i].getMin_magassag()==k[j].getMin_magassag()){
            if(k[i].getVasut_neve().compareTo(k[j].getVasut_neve())>0){
                    HullamVasut tmp=k[i];
                    k[i]=k[j];
                    k[j]=tmp;
            }else if(k[i].getMin_magassag()<k[j].getMin_magassag()){
                    HullamVasut tmp=k[i];
                    k[i]=k[j];
                    k[j]=tmp;
                }
            }
        }
   }


}
