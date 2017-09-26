
package topic01.classes;

import java.util.ArrayList;

public class StudentTest {
    
    public static void main(String [] args ){
        
        
        //Student 1
        Student student1 = new Student("Ali", "Ahmed", "12345", 25, "0534567890");
        //student1.displayStudentInfo();
        //student1.firstName = "Salah";
        student1.setFirstName("Salah");
        
        //student1.lastName = "Hamed";
        //student1.id="39494";
        //student1.age=26;
        student1.setAge(27);
        student1.setPhone("0534567890");

        //student1.phone="29393dds";
        
        System.out.println("Student First Name: "+ student1.getFirstName());
        System.out.println("Student Age: "+ student1.getAge());
        
        //Student 2
        Student student2 = new Student("Kamel","Salah","98398",26,"0534567891" );
        //student2.displayStudentInfo();
        
        //Student 3
        Student student3 = new Student("Hamed","Karim","56673", 23, "0534567892"  );
        //student3.displayStudentInfo();
      
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(new Student("Mohamed", "Ali", "8494",22, "0534567895"));
        studentList.add(student3);
        studentList.add(student2);
        
       
        //for loop
        for (int i=0; i<studentList.size();i++){
            //Student s = studentList.get(i);
            //s.displayStudentInfo(); 
            studentList.get(i).displayStudentInfo();
            
        }
        
        //for each
        for (Student s : studentList){
            //s.displayStudentInfo();;
        }
        
        
        
        
        
        
    }
    
}
