/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomersekleT;

import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        
       
        Scanner sc=new Scanner(System.in);
        String sor = sc.nextLine();
        String st[] = sor.split(" ");
        int n = Integer.parseInt(st[0]);
        String elsovaros=st[1];  
        hom=new Homerseklet[n];
       
     
        for(int i=0;i<n;i++)
        {
        sor=sc.nextLine();
        st=sor.split(":");
        hom[i]=new Homerseklet(st[0],Integer.parseInt(st[1])); 
        
        }
        
        
        Homerseklet obj=new Homerseklet("semmi",0);
        for(int j=0;j<hom.length;j++){
            if(hom[j].getTelepules().equals(elsovaros)){
                obj=hom[j];          
            }
        }
        
        
        System.out.println("\n");
        rendez(hom);
        for(int x=0;x<hom.length;x++){
            if(hom[x].getHomerseklet()>obj.getHomerseklet()){               
                System.out.println(hom[x]);
            }
            
        }       
    }
    
        private static Homerseklet[] hom;
    

        
        public static void rendez(Homerseklet []k){
            
            for(int i=0;i<k.length-1;i++)
                for(int j=i+1;j<k.length;j++)
                    
                    if(k[i].getHomerseklet()<k[j].getHomerseklet()){
                        Homerseklet tmp=k[i];
                        k[i]=k[j];
                        k[j]=tmp;
                    }else if(k[i].getHomerseklet()==k[j].getHomerseklet()){
                        if(k[i].getTelepules().compareTo(k[j].getTelepules())>0){
                        Homerseklet tmp=k[i];
                        k[i]=k[j];
                        k[j]=tmp;    
                        }
                    }
            
        }
        
        
        
}
