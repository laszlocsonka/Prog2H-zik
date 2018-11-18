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
public class Oktato extends Szemely{
    public String Tanszek;

    public Oktato(String Tanszek, String nev, int eletkor, boolean ferfi) {
        super(nev, eletkor, ferfi);
        this.Tanszek = Tanszek;
    }
    
}
