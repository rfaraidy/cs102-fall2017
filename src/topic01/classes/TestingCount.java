/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.classes;


public class TestingCount {
    
        public static void main(String [] args ){
            
            Student student1 = new Student("Ali", "Ahmed", "12345", 25, "0534567890");
            System.out.println("Student Count: "+ Student.getCount());
            //System.out.println("s1 count: "+ student1.getCount());
            Student student2 = new Student("Kamel","Salah","98398",26,"0534567891" );
            System.out.println("Student Count: "+ Student.getCount());            
            //System.out.println("s1 count: "+ student1.getCount());
            //System.out.println("s2 count: "+ student2.getCount());
            Student student3 = new Student("Hamed","Karim","56673", 23, "0534567892"  );
            //System.out.println("s1 count: "+ student1.getCount());
            //System.out.println("s2 count: "+ student2.getCount());
            //System.out.println("s3 count: "+ student2.getCount());
            
            System.out.println("Student Count: "+ Student.getCount());
            
            
        }
    
}
