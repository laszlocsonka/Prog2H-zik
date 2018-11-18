/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenegyedik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        Szemely MonaLiza= new Szemely("Mona Liza", 20, false);
        System.out.println(MonaLiza.toString());
        
        Szemely[] sz= new Szemely[4];
        Scanner sor= new Scanner(System.in);
        for (int i = 0; i < 4; i++) {

            String[] sor_elemei = sor.nextLine().split(" ");
            if (i < 2) {

                sz[i] = new Hallgato(Double.parseDouble(sor_elemei[0]), sor_elemei[1], Integer.parseInt(sor_elemei[2]), Boolean.parseBoolean(sor_elemei[3]));

            } else {

                sz[i] = new Oktato(sor_elemei[0], sor_elemei[1], Integer.parseInt(sor_elemei[2]), Boolean.parseBoolean(sor_elemei[3]));
            }

            }
        List<Hallgato> ju= new ArrayList<>();
        ju.add(new Hallgato(3.2, "Pista", 12, true));
        ju.add(new Hallgato(4.2, "Jutka", 25, false));
        ju.add(new Hallgato(2.6, "Pista", 20, true));
        System.out.println(kfeladat(ju));
    }
    public static double kfeladat( List<Hallgato> lista )
    {
        double átlag = 0;
        double összeg = 0;
        int db=0;
        
        for( int i=0;i<lista.size();i++ )
        {
            
            if ( lista.get(i).okosvagynem(lista.get(i)) )
            {db++;
                for( int j=0;j<lista.size();j++)
                {
                    összeg = összeg + lista.get(j).eletkor;
                }
            }
        }
        átlag = összeg / db;
        return átlag;
        
    }

}
