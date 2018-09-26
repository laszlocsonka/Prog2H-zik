/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LacGep
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width=1;
        this.height=1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.width*this.height;
    }
    
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }

    @Override
    public String toString() {
        return "A téglalap szélessége " + width + ", a magassága " + height + ", területe "+getArea()+", kerülete "+getPerimeter();
    }
    
}
