
package topic01.classes;


public class TimeTest {
    public static void main(String[]args){
        
        Time t1 = new Time(13,3,0);System.out.println("t1= ");
        
        
        Time t2 = new Time();
        
        Time t3 = new Time(3,8,49);
        
        Time t4 = new Time(t1);
        
        System.out.println("t1: " + t1.toUniversalString());
        System.out.println("t2: " + t2.toUniversalString());
        System.out.println("t3: " + t3.toUniversalString());
        System.out.println("t4: " + t4.toUniversalString());  
        t4.setHour(15);
        System.out.println("t4: " + t4.toUniversalString());
        
       
        System.out.println("t1: "+ t1);
        System.out.println("t1 standard: "+ t1.toStandardString());
        
        System.out.println("t2: "+ t2);
        System.out.println("t3: "+ t3);
        System.out.println("t4: "+ t4);
        
    }
}
