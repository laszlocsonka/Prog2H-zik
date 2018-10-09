/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class VendéglátóipariEgység {
    private String név;
    private int férőhelyekSzáma;
    private boolean dohányzó;

    
    
    public VendéglátóipariEgység(String név, int férőhelyekSzáma, boolean dohányzó) {
        this.név = név;
        this.férőhelyekSzáma = férőhelyekSzáma;
        this.dohányzó = dohányzó;
    }

    public String getNév() {
        return név;
    }

    public int getFérőhelyekSzáma() {
        return férőhelyekSzáma;
    }

    public void setDohányzó(boolean dohányzó) {
        this.dohányzó = dohányzó;
    }

    public boolean isDohányzó() {
        return dohányzó;
    }

    @Override
    public String toString() {
        return "VendéglátóipariEgység" + "név" + név + ", férőhelyekszáma" + férőhelyekSzáma + ", dohányzó " + dohányzó ;
    }
    
    
}
