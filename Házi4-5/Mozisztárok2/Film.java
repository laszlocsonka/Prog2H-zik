/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mozisztárok2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Film implements Comparable<Film> {
    private String cim;
    private List<Szinesz> szin;

    public Film(String cim) {
        this.cim = cim;
        this.szin=new ArrayList<>();
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public List<Szinesz> getSzin() {
        return szin;
    }

    public void setSzin(List<Szinesz> szin) {
        this.szin = szin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cim);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Film)) {
            return false;
        }
        Film film=(Film) obj;
        return this.cim.equals(film.getCim());
    }

    

    @Override
    public int compareTo(Film t) {
        
        if(this.szin.size()==t.getSzin().size()){
            return this.cim.compareTo(t.getCim());
        }else{
            return (-1)*Integer.compare(this.szin.size(),t.getSzin().size());
        }
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.cim).append("\n");
        Collections.sort(szin);
        for (int i = 0; i < szin.size(); i++) {
            if (i == szin.size() - 1) {
                sb.append(szin.get(i));
            } else {
                sb.append(szin.get(i)).append("\n");
            }
        }
        return sb.toString();
    }
    
}
