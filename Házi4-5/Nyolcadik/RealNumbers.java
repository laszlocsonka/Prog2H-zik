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
public interface RealNumbers {
    void add(double num); 
    double get(int idx);
    void delete(int idx);
    boolean contains(double num);
    int getFirstOccurrence(double num);
}
