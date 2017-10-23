package exams.previous.quiz01.spring2016;

public class Geolocation {
    
    private double latitude;
    private double longitude;
    private double altitude;
    
    public Geolocation(double lat, double lon, double alt){
        setLatitude(lat);
        setLongitude(lon);
        setAltitude(alt);
    }
    
    public Geolocation(){
    }
    
    public Geolocation(Geolocation gl){
        //setLatitude(gl.getLatitude());
        //setLongitude(gl.getLongitude());
        //setAltitude(gl.getAltitude());
        this(gl.getLatitude(), gl.getLongitude(),gl.getAltitude());
    }
    
    public double getLatitude(){
        return latitude;
    }
    
    public double getLongitude(){
        return longitude;
    }
    
    public double getAltitude(){
        return altitude;
    }
    
    public void setLatitude(double lat){
        if ((lat<=85) &&(lat>=-85)){
            latitude = lat;
        }else 
            throw new IllegalArgumentException("Invalid Latitude");
    }
    
    public void setLongitude(double lon){
        if ((lon<=180) &&(lon>=-180)){
            longitude = lon;
        }else 
            throw new IllegalArgumentException("Invalid Longitude");
    }
    
    public void setAltitude(double alt){
            altitude = alt;
    }
    
    
    public String toString(){
        return String.format("(lat: %.4f, lon: %.4f, alt: %.4f)\n",
                this.latitude, longitude, getAltitude());
    }
    
    
    
    
}
