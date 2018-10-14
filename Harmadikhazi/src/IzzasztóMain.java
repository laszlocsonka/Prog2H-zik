
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fufella
 */
public class IzzasztóMain {
    
    public static Izzasztó iz[];
    public static Izzasztó izzaszt;

    
    public static void rendez(Izzasztó [] iz){
        for(int i=0;i<iz.length-1;i++) {
            for(int j=i+1;j<iz.length;j++) {
                if(iz[i].getFok()<iz[j].getFok()) {
                    Izzasztó tmp=iz[i];
                    iz[i]=iz[j];
                    iz[j]=tmp;
                }
                else if(iz[i].getFok()==iz[j].getFok()) {
                    if(iz[i].getVáros().compareTo(iz[j].getVáros())>0){
                        Izzasztó tmp=iz[i];
                        iz[i]=iz[j];
                        iz[j]=tmp;
                    }
                }
            }
        }
    }
    
    public static void megegyezik(Izzasztó [] iz) {
        int benne=0;
        int f=0;
        for(int i=0;i<iz.length;i++) {
            if(iz[i].getVáros().equals(izzaszt.getVáros())) {
                benne++;
                f=iz[i].getFok();
        }

    }
        if(benne==1){
                    for(int j=0;j<iz.length;j++) {
                        if(f<iz[j].getFok()) {
                            
                        System.out.println(iz[j]);
                        }
                    }
                }
        else{
            System.out.println("Missing data");
        }
    }
    
    public static void kiir(Izzasztó [] iz) {
        for(int i=0;i<iz.length;i++) {
            megegyezik(iz);
            System.out.println(iz[i]);
        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        
        String sor = sc.nextLine();
        String st[] = sor.split(" ");
     
        n=Integer.parseInt(st[0]);
        izzaszt=new Izzasztó(n,st[1]);
        
        
        iz=new Izzasztó[n];
      for(int i=0;i<n;i++) {
           sor=sc.nextLine();
            st=sor.split(":");
            
            iz[i]=new Izzasztó(st[0],Integer.parseInt(st[1]));
      }  
        
        rendez(iz);
        megegyezik(iz);
    }
    
}
