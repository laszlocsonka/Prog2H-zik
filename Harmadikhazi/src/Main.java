
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner beker=new Scanner(System.in);
        String sor=beker.nextLine();
        String st[]=sor.split(";");
        int n=Integer.parseInt(st[0]); // parseint ->> statikus metódusa az itneger osztálynak, paraméterként kapott számot alakít át egész számmá ha valóban szám áll ott
        String elso=st[1];
        String valasztott=st[2];
        gy= new Gyerek[n];
        
        for(int i=0;i<n-1;i++){
            sor=beker.nextLine();
            st=sor.split(";");
            gy[i]= new Gyerek(st[0],st[1]); 
            
        }
        kiir(gy);
    }
    
    private static Gyerek []gy;
    private static void kiir(Gyerek [] t){
        for(int i=0;i<t.length-1;i++){
            System.out.println(t[i]);
        }
    }
    
    
    private static int piros(Gyerek []g){
        for(int )
    }
    
}
