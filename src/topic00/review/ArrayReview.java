package topic00.review;


public class ArrayReview {
    
    
    public static void displayArray(int [] A){
        for (int i=0;i<A.length;i++){
            System.out.printf("A[%d]=%d\n", i,A[i]);
        }
    }
    
    //method overloading
    public static void displayArray(double [] A){
        for (int i=0;i<A.length;i++){
            System.out.printf("D[%d]=%.2f\n", i,A[i]);
        }
    }
    
    public static void displayArray(String [] S){
        for (int i=0;i<S.length;i++){
            System.out.printf("S[%d]=%s\n", i,S[i]);
        }
    }
    
    
    public static void main (String []args){
        
        
        //One Dimensional Arrays
        
        int x = 3; //32 bits = 4 bytes
        double y = 2.5; 
        
        //declare an array 
        int [] intArray = new int [6];
        String [] stringArray = new String [3];
        double [] doubleArray = new double [8];
        
        
        stringArray[0]= "CS101";
        stringArray[1]= "CS102";
        stringArray[2]= "CS210";
        
        intArray[2]= 78;
        
       for (int i = 0; i<intArray.length;i++){
           intArray[i]= (int)(Math.random()*100);
           doubleArray[i]=(Math.random()*100);
           //System.out.printf("intArray[%d] = %d\n",i, intArray[i]);
           //System.out.println("intArray["+i+"] = "+ intArray[i]);
       }
       
       displayArray(intArray);
       displayArray(doubleArray);
       displayArray(stringArray);
       
       
       
       //Two Dimensional Arrays
       int numberOfRows = 4;
       int numberOfColumns = 3;
       
       //declare a two dimensional array
       int [][] intMatrix = new int [numberOfRows][numberOfColumns];
       
       intMatrix[0][0] = 3;
       intMatrix[2][1]=-2;
       
       for (int i=0;i<intMatrix.length;i++){
           for (int j=0;j<intMatrix[i].length;j++){
               intMatrix[i][j]=(int)(Math.random()*50);
           }
       }
       
       for (int i=0;i<intMatrix.length;i++){
           for (int j=0;j<intMatrix[i].length;j++){
               System.out.printf("intMatrix[%d][%d]=%d\n",i,j,intMatrix[i][j]);
           }
       }       
        
           
        
        
    }
    
    
}
