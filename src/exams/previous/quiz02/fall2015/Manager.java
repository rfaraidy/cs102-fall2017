/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quiz02.fall2015;

import java.util.ArrayList;

/**
 *
 * @author akoubaa
 */
public class Manager extends Employee{
    
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private double salaryIncrement;
    private String type;
    
    //+ MANAGER_TYPE: String []
    
    public static final String [] MANAGER_TYPE = {"SENIOR MANAGER"," LOCAL MANAGER"};
    
    public Manager(String firstName, String lastName, Contact contact,
            String id, Department department,double baseSalary, 
            String type, double salary_increment, ArrayList<Employee> employees){
        super(firstName, lastName, contact, id, department, baseSalary);
        setType(type);
        setSalaryIncrement(salary_increment);
        setEmployees(employees);
    
    }
    
    public Manager(Employee e, String type,double salary_increment, 
            ArrayList<Employee> employees){
    super(e.getFirstName(), e.getLastName(), e.getContact(),
            e.getId(),e.getDepartment(),e.getBaseSalary());
        //super (e);
        setType(type);
        setSalaryIncrement(salary_increment);
        setEmployees(employees);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public double getSalaryIncrement() {
        return salaryIncrement;
    }

    public void setSalaryIncrement(double salaryIncrement) {
        if (type.equalsIgnoreCase(MANAGER_TYPE[0])){
            if ((salaryIncrement>0.5)&&(salaryIncrement<0.9)){
                this.salaryIncrement = salaryIncrement;
            }
        }else if (type.equalsIgnoreCase(MANAGER_TYPE[1])){
            if ((salaryIncrement>0.1)&&(salaryIncrement<0.49)){
                this.salaryIncrement = salaryIncrement;
            }
        }else throw new IllegalArgumentException("Error in salary increment!");
        
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase(MANAGER_TYPE[0])||type.equalsIgnoreCase(MANAGER_TYPE[1]))
        this.type = type;
        else throw new IllegalArgumentException("Error in Manager Type!");
    }
    
    public double getSalary(){
        return getBaseSalary()*(1+getSalaryIncrement());
    }
    
    public String toString(){
        return String.format("%s\nmanager type: %s\nbase salary: %.2f\nsalary increment: %.2f\n\nemployees:%s", 
                super.toString(),getType(), getBaseSalary(), getSalaryIncrement(), getEmployees());
    }
    
    
    /*
    full name: Ahmed Ali
contact: Address: 10 Olya Street, Morsalat Quarter, Riyadh, Saudi Arabia
 Mobile: 966-05-47896511, Home: 966-011-49173511
employee id: 1000
department: HR,
salary:15000.00

    manager type: SENIOR MANAGER
base salary: 15000.00
salary increment: 0.54

employees: [
LISTOFEMPLOYEES
]

    */
    
    
  
    
}
