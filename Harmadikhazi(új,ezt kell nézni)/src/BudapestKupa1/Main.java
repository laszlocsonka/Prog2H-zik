/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BudapestKupa1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());       
        bp=new Budapest[n];
               
        for(int i=0;i<n;i++){
        String sor=sc.nextLine();
        String st[]=sor.split(";");  
        int ev=Integer.parseInt(st[0]);
        int honap=Integer.parseInt(st[1]);
        int nap=Integer.parseInt(st[2]); 
        Date datum=new Date(ev-1900,honap-1,nap);
        
        
        int sum=0;
        for (int j=4;j<st.length;j++) {
             sum+= Integer.parseInt(st[j]);
         }
        bp[i]=new Budapest(datum,st[3],sum);     
        
        }     
        System.out.println("\n");  
        rendez(bp);
  
        DateFormat formatter = new SimpleDateFormat("yyyy;MM;dd");
        Budapest[] b=max(bp);
        
        for(int x=0;x<b.length;x++){         
            System.out.println(formatter.format(b[x].getDatum())+";"+b[x].getTura_neve());
    }
        
    }
    private static Budapest [] bp;
    
    /////

    public static Budapest kismax(Budapest [] k){
        Budapest max=new Budapest(new Date(),"semmi",0);
        for(int i=0;i<k.length;i++){
            
            Budapest j=(Budapest) k[i];
            if(j.getResztav()>max.getResztav()){
                max=j;          
            }
        }
        return max;
        
    }
    
    public static Budapest [] max(Budapest [] t){    
        Budapest bps=kismax(bp);
        int count=0;
        for(int i=0;i<t.length;i++){
             Budapest p=(Budapest) t[i];            
                 if(p.getResztav()==bps.getResztav()){
                     count++; //megszámolom hány olyan objektum van amely max
                 }                               
        }
       
    Budapest[] budapest=new Budapest[count]; // létrehoztunk egy tömböt amely megszámolja hány olyan objektum van ,ami max
     int k=0;
     for(int i=0;i<t.length;i++){
         Budapest p=(Budapest) t[i];            
                 if(p.getResztav()==bps.getResztav()){
                     budapest[k]=p;
                     k++;
                 }
             }          
        
     return budapest;
    }
    
    /////
  
    private static void rendez(Budapest [] b){
        for(int i=0;i<b.length-1;i++)
            for(int j=i+1;j<b.length;j++)
                if(b[i].getDatum().compareTo(b[j].getDatum())>0){
                    Budapest tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                }else if(b[i].getDatum().compareTo(b[j].getDatum())==0){
                    if(b[i].getTura_neve().compareTo(b[j].getTura_neve())>0){
                        Budapest tmp=b[i];
                        b[i]=b[j];
                        b[j]=tmp;
                    }
                }    
    
    
}
}
