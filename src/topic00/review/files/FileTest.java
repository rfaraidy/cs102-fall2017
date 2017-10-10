/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic00.review.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileTest {
    
    public static void main(String []args) {
        
        
        String filename = "files/students.txt";
        File file = new File(filename);
        
        
        
        Scanner scanner;
        try {
            scanner = new Scanner (file);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                String [] name = line.split(" ");
                String firstName = name[0];
                String lastName = name[1];
                System.out.println(firstName +" ; "+ lastName);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. Check the file name");
        }
            
            
            
            
            
       
        
        
        
        
        
    }
    
}
