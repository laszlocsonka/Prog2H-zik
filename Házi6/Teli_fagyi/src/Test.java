
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
public class Test {
    

    public static void main(String[] args) {

        List<Vevo> megrendelok = new ArrayList<>();
        List<Fagyi> termekek = new ArrayList<Fagyi>();

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        while (s.length() != 0) {

            String[] adatok = s.split(";");

            Fagyi f = new Fagyi(adatok[0]);
            f.setAr(Integer.parseInt(adatok[1]));

            termekek.add(f);

            s = input.nextLine();
        }

        try {
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader buffer = new BufferedReader(fr);

            String sor;

            while ((sor = buffer.readLine()) != null) {
                String[] adatok = sor.split(";");
                String[] rendeltFagylaltok = adatok[1].split(",");

                Vevo v = new Vevo(adatok[0]);

                for (int i = 0; i < rendeltFagylaltok.length; i++) {
                    v.getFagylaltok().add(new Fagyi(rendeltFagylaltok[i]));
                }

                megrendelok.add(v);

            }

        } catch (IOException i) {
            System.out.println("Fájl hiba!!!!");
        }

        rendelesFeldolgozo(megrendelok, termekek);

    }
    
    
    
    public static void rendelesFeldolgozo(List<Vevo> v, List<Fagyi> f) {
        int osszeg = 0;
        int db = 0;
        int tmp = 0;

        for (int i = 0; i < v.size(); i++) {
            for (int j = 0; j < f.size(); j++) {
                if (v.get(i).getFagylaltok().contains(f.get(j))) {
                    tmp++;
                    osszeg += f.get(j).getAr();
                }
            }
            if (tmp == v.get(i).getFagylaltok().size()){
                db++;
                tmp = 0;
            }
        }

        System.out.println(db + " rendelés\n" + osszeg + " Ft");
    }
    
    
}
