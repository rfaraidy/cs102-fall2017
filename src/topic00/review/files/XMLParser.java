package topic00.review.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class XMLParser {
    
    public static void main(String []arg){
        
        int studentsCount = 0;
        ArrayList<String> studentList = new ArrayList<String>();
        String students = "";
        File file = new File("files/students.xml");
         try {
             Scanner fileInput = new Scanner (file);
             while(fileInput.hasNextLine()){
                String line = fileInput.nextLine().trim();
                //System.out.println(line);
                if (line.contains("<student>")){
                    studentsCount++;
                }
                if (line.contains("<first_name>")){
                 /**<first_name>Mohamed</first_name>*/
                    int position =line.indexOf('>');
                    
                    String first_name = line.substring(line.indexOf('>')+1,line.indexOf('<',position));
                    //System.out.println("first_name: "+first_name);
                    students = students + first_name +" ";
                    
                } if (line.contains("<last_name>")){
                    int position =line.indexOf('>');
                    
                    String last_name = line.substring(line.indexOf('>')+1,line.indexOf('<',position));
                    //System.out.println("first_name: "+first_name);
                    students = students + last_name +", ";
                    
                } if (line.contains("<gpa>")){
                    int position =line.indexOf('>');
                    String gpa = line.substring(line.indexOf('>')+1,line.indexOf('<',position));
                    //System.out.println("first_name: "+first_name);
                    students = students + gpa +",";
                } if (line.contains("<age>")){
                    int position =line.indexOf('>');
                    
                    String age = line.substring(line.indexOf('>')+1,line.indexOf('<',position));
                    //System.out.println("first_name: "+first_name);
                    students = students + age +", ";
                    
                }  if (line.contains("</student>")){
                    //students = students +"\n";
                    studentList.add(students);
                    students="";
                }
             }
             System.out.println("The number of students is: "+studentsCount);
         } catch (FileNotFoundException ex) {
             System.out.println("Check the file name. It is not found.");   
         }
         
         System.out.println(studentList);
        
    }
    
}
