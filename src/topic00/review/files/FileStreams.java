package topic00.review.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileStreams {

    public static void main(String []args) throws IOException{
        int key = 3;
        File inputFile = new File("files/students.txt");
        File encInputFile = new File("files/students-encrypted.txt");
        File outputFile= new File("files/students-copy.txt");
        File encFile= new File("files/students-encrypted.txt");
        try {
            FileInputStream fileInputStream =
                    new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = 
                    new FileOutputStream(outputFile);
            FileOutputStream encFileOutputStream = 
                    new FileOutputStream(encFile);
            int c = 0;
            while ((c = fileInputStream.read())!=-1){
                if (c==32){
                    System.out.println("");
                }else
                System.out.print((char)c);
                fileOutputStream.write(c);
                encFileOutputStream.write(c+key);
            }
            fileOutputStream.close();
            fileInputStream.close();
            encFileOutputStream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found exception. Check the name of your file");
        } catch (IOException ex) {
            System.out.println("IO exception. Check the name of your file");
        }
        
        try {
            FileInputStream encFileInputStream =
                    new FileInputStream(encInputFile);
            int c = 0;
            while((c=encFileInputStream.read())!=-1){
                System.out.println((char)(c-key));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileStreams.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
