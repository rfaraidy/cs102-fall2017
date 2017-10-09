package exams.previous.quiz01.fall2016;

public class Location {

    private Address address;
    private Geolocation gps;
    private int id;
    private String name;
    
    public Location(Address a, Geolocation gps, int id, String name){
        setAddress (a);
        setGps(gps);
        setId(id);
        setName(name);
    }
    
    public Location(Location location){
        this(location.address, location.gps, location.id, location.name);
    }
    
    public Location(){
        
    }
    
    public void setAddress (Address a){
        address = a;
    }
    
    public void setGps(Geolocation gps){
        this.gps = gps;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Address getAddress (){
        return address;
    }
    
    public Geolocation getGps(){
        return gps;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
     
}
