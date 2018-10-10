/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        int oradb;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Adj meg egy  hétköznapot");
        String nap=sc.nextLine();
        System.out.println("Add meg hány órát szeretnél a naphoz adni");
        oradb=Integer.parseInt(sc.nextLine()); 
        Ora [] tomb =new Ora[oradb];
        Orarend orarend = new Orarend(nap);
        System.out.println("Ezután add meg soronként az aktuális óra adatait, kód név kezdés  alakzatban");
        
    for(int i=0;i<oradb;i++){
        String sor=sc.nextLine();//beolvasunk egy sort
        String st[]=sor.split(" ");
        int kod = Integer.parseInt(st[0]);
	int kezdes = Integer.parseInt(st[2]);
        
        
        if(kezdes<8 && kezdes>=1){
            kezdes=8;
        }else if(kezdes>19 && kezdes<=24){
        kezdes=19;
        }
        
        
        Ora temp=new Ora(kod,st[1],kezdes);
        if(orarend.oratHozzaad(temp)){
            System.out.println("Sikeres hozzáadás");
        }else{
            System.out.println("Sikertelen hozzáadás");
        }
  
    }
        System.out.println(orarend.toString());

    
    }
}
