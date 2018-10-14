/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Másfélmillió;

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
    mil=new Millio[n];

    for(int i=0;i<n;i++){
        String sor=sc.nextLine();
        String st[]=sor.split(";");
        mil[i]=new Millio(st[0],st[1]);
            }
    
    rendez(mil);
    kiir(mil);
    
    }
    
    private static void rendez(Millio []m){
        for(int i=0;i<m.length-1;i++)
            for(int j=i+1;j<m.length;j++)
                if(KekSzama(m[i])<KekSzama(m[j])){
                    Millio tmp=m[i];
                    m[i]=m[j];
                    m[j]=tmp;
                }else
                    if(KekSzama(m[i])==KekSzama(m[j])){
                        if((PirosakSzama(m[i])+ZoldekSzama(m[i])+SargakSzama(m[i]))==(PirosakSzama(m[j])+ZoldekSzama(m[j])+SargakSzama(m[j]))){
                            if(m[i].getNev().compareTo(m[j].getNev())>0){
                                Millio tmp=m[i];
                                m[i]=m[j];
                                m[j]=tmp;
                            }
                        }else 
                            if((PirosakSzama(m[i])+ZoldekSzama(m[i])+SargakSzama(m[i]))<(PirosakSzama(m[j])+ZoldekSzama(m[j])+SargakSzama(m[j]))){
                                Millio tmp=m[i];
                                m[i]=m[j];
                                m[j]=tmp;
                            }
                    }
    }
    
    private static int KekSzama(Millio kek){
        String findString="K"; 
        int firstIndex=0;
        String str=kek.getUtvonal();
        int count=0;
        while(firstIndex!=-1){   //-1 et ad vissza az indexOf ha már nincs mit keresni ugymond 
            firstIndex=str.indexOf(findString, firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length(); // első kör után 2 lesz a first indexem majd visszameg a while-ra
            }
        }
        return count;
    }
     
    private static int ZoldekSzama(Millio zold){
        String findString="Z";
        int firstIndex=0;
        String str=zold.getUtvonal();
        int count=0;
        while(firstIndex!=-1){
            firstIndex=str.indexOf(findString,firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length();
            }
        }
        return count;
    }
    
    private static int SargakSzama(Millio sarga){
        String findString="S";
        int firstIndex=0;
        String str=sarga.getUtvonal();
        int count=0;
        while(firstIndex!=-1){
            firstIndex=str.indexOf(findString,firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length();
            }
        }
        return count;
    }
    
    private static int PirosakSzama(Millio piros){
        String findString="P";
        int firstIndex=0;
        String str=piros.getUtvonal();
        int count=0;
        while(firstIndex!=-1){
            firstIndex=str.indexOf(findString,firstIndex);
            if(firstIndex!=-1){
                count++;
                firstIndex=firstIndex+findString.length();
            }
        }
        return count;
    }
    
    private static Millio mil[];
    
    
    public static void kiir(Millio k[]){
        for(int i=0;i<k.length;i++){
            System.out.println(k[i]);
        }
    }
    
    
}
