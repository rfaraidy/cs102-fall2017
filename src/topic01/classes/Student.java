package topic01.classes;


public class Student {
  
    
    
    //full argument constructor
    public Student(String fn, String ln, String student_id, int student_age){
        //attribute = parameter
        firstName = fn;
        lastName = ln;
        id = student_id;
        age = student_age;
    }
    
    //attributes of the class or instance variable
    public String firstName;
    public String lastName;
    public String id;
    public int age;
    
    
    public void displayStudentInfo(){
        System.out.println("\nStudent");
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("ID: "+ id);
        System.out.println("Age: "+ age);
    }
    
    public void displayAge(){
        System.out.println("Age: "+ age);
    }
    
    
       
}
