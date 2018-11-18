/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok2;

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
        List<Film> szl = new ArrayList();

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while (sor.length() > 0) {
            String[] darabolt = sor.split("[():;]");
            for (int i = 3; i < darabolt.length; i++) {
                Film sz = new Film(darabolt[i]);

                if (szl.contains(sz)) {
                    szl.get(szl.indexOf(sz)).getSzin().add(new Szinesz(darabolt[0], Integer.parseInt(darabolt[1])));
                } else {
                    sz.getSzin().add(new Szinesz(darabolt[0], Integer.parseInt(darabolt[1])));
                    szl.add(sz);
                }

            }

            sor = sc.nextLine();

        }

        
        Collections.sort(szl);
        for(Film i:szl)
            System.out.println(i);
    }
}
