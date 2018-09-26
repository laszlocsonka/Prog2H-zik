/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class QuadraticEquation {
     private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return (this.b*this.b)-4*this.a*this.c;
    }
    
    public double getRoot1(){
    if(this.getDiscriminant()>=0){
        return(-this.b+Math.sqrt(this.getDiscriminant()))/2*this.a;
    }
    else 
        return 0;
    }
    
    public double getRoot2(){
    if(this.getDiscriminant()>=0){
        return(-this.b-Math.sqrt(this.getDiscriminant()))/2*this.a;
    }
    else 
        return 0;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b + ", c=" + c;
    }
    
    
}
