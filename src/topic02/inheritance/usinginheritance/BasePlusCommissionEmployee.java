package topic02.inheritance.usinginheritance;


//use inheritance from the class CommissionEmployee
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary; //base salary per week
    
    
    public BasePlusCommissionEmployee(String first, String last, 
            String ssn, double sales, double rate, 
            double salary){
        //call the constructor of the superclass
        super(first,last,ssn, sales, rate);
        setBaseSalary(salary);
    }
    
    public void setBaseSalary(double baseSalary){
        if (baseSalary>0.0)
            this.baseSalary=baseSalary;
        else
            this.baseSalary=0.0;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    
    //override the method earning of the superclass
    @Override
    public double earning(){
        return baseSalary+(super.earning());
    }
    
    @Override
    public String toString(){
        return String.format("base plus %s" 
                + "base salary: %.2f",
                super.toString(), baseSalary);
    }
    
    
    /*
    public String toString(){
        return String.format("commission employee: %s %s\n"
                + "social security number: %s \n"
                + "gross sales: %.2f \n"
                + "commission rate: %.2f", firstName, 
                lastName, Ssn, 
                grossSales, commissionRate);
    }
    */
    
    
}

