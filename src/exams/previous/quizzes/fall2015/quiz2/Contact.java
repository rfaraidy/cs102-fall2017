/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quizzes.fall2015.quiz2;

/**
 *
 * @author akoubaa
 */
public class Contact {
    
    private Address address;
    private Phone mobilePhone;
    private Phone homePhone;

    public Contact(Address address, Phone mobilePhone, Phone homePhone) {
        this.address = address;
        this.mobilePhone = mobilePhone;
        this.homePhone = homePhone;
    }
    
    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Phone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Phone getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(Phone homePhone) {
        this.homePhone = homePhone;
    }

    @Override
    public String toString() {
       return String.format("Address: %s\n Mobile: %s, Home: %s", this.address, this.mobilePhone, this.homePhone);
    }
    
    
    
    
    
}
