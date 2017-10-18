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
public class Person {
    
    private String name;
    
    public Person (String name){
        setName(name);
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "person: "+ name;
    }
    
    
    
}
