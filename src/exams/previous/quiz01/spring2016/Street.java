package exams.previous.quiz01.spring2016;

public class Street {
    
    public int number;
    public String name;
    public String quarter;
    
    public Street (int n, String na, String q){
        number = n;
        name = na;
        quarter=q;
    }
    
    public String toString(){
        return String.format("%s %s, %s", number, name, quarter);
    }
    
}

