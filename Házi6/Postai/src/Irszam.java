
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
public class Irszam implements Comparable{
    private int iranyitoszam;
    private int osszErtek;
    private List<Szemely> cimzett;

    public Irszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
        this.osszErtek = 0;
        this.cimzett = new ArrayList<>();
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public int getOsszErtek() {
        return osszErtek;
    }

    public void setOsszErtek(int osszErtek) {
        this.osszErtek = osszErtek;
    }

    public List<Szemely> getCimzett() {
        return cimzett;
    }

    public void setCimzett(List<Szemely> cimzett) {
        this.cimzett = cimzett;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(this.getIranyitoszam() + ": " + this.getOsszErtek() + " Ft\n");
        
        for (int i = 0; i< cimzett.size(); i++){
            if (i != cimzett.size()-1){
                sb.append(cimzett.get(i) + "\n");
            } else {
                sb.append(cimzett.get(i));
            }
        }
        
        return sb.toString();
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Irszam)){
            return false;
        }
        
        Irszam i = (Irszam) obj;
        
        return this.getIranyitoszam() == i.getIranyitoszam();
    }
    
    @Override
    public int compareTo(Object obj){
        Irszam i = (Irszam) obj;
        
        return Integer.compare(this.getIranyitoszam(),i.getIranyitoszam());
    }
    
}
