
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Könyvem implements Comparable<Könyvem>{
    public String címe;
    public int év;
    private List<String>Szerzők;

    public Könyvem(String címe, int év) {
        this.címe = címe;
        this.év = év;
        this.Szerzők=new ArrayList<>();
    }

    public String getCíme() {
        return címe;
    }

    public void setCíme(String címe) {
        this.címe = címe;
    }

    public int getÉv() {
        return év;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public List<String> getSzerzők() {
        return Szerzők;
    }

    public void setSzerzők(List<String> Szerzők) {
        this.Szerzők = Szerzők;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Könyvem)){
            return false;
        }
        Könyvem k=(Könyvem) obj;
        return this.címe.equals(k.getCíme()) && this.Szerzők.equals(k.getSzerzők());
    }

    @Override
    public int compareTo(Könyvem t) {
        if(this.év==t.getÉv()){
            if(this.Szerzők.size()==t.getSzerzők().size()){
                return this.címe.compareTo(t.getCíme());
            }
            else{
                return (-1)*Integer.compare(this.Szerzők.size(),t.getSzerzők().size());
            }
        }else{
            return Integer.compare(this.év,t.getÉv());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<this.Szerzők.size();i++) {
            if(i<this.Szerzők.size()-1){
            sb.append(this.Szerzők.get(i)).append(", ");
            } else{
                sb.append(this.Szerzők.get(i));
            }}
        if(!this.Szerzők.isEmpty())
        sb.append(": ");

        sb.append(this.címe);
        sb.append("(").append(this.év).append(")");
        return sb.toString();
    }
    
    
    
}
