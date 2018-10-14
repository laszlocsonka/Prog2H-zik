/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BudapestKupa1;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Budapest {
    private Date datum;
    private String tura_neve;
    private int  resztav;

    public Budapest(Date datum, String tura_neve, int resztav) {
        this.datum = datum;
        this.tura_neve = tura_neve;
        this.resztav = resztav;
    }

    public Date getDatum() {
        return datum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Budapest other = (Budapest) obj;
        if (this.resztav != other.resztav) {
            return false;
        }
        if (!Objects.equals(this.tura_neve, other.tura_neve)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        return true;
    }

 
    public String getTura_neve() {
        return tura_neve;
    }

    public int  getResztav() {
        return resztav;
    }
    

    @Override
    public String toString() {
        return datum + ";" + tura_neve;
    }

 

}
