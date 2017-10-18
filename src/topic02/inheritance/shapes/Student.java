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
public class Student extends Person{
    
    private String id;

    public Student(String id, String name) {
        super(name);
        this.id = id;
    }
    
    
    
}
