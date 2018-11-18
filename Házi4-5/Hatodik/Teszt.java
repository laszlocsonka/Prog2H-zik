
import egyetem.Hallgato;
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
public class Teszt {
    public static void main(String[] args) {
        int n;
        Scanner beker=new Scanner(System.in);
        n=Integer.parseInt(beker.nextLine());  
        h= new egyetem.Hallgato[n];
        
        for(int i=0;i<n;i++){
            String sor=beker.nextLine();
            String st[]=sor.split(" "); 
            h[i]= new egyetem.Hallgato(Integer.parseInt(st[0]),Boolean.parseBoolean(st[1]));
        }
        
        for(Hallgato x: h){
            if(x.dolgozatotIr().megfelelt()&&x.dolgozatotIr().megfelelt())
                System.out.println("Megfelelt");
            else System.out.println("Nemfelelt meg");
        }
        
    }
    private static egyetem.Hallgato h[];
    
}
