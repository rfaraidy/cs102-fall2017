package topic01.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TemperatureTest {
    
    public static void main(String[]args) throws IOException {
        
        
        ArrayList <Temperature> tempList = new ArrayList<Temperature>();
       
        Date date1 = new Date(1,1,1990);
        Temperature t1 = new Temperature(14.5, 'C',date1);
        tempList.add(t1);
        
        
        tempList.add(new Temperature(80.5, 'F',new Date(1,1,2000)));
        tempList.add(new Temperature(32.4, 'C',new Date(1,1,2001)));
        
        tempList.get(1).setValue(90.3);
        tempList.get(1).getDate().setDay(5);
        
        tempList.get(2).convertToFahrenheit();
        
        File file = new File("temp.txt");
        
        
        
           FileWriter fw = new FileWriter(file);
                for (Temperature t : tempList){
                fw.write(t+"\n");
                }
                fw.close();

        
            System.out.println("File Input Output Exception" + ex);
        
        
        /*
            1.	Write a test program TemperatureTest that
            •	An ArrayList of three Temperature objects
            {14.5 C, 80.5 F, 32.4 C}
            •	Change the value of the second temperature to 90.3 F.
            •	Change the day of the second temperature to 5 instead of 2.
            •	Convert the third temperature to Fahrenheit.
            •	Save all temperatures into a file with name temp.txt
            (5 points)
            
            
            */
        
        
    }
    
}
