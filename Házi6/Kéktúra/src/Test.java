
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
        List<Ember> turazokListaja = new ArrayList<>();

        try {

            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader bf = new BufferedReader(fr);

            String sor;

            while ((sor = bf.readLine()) != null) {
                String[] adatok = sor.split(":");

                String[] szakasz = adatok[1].split("-");

                Ember t = new Ember(adatok[0]);

                if (turazokListaja.contains(t)) {
                    turazokListaja.get(turazokListaja.indexOf(t)).getHossz().add(szakasz[0]);
                    turazokListaja.get(turazokListaja.indexOf(t)).getHossz().add(szakasz[1]);
                } else {
                    t.getHossz().add(szakasz[0]);
                    t.getHossz().add(szakasz[1]);
                    turazokListaja.add(t);
                }

            }

            bf.close();

        } catch (IOException i) {
            System.out.println("Fájlhiba");
        }
        
        Collections.sort(turazokListaja);
        
        Szakaszok(turazokListaja);
    }
    
    
    public static void Szakaszok(List<Ember> t) {
        
        

        for (Ember turazo : t) {
            int tmp = 0;
            for (String szakasz : turazo.getHossz()) {
                if (turazo.getHossz().indexOf(szakasz) == turazo.getHossz().lastIndexOf(szakasz)) {
                    tmp++;
                }
            }

            if (tmp == 2) {
                System.out.println(turazo);
            }
        }
        
        
        
    }
}
