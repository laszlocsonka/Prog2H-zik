/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomersekleT;

import java.util.Objects;

/**
 *
 * @author LacGep
 */
public class Homerseklet {
    private String telepules;
    private int homerseklet;

    public Homerseklet(String telepules, int homerseklet) {
        this.telepules = telepules;
        this.homerseklet = homerseklet;
    }

    
    
    public String getTelepules() {
        return telepules;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    @Override
    public String toString() {
        return telepules + " (" + homerseklet+")";
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Homerseklet other = (Homerseklet) obj;
        if (this.homerseklet != other.homerseklet) {
            return false;
        }
        if (!Objects.equals(this.telepules, other.telepules)) {
            return false;
        }
        return true;
    }
    
    
}
