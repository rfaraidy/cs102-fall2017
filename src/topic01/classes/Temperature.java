package topic01.classes;


public class Temperature {
    
    private double value;
    private char unit;
    private Date date;
    
    public Temperature (){
        
    }
    
    public Temperature (double value, char unit, Date date){
        setValue(value);
        setUnit(unit);
        setDate(date);
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public void setUnit(char unit){
        if ((unit=='C')||(unit=='F'))
            this.unit=unit;
        else throw new IllegalArgumentException("wrong unit");
                
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public double getValue(){
        return value;
    }
    
    public char getUnit(){
        return unit;
    }
    
    public Date getDate(){
        return date;
    }
    
    /*
    Also, the Temperature class should provide 
    two additional methods:
    -	convertToCelsius(): converts and updates the value and 
    unit attributes to Celsius if it is in Fahrenheit, 
    otherwise it prints the message "Same unit, no conversion".
    - 	convertToFahrenheit(): 
    converts and update the value and unit attributes to 
    Fahrenheit if it is in Celsius, otherwise it prints the message "Same unit, no conversion".
      Note that tf F = (tc *1.8 + 32) C, where tf is a temperature 
    in Fahrenheit and tc is a temperature in Celsius.
    Both methods should return a Temperature object 
    
    */
    
    public Temperature convertToCelsius(){
        if (unit=='F'){
            //we do the conversion to C
            value = (value -32)/1.8;
            unit = 'C';
            return new Temperature(value, unit, date);
        }else if (unit=='C')
                System.out.println("same unit, no conversion");
        else throw new IllegalArgumentException("wrong unit");
        return null;
    }
    
    
    public Temperature convertToFahrenheit(){
        if (unit=='C'){
            //we do the conversion to F
            value = (value*1.8 +32);
            unit = 'F';
            return this;
        }else if (unit=='F')
                System.out.println("same unit, no conversion");
         else throw new IllegalArgumentException("wrong unit"); 
         return null;
    }
    
    
    public String toString(){
        return String.format("%.2f %c", value, unit);
    }
    
    
}
