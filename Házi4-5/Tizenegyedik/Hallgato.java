/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenegyedik;

/**
 *
 * @author LacGep
 */
public class Hallgato extends Szemely{
    public double atlagtulajdonsag;

    public Hallgato(double atlagtulajdonsag, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.atlagtulajdonsag = atlagtulajdonsag;
    }
    
    public boolean okosvagynem(Hallgato o)
    {
        if(o.atlagtulajdonsag>=4)
            return true;
        else
            return false;
    }
    StringBuffer string = new StringBuffer();
    @Override
    public String toString() {
        return "Hallgato:" +string.append(nev+""+super.string) ;
    }
}
