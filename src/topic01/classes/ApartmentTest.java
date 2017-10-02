package topic01.classes;


public class ApartmentTest {
    
    public static void main (String []args){
        
        /*
        Write a test program that creates two Apartment 
        objects— one with 3 rooms and an Area of 50m2, 
        and the second with the default constructor. 
        Modify the number of rooms of the second apartment 
        object to 2 and its area to 35m2.
        Display the cost of each apartment. (2 points)        
        */
        
        Apartment ap1 = new Apartment(3, 50);
        Apartment ap2 = new Apartment();
        
        ap2.setNumberOfRooms(2);
        ap2.setArea(35);
        
        
        System.out.println("Cost of AP1: "+ ap1.calculateCost());
        System.out.println("Cost of AP2: "+ ap2.calculateCost());
    }
    
}
