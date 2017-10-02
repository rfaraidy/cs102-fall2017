package topic01.classes;


public class Apartment {
    
    private int numberOfRooms;
    private int area;
    
    public Apartment(){
        numberOfRooms=0;
        area=0;
        //this(0,0);
    }
    
    public Apartment(int numberOfRooms, int area){
        //without using data validation = not recommended
        //this.numberOfRooms=numberOfRooms;
        //this.area=area;
        setNumberOfRooms(numberOfRooms);
        setArea(area);
    }
    
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    
    public void setNumberOfRooms(int numberOfRooms){
        if (numberOfRooms>=0){
            this.numberOfRooms=numberOfRooms;
        }else
            throw new IllegalArgumentException("Number of rooms must be greater than 0");
    }
    
    public int getArea(){
        return area;
    }
    
    public void setArea(int area){
        if (area>10*this.numberOfRooms){
            this.area=area;
        }else
            throw new IllegalArgumentException("Area must be greater than 10* number of rooms");
    }
    
    
    public int calculateCost (){
        
        if (this.numberOfRooms== 1){
            return 1000*area;
        }else if (this.numberOfRooms== 2){
            return 1300*area;
        }else if (this.numberOfRooms>2){
            return 1800*area;
        }
       
        return -1;
    }  
    
}
