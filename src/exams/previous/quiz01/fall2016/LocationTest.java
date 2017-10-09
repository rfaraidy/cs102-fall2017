package exams.previous.quiz01.fall2016;

import java.util.ArrayList;


public class LocationTest {

    public static void main(String []args){
        
        ArrayList<Location> locations = new ArrayList<Location>();
        
        Street street0 = new Street(1, "Abubark Road", "Morsalat");
        Address address0 = new Address (street0, "Riyadh", "Saudi Arabia");
        Geolocation gps0 = new Geolocation(24.7136, 46.6753, 612.0);
        Location location0 = new Location(address0, gps0, 1, "Riyadh");
        location0 = new Location(new Address (new Street(1, "Abubark Road", "Morsalat"), "Riyadh", "Saudi Arabia"), new Geolocation(24.7136, 46.6753, 612.0), 1, "Riyadh");
        
        locations.add(new Location(new Address (new Street(1, "Abubark Road", "Morsalat"), "Riyadh", "Saudi Arabia"), new Geolocation(24.7136, 46.6753, 612.0), 1, "Riyadh"));
        locations.add(new Location(new Address (new Street(3, "Nasria Street", "Sfax"), "Sfax", "Tunisia"), new Geolocation(34.7478, 10.7662, 20.0), 1, "Sfax"));
        
        
        locations.get(1).getGps().setAltitude(10.2);
        locations.get(0).getAddress().getStreetName().number=15;
        
        for (Location location : locations){
            System.out.printf("%s: lat/lon/alt: %.4f,%.4f,%.4f\n",
                    location.getName(), location.getGps().getLatitude(),
                    location.getGps().getLongitude(),
                    location.getGps().getAltitude());
        }
        
        double minAlt=999999;
        for (Location location : locations){
            if (minAlt>location.getGps().getAltitude()){
                minAlt = location.getGps().getAltitude();
            }
        }
        
        
        System.out.println("minAlt: "+minAlt);
        
        
        
    }
    
}
