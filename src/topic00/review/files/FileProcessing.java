package topic00.review.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileProcessing {
     public static void main(String []args) {
        
         //specify the file name
         String fileName = "output.txt";
         
         //create a file object
         File fileToWrite = new File(fileName);
         
         //write to a file
        try{
             FileWriter fileWriter = new FileWriter (fileToWrite);
             fileWriter.write("Welcome to CS102 course!\n");
             fileWriter.close();
        } catch (IOException ex) {
             System.out.println("There is an error with the file ");
         }
        
        //read from a file
        File fileToRead = new File("output.txt");
         try {
             Scanner fileInput = new Scanner (fileToRead);
             while(fileInput.hasNextLine()){
                String line = fileInput.nextLine();
                System.out.println(line);
             }
         } catch (FileNotFoundException ex) {
             System.out.println("Check the file name. It is not found.");   
         }
         
         
    }   
    
}
