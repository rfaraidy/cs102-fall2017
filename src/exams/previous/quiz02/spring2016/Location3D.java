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
public class Location3D extends Location2D{
    
    private double z;
    
    public Location3D(double x, double y, double z){
        super(x,y);
        setZ(z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    //(x,y,z);
    public String toString(){
        //return String.format("%.4f, %.4f,%.4f", getX(), getY(),z);
        return String.format("%s,%.4f", super.toString(),z);
    }
}
