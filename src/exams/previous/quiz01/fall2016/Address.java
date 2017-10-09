package exams.previous.quiz01.fall2016;

public class Address {
    private Street StreetName;
    private String City;
    private String Country;
    
    public Address (Street sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public void SetAddress (Street sn, String city, String country){
        StreetName=sn;
        City=city;
        Country=country;
    }
    
    public Street getStreetName(){
        return StreetName;
    }
    
    public String getCity(){
        return City;
    }
    
    public String getCountry(){
        return Country;
    }
    
    public String toString(){
        return String.format("%s %s, %s", this.getStreetName(), this.getCity(), this.getCountry());
    }
    
}
