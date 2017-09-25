
package topic01.classes;

public class StudentTest {
    
    public static void main(String [] args ){
        
        //Student 1
        Student student1 = new Student("Ali", "Ahmed", "12345", 25);
        student1.displayStudentInfo();
        
        //Student 2
        Student student2 = new Student("Kamel","Salah","98398",26 );
        student2.displayStudentInfo();
        
        //Student 3
        Student student3 = new Student("Hamed","Karim","56673", 23  );
        student3.displayStudentInfo();
        

        Student [] students = new Student[3];
        students[0]=new Student("Ali", "Ahmed", "12345", 25);
        students[1]=new Student("Kamel","Salah","98398",26 );
        students[2]=new Student("Hamed","Karim","56673", 23  );
        
        
        
    }
    
}
