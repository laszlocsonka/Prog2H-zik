/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Rectangle extends GeometricShape{
    private double height;
    private double weight;

    public Rectangle() {
    }


    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Rectangle(double height, double weight, String color, boolean filled) {
        super(color, filled);
        this.height = height;
        this.weight = weight;
    }

    
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getArea(){
        return this.height*this.weight;
    }
    
    public double getPerimeter(){
        return 2*(this.height+this.weight);
    }
    
}
