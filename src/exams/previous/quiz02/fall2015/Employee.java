package exams.previous.quiz02.fall2015;

import java.util.ArrayList;

/**
 *
 * @author akoubaa
 */
public class Employee extends Person{
    
    private String id;
    private Department department;
    private double baseSalary;
    public static final ArrayList<Department> DEPARTMENTS = new ArrayList<Department>();
    
    public Employee(String firstName, String lastName, Contact contact,
            String id, Department department,
            double basSalary){
        super(firstName, lastName, contact);
        setId(id);
        setDepartment(department);
        setBaseSalary(baseSalary);
        DEPARTMENTS.add(new Department("HR","01"));
        DEPARTMENTS.add(new Department("FINANCE","02"));
        DEPARTMENTS.add(new Department("Public Relations","03"));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public String toString(){
        return String.format("%s\nemployee id: %s\ndepartment: %s\nsalary: %.2f", 
                super.toString(),getId(), getDepartment(), getBaseSalary());
    }
}
