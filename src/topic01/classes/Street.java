/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.classes;

public class Street {
    
    public int number;
    public String name;
    public String quarter;
    
    public Street (int n, String na, String q){
        number = n;
        name = na;
        quarter=q;
    }
    
    public String toString(){
        return String.format("%s %s, %s", number, name, quarter);
    }
    
}

