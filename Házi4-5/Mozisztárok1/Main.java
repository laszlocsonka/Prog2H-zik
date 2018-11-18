/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LacGep
 */
public class Main {
    public static void main(String[] args) {
        List<Szinesz> szl = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] darabolt = sor.split("[():,]");
            for (int i = 3; i < darabolt.length; i++) {
                Szinesz sz = new Szinesz(darabolt[i]);

                if (szl.contains(sz)) {
                    szl.get(szl.indexOf(sz)).getFilmek().add(new Film(darabolt[0], Integer.parseInt(darabolt[1])));
                } else {
                    sz.getFilmek().add(new Film(darabolt[0], Integer.parseInt(darabolt[1])));
                    szl.add(sz);
                }

            }

            sor = sc.nextLine();

        }

        
        Collections.sort(szl);
        for(Szinesz i:szl)
            System.out.println(i);

    }
    /*
    5
A tegla (2006):Leonardo DiCaprio,Matt Damon,Jack Nicholson,Mark Wahlberg,Martin Sheen
Eredet (2010):Leonardo DiCaprio,Ken Watanabe,Joseph Gordon-Levitt,Marion Cotillard
Ted (2012):Mark Wahlberg,Mila Kunis,Seth MacFarlane
Kapj el,ha tudsz(2002):Leonardo DiCaprio,Tom Hanks,Christopher Walken
Angyalok es demonok (2009):Tom Hanks,Ewan McGregor,Ayelet Zurer
    */
}
