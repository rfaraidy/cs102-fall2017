package topic00.review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReviews {
 
    public static void main (String []args){
        
     String fileName ="cs102.txt";
     
     File file = new File(fileName);
        
        System.out.println(file.exists());
        FileWriter fw;
        //System.out.println(file.getPath());
        try {
            fw = new FileWriter (file, false);
            fw.write("Welcome to CS102!\n");
            fw.write("This is a great course\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error: IO Exception occured for File Writer");
        }
        
        System.out.println(file.exists());
        
        try {
            Scanner scanner = new Scanner(file);
            int i=1;
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(i+": "+ line);
                i++;
            }
        } catch (
                FileNotFoundException ex) {
            System.out.println("Error: The file your want to read was not found. Check the name of your file");
        }
        
        
        
        
    }   
}

