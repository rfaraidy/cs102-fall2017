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

public class GPS extends Location3D{
    
    public GPS (double lat, double lng, double alt){
        super(lat,lng,alt);
        setLatitude(lat);
        setLongitude(lng);
    }
    
    public double getLatitude(){
        return getX();
    }
    
    public double getLongitude(){
        return getY();
    }
    
    public double getAltitude(){
        return getZ();
    }
    
    public void setLatitude(double lat){
        if ((lat<=85) &&(lat>=-85)){
            setX(lat);
        }
    }
    
    public void setLongitude(double lng){
        if ((lng<=185) &&(lng>=-185)){
            setY(lng);
        }
    }
    
    public void setAltitude(double alt){
        setZ(alt);
    }
    
    public String toString(){
        return "";
    }
    
}
