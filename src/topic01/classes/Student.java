package topic01.classes;


public class Student {
  
    
    //attributes of the class or instance variable
    //data hiding = encapsulation 
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private String phone;
    private Date birthDate;
    
    
    private static int count=0;
    
    
    //full argument constructor
    public Student(String firstName, String lastName, 
            String id, int age, String phone, Date bd){
        //set the phone with validation usin the set method
        setFirstName(firstName);
        this.setLastName(lastName);
        setId(id);
        setAge(age);
        setPhone(phone);
        
        setBirthDate(bd);
        
        count ++;

    }
    
    
    public Student(String firstName, String lastName){
        setFirstName(firstName);
        this.setLastName(lastName);
    }
    
    public static int getCount(){
        return count;
    }
    
    
    public static void setCount(int newValue){
        count = newValue;
    }
    
    
    public void displayStudentInfo(){
        System.out.println("\nStudent");
        System.out.println("First Name: "+ this.firstName);
        System.out.println("Last Name: "+ this.lastName);
        System.out.println("ID: "+ this.id);
        System.out.println("Age: "+ age);
        System.out.println("Phone: "+ phone);
    }
    
    public void displayAge(){
        System.out.println("Age: "+ age);
    }
    
    //get method for birthDate
    public Date getBirthDate(){
        return birthDate;
    }
    
    //set method for birthDate
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
    
    
    //get method for firstName
    public String getFirstName(){
        return firstName;
    }
    
    //set method for firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    
    //get method for lastName
    public String getLastName(){
        return lastName;
    }
    
    //set method for lastName
    public void setLastName(String lastName){
        this.lastName = lastName;
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
    
    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }
    
}
