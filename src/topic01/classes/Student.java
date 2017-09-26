package topic01.classes;


public class Student {
  
    
    //attributes of the class or instance variable
    //data hiding = encapsulation 
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private String phone;
    
    
    //full argument constructor
    public Student(String fn, String ln, String student_id, int student_age, String ph){
        //attribute = parameter
        //firstName = fn;
        //lastName = ln;
        //id = student_id;
        //age = student_age;
                
        //phone= ph;
        
        //set the phone with validation usin the set method
        
        
        setFirstName(fn);
        setLastName(ln);
        setId(id);
        setAge(student_age);
        setPhone(ph);
        
       

    }
    
    
    
    public void displayStudentInfo(){
        System.out.println("\nStudent");
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("ID: "+ id);
        System.out.println("Age: "+ age);
        System.out.println("Phone: "+ phone);
    }
    
    public void displayAge(){
        System.out.println("Age: "+ age);
    }
    
    
    //get method for firstName
    public String getFirstName(){
        return firstName;
    }
    
    //set method for firstName
    public void setFirstName(String fn){
        firstName = fn;
    }
    
    
    //get method for lastName
    public String getLastName(){
        return lastName;
    }
    
    //set method for lastName
    public void setLastName(String ln){
        lastName = ln;
    }
    
    //get method for age
    public int getAge(){
        return age;
    }
    
    //set method for age
    public void setAge(int a){
        //data validation
        if ((a>=20)&&(a<=35))
            age = a;
        else throw new IllegalArgumentException("Error: Wrong age value! it must be between 20 and 35");
    }
    
    
    //get method for phone
    public String getPhone(){
        return phone;
    }
    
    //set method for phone
    public void setPhone(String ph){
        //data validation of mobile phone number
        if ((ph.length()==10)&&(ph.startsWith("05")))
        phone = ph;
        else throw new IllegalArgumentException("Error: phone must start with 05 and has 10 digits");
    }
    
    
    public String getId(){
        return id;
    }
    
    public void setId(String ID){
        id = ID;
    }
}
