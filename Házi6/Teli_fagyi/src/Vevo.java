
import java.util.ArrayList;
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
public class Vevo {
    private String nev;
    private List<Fagyi> fagyik;

    public Vevo(String nev) {
        this.nev = nev;
        this.fagyik = new ArrayList<>();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public List<Fagyi> getFagylaltok() {
        return fagyik;
    }

    public void setFagylaltok(List<Fagyi> fagylaltok) {
        this.fagyik = fagylaltok;
    }

    @Override
    public String toString() {
        return nev + "-" + fagyik;
    }
}
