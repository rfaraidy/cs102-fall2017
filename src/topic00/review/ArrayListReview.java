package topic00.review;

import java.util.ArrayList;
import java.util.List;


public class ArrayListReview {
    
    
    
    public static void main(String []args){
        
        
        Integer [] intArray = new Integer [10];
        
        //dynamic arrays = ArraysList
        
        ArrayList <Integer> intArrayList = new ArrayList<Integer>();
        
        
        System.out.println("size of intArrayList: " + intArrayList.size());
        System.out.println("intArrayList: "+ intArrayList);
        intArrayList.add(1);
        System.out.println("size of intArrayList: " + intArrayList.size());
        System.out.println("intArrayList: "+ intArrayList);
        intArrayList.add(3);
        System.out.println("size of intArrayList: " + intArrayList.size());
        System.out.println("intArrayList: "+ intArrayList);
        intArrayList.add(2);
        System.out.println("size of intArrayList: " + intArrayList.size());
        System.out.println("intArrayList: "+ intArrayList);
        intArrayList.add(2);
        System.out.println("size of intArrayList: " + intArrayList.size());
        System.out.println("intArrayList: "+ intArrayList);
        System.out.println("");
        intArrayList.remove((Integer)(23));
        System.out.println("size of intArrayList: " + intArrayList.size());
        System.out.println("intArrayList after removing (Integer) (2): "+ intArrayList);
        System.out.println("");
        
        ArrayList <String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("CS101");
        stringArrayList.add("CS102");
        stringArrayList.add("CS210");
        stringArrayList.add("CS371");
        System.out.println("size of stringArrayList: " + stringArrayList.size());
        System.out.println("stringArrayList: "+ stringArrayList);
        //stringArrayList.remove("CS210");
        //System.out.println("size of stringArrayList: " + stringArrayList.size());
        //System.out.println("stringArrayList: "+ stringArrayList);
        //stringArrayList.remove(2);
        //System.out.println("size of stringArrayList: " + stringArrayList.size());
        //System.out.println("stringArrayList: "+ stringArrayList);
        
        
        System.out.println("What is the value of index 2 in intList: "+ intArrayList.get(2));
        System.out.println("What is the value of index 3 in intList: "+ intArrayList.get(3));
        
        
        for (int i=0;i<stringArrayList.size();i++)
        System.out.printf("stringArrayList[%d]: = %d \n",i, intArrayList.get(i));
        
        
        System.out.println("Does stringList contains CS102: "+ stringArrayList.contains("CS102"));
        System.out.println("Does stringList contains CS460: "+ stringArrayList.contains("CS460"));
        
        
        System.out.println("The index of CS102 in stringArrayList: "+ stringArrayList.indexOf("CS102"));
        System.out.println("The index of 2 in intArrayList: "+ intArrayList.indexOf(2));
    
        //List<String> stringSubList = stringArrayList.subList(1, 2);
         System.out.println(stringArrayList);
        System.out.println(stringArrayList.subList(0, 3));
        
    }
    
    
    
    
    
    
}
