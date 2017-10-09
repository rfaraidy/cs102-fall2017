package exams.previous.quiz01.fall2015;


public class Temperature {

    private double value;
    private char unit;
    private Date date;
    
    public Temperature (double v, char u, Date d){
        setValue(v);
        setUnit(u);
        setDate(d);
    }
    
    public Temperature (){
    }
    
    public Temperature  convertToCelsius(){
        if (unit == 'F'){
            /*Temperature t = new Temperature();
            t.setValue((value-32)/1.8);
            t.setUnit('C');
            t.setDate(date);
            */
            setValue((value-32)/1.8);
            setUnit('C');
            //return new Temperature((value-32)/1.8, 'C', date);
            
        }else{
            System.out.println("Same unit, no conversion");
        }
        return this;
    }
    
    public Temperature  convertToFahrenheit(){
        if (unit =='C'){
            setValue((value*1.8)+32);
            setUnit('F');
            //return new Temperature((value*1.8)+32, 'F', date);
        }else{
            System.out.println("Same unit, no conversion");
        }
       
        return this;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public char getUnit(){
        return unit;
    }
    
    //we need to do data validation
    public void setUnit(char u){
        if ((u=='C')||(u=='F'))
            this.unit = u;
        else throw new IllegalArgumentException("Unit is not valid");
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setDate(Date d){
        this.date = d;
    }
    
    public String toString(){
        return String.format("%.2f %c (%s)", this.getValue(), this.getUnit(), this.getDate());
    }
    
    
}
