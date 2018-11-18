/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nyolcadik;

import java.util.ArrayList;

/**
 *
 * @author LacGep
 */
public class valoszam {
    java.util.ArrayList<Double> tarol;
    public valoszam() {
        this.tarol = new ArrayList<Double>();
        
    }

    public void add(double num) {
        this.tarol.add(num);
    }
    public double get(int idx) {
       return this.tarol.get(idx);
    }
    public void delete(int idx) {
       this.tarol.remove(idx);
    }
    public boolean contains(double num) {
      return this.tarol.contains(num);
    }
    public int getFirstOccurrence(double num) {
        return this.tarol.indexOf(num);
    }
    
}
