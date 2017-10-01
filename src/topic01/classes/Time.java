package topic01.classes;


public class Time {

    private int hour;
    private int minute;
    private int second;
    
    //constructor overloading
    
    //full argument construction
    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
    //constructor only for hour
    public Time(int hour){
        this(hour, 0, 0);
        //setHour(hour);
        //setMinute(0);
        //setSecond(0);
    }
    
    //constructor only for hour and minute
    public Time(int hour, int minute){
        this(hour, minute, 0);
        //setHour(hour);
        //setMinute(minute);
        //setSecond(0);
    }
    
    //default
    public Time(){
        this (0,0,0);
        //setHour(0);
        //setMinute(0);
        //setSecond(0);
    }
    
    //copy constructor
    public Time(Time t){
        //this.hour = t.hour;
        //this.minute = t.minute;
        //this.second=t.second;
        
        //setHour(t.hour);
        //setMinute(t.minute);
        //setSecond(t.second);
        
        this(t.hour,t.minute,t.second);
    }
    
    
    public int getHour(){
        return hour;
    }
    
    //hour must be between 0 and 23
    public void setHour(int hour){
        if ((hour>=0)&&(hour<=23))
            this.hour=hour;
        else throw new IllegalArgumentException("hour must be between 0 and 23");
    }
    
    public int getMinute(){
        return minute;
    }
    
    //minute must be between 0 and 59
    public void setMinute(int minute){
       if ((minute>=0)&&(minute<=59))
            this.minute=minute;
        else throw new IllegalArgumentException("minute must be between 0 and 59"); 
    }
    
    public int getSecond(){
        return second;
    }
    
    //minute must be between 0 and 59
    public void setSecond(int second){
       if ((second>=0)&&(second<=59))
            this.second=second;
        else throw new IllegalArgumentException("second must be between 0 and 59"); 
    }
    
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String toStandardString(){
        
        String AM_PM = "AM";
        int h=hour;
        if (hour==0){
            h = 12;
            AM_PM = "AM";
        }
        else if (hour==12){  
            AM_PM = "PM";
        }
        else if ((hour>12)&&(hour<=23)){
            h = hour%12;
            AM_PM = "PM";
        }
        return String.format("%d:%02d:%02d %s", h, minute, second, AM_PM);
    }
    
    
    
}
