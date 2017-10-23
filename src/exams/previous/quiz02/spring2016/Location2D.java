/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quiz02.spring2016;

/**
 *
 * @author akoubaa
 */
public class Location2D {
    
    private double x;
    private double y;

    public Location2D(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public String toString(){
        return String.format("%.4f, %.4f", x, y);
    }
    
    
}
