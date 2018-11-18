/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos{
    
    private double alkoholTartalom;

    public ErjedtGyumolcs(String fajta, String iz,double alkoholTartalom) {
        super(fajta, iz);
        this.alkoholTartalom = alkoholTartalom;
    }
    
    @Override
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }

   
    
    
}
