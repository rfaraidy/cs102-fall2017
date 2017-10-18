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
public class Shape {
    
    private String name;
    
    public Shape (String name){
        setName(name);
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "shape: "+ name;
    }
    
    
    
}
