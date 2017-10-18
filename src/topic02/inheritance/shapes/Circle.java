/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic02.inheritance.shapes;

/**
 *
 * @author akoubaa
 */
public class Circle extends Shape{
    
    
    private double radius;

    public Circle(String name, double radius) {
       super(name);
        setRadius(radius);
    }
    
    
    public String getName() {
        return getName();
    }

    public void setName(String name) {
        setName(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    /*
    public String toString(){
        return "shape: "+ name;
    }
    */
    
    public String toString(){
        return super.toString()+" is a circle";
    }
    
    
}
