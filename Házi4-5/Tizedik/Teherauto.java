/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizedik;

/**
 *
 * @author LacGep
 */
public class Teherauto extends Auto{
    public int kg;

    public Teherauto( String rendszam, int teljesitmeny, boolean automata, int kg) {
        super(rendszam, teljesitmeny, automata);
        this.kg = kg;
    }
    StringBuffer string = new StringBuffer();
    
    @Override
    public String toString() {
        return "Teherauto: "  +string.append(kg+" "+super.string);
    }
    
}
