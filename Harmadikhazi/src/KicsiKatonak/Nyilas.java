/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KicsiKatonak;

/**
 *
 * @author LacGep
 */
public class Nyilas extends Katona{
    private int lotav;

    public Nyilas(int lotav, int tamado, int vedo) {
        super(tamado=lotav+tamado, vedo);
        this.lotav = lotav;
    }

    public Nyilas(int lotav) {
        this.lotav = lotav;
    }

    
    
    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas "  + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Nyilas other = (Nyilas) obj;
        if (this.lotav != other.lotav) {
            return false;
        }       
        super.equals(obj);
        return true;
    }
    
    
   
}
