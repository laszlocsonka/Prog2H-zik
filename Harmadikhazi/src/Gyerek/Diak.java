/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gyerek;

/**
 *
 * @author LacGep
 */
public class Diak {
    private String gyerek;
    private String elotte;

    public Diak(String gyerek, String elotte) {
        this.gyerek = gyerek;
        this.elotte = elotte;
    }

    public String getGyerek() {
        return gyerek;
    }

    public String getElotte() {
        return elotte;
    }

    @Override
    public String toString() {
        return  gyerek;
    }
    
    
}
