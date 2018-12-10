
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Test {
    public static void main(String[] args) {
        List<Merleg> li = new ArrayList<>();
        
         try {
            FileReader fr = new FileReader(new File("sample.txt"));        
            BufferedReader bf = new BufferedReader(fr);

            String sor;

            while ((sor = bf.readLine()) != null) {
                String[] adatok = sor.split(":");

                Merleg c = new Merleg(adatok[0], adatok[1]);

                if (li.contains(c)) {
                    li.get(li.indexOf(c)).setBevetel(li.get(li.indexOf(c)).getBevetel() + Integer.parseInt(adatok[3]));
                    li.get(li.indexOf(c)).getEv().add(Integer.parseInt(adatok[2]));
                } else {
                    c.setBevetel(Integer.parseInt(adatok[3]));
                    c.getEv().add(Integer.parseInt(adatok[2]));

                    li.add(c);
                }
            }
            
            bf.close();

        } catch (IOException i) {
            System.out.println("Fájl hiba");
        }

        Collections.sort(li);

        for (Merleg c : li) {
            System.out.println(c);
        }
        
    }
}
