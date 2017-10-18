/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.previous.quiz02.fall2015;

public class Phone {
    
    private String countryCode;
    private String areaCode;
    private String subscriberNumber;

    public Phone(String countryCode, String areaCode, String subscriberNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.subscriberNumber = subscriberNumber;
    }
    
    
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    public void setSubscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }
    
    
    
    
    @Override
public String toString(){
    return countryCode + "-" + areaCode + "-" + subscriberNumber;
}
    
}
