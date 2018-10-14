/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek2;

import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        String st[]=sor.split(";");
        
        int n=Integer.parseInt(st[0]);
        Diak []dk=new Diak[n];
        dk[0] = new Diak(st[1], "");
        
        String X=st[2];
        
        for(int i=1;i<n;i++){
            sor=sc.nextLine();
            st=sor.split(";");
            dk[i]=new Diak(st[0],st[1]);
        }
        
        
        System.out.println("\n");
        rendez(dk);
        for (Diak i : dk) {   
            System.out.println(i);
        }
        pirosKek(dk,X);
    }
    
    
    private static Diak[]dk;
    
   
    private static void rendez(Diak []k){
        for(int i=0;i<k.length-1;i++)
            for(int j=i+1;j<k.length;j++)
                if(k[i].getGyerek().equals(k[j].getElotte())&& j>i+1){
                    Diak tmp=k[i+1];
                    k[i+1]=k[j];
                    k[j]=tmp;
                    
                }
    }
    
    public static void pirosKek(Diak [] d, String ki){
        int piros=0;
        int kek=0;
        
        for(int i=0;i<d.length;i++){
            if(d[i].getGyerek().equals(ki)){
                System.out.println(piros + " " + kek);
                break;
            }else if(i%2==0){
                piros++;
            }else{
                kek++;
            }
        }
    }
}
