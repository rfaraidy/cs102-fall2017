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
        this(hour, 0,0);
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
    
    
    
    
}
