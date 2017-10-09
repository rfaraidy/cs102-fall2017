package exams.previous.quiz01.fall2015;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TemperatureTest {
    
    public static void main(String []arg){
        
     /*
      Write a test program TemperatureTest that 
        An ArrayList of three Temperature objects 
{14.5 C, 80.5 F, 32.4 C}
•	Change the value of the second temperature to 90.3 F.
•	Change the day of the second temperature to 5 instead of 2.
•	Convert the third temperature to Fahrenheit. 
•	Save all temperatures into a file with name temp.txt
  
        
      */  
        
        ArrayList<Temperature> temperatures = new ArrayList<Temperature>();
        Temperature t1 = new Temperature (14.5, 'C', new Date(1,1,2016));
        temperatures.add(t1);
        
        temperatures.add(new Temperature (80.5, 'F', new Date(2,2,2016)));
        
        temperatures.add(new Temperature (32.4, 'C', new Date(3,3,2016)));
        
        //Change the value of the second temperature to 90.3 F.
        
        System.out.println(temperatures);
        temperatures.get(1).setValue(90.3);
        System.out.println(temperatures);
        
        //Change the day of the second temperature to 5 instead of 2.
        temperatures.get(1).getDate().setDay(5);
        System.out.println(temperatures);
        
        //Convert the third temperature to Fahrenheit. 
        temperatures.get(2).convertToFahrenheit();
        System.out.println(temperatures);
        
        //Save all temperatures into a file with name temp.txt
        
        try {
            File file = new File("temp.txt");
            FileWriter fw = new FileWriter (file, true);
            for (Temperature t : temperatures){
                fw.write(t.toString()+"\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("File error");
        }
        
        
    }
    
}
