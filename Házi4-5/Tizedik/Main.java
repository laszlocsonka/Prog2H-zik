/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizedik;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        Auto kocsika=new Auto("",100,true);
        Auto []teherkocsik= new Auto[4];
        int i=0;
        System.out.println("Kérem a rendszámot: \n");
        kocsika.rendszam=sc.nextLine();
        System.out.println(kocsika.toString());

        while(i<4)
        {
            System.out.println("Kérem az auto/teherauto adatait!");
            String[] c= sc.nextLine().split(" ");
            if(i<2)
                teherkocsik[i]= new Auto(c[0], Integer.parseInt(c[1]), Boolean.parseBoolean(c[2]));
            else
                teherkocsik[i]= new Teherauto(c[0], Integer.parseInt(c[1]), Boolean.parseBoolean(c[2]), Integer.parseInt(c[3]));
            i++;
        }
        
        
    }
    
    
    public boolean rendszamellenorzes(Auto tmp)
    {
        char c;
        boolean k=false;
        if(tmp.rendszam.length()==6){
            for(int i=0; i<=3; i++){
                for( c='a';c<='z';c++)
                {
                    if(tmp.rendszam.charAt(i)==c)
                    {
                        k=true;
                        break;
                    }
                    
                }
            if(k==false)
                return false;
            k=false;
                                   }
        for(int i=3; i<7; i++){
            for( c='0'; c<='9'; c++)
                {
                    
                    if(tmp.rendszam.charAt(i)==c)
                    {
                        k=true;
                        break;
                    }
                    
                }
            if(k==false)
                return false;
            k=false;
        }
                                    }
        return k;
    }
    
    public static Teherauto[] nagyobbmint20t(Auto tomb[])
    {
        int db=0;
        Teherauto tmp;
        for(int i=0; i<tomb.length;i++)
            if(tomb[i] instanceof Teherauto){
                tmp=(Teherauto) tomb[i];
                if(tmp.kg>20000)
                    db++;
            }
    Teherauto[] tmptomb= new Teherauto[db];   
    db=0;
        for(int i=0; i<tomb.length;i++)
            if(tomb[i] instanceof Teherauto){
                tmp=(Teherauto) tomb[i];
                if(tmp.kg>20000){
                    tmptomb[db]=tmp;
                    db++;
                }
            }
    return tmptomb;
    }
    public static void legnagyobb3(List <Auto> valami)
    {
       Auto []iratomb=new Auto[2];
       iratomb=null;
       
       Auto  []tomb=valami.toArray(new Auto[valami.size()]);
       
       if(tomb.length<3)
           for (Auto tomb1 : tomb) {
               System.out.println(valami.toString());
               return;
           }
       for(int j=0; j<3;j++)
        for(int i=0;i<tomb.length;i++){
            if(!(tomb[i].teljesitmeny==iratomb[0].teljesitmeny||tomb[i].teljesitmeny==iratomb[1].teljesitmeny||tomb[i].teljesitmeny==iratomb[2].teljesitmeny))
                if(iratomb[j].teljesitmeny<tomb[i].teljesitmeny)
                    iratomb[j]=tomb[i];
                    }
       for(int i=0;i<iratomb.length;i++)
            System.out.println(Arrays.toString(iratomb));
           
    }
}
