package topic00.review;


public class ArrayReview {
    
    
    //display array
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
    
    
    public static void displayMatrix (String name,int [][] M){
        System.out.println("Matrix: "+ name);
        for (int i=0;i<M.length;i++){
           for (int j=0;j<M[i].length;j++){
               System.out.printf("%d\t", M[i][j]);
           }
            System.out.println("");
       } 
    }
    
    public static void displayMatrix (String name,double [][] M){
        System.out.println("Matrix: "+ name);
        for (int i=0;i<M.length;i++){
           for (int j=0;j<M[i].length;j++){
               System.out.printf("%.2f\t", M[i][j]);
           }
            System.out.println("");
       } 
    }
    
    
    public static void initMatrix(double [][] M){
        for (int i=0;i<M.length;i++){
           for (int j=0;j<M[i].length;j++){
               M[i][j]=(Math.random()*50);
           }
       }
    }
    
    
    public static double [][] sumMatrix(double [][] X, double [][] Y){
        //if we asssume that rows and colums are all equal
        if (X.length!=Y.length)
            throw new IllegalArgumentException("[Error] The number of rows of the matrices must be the same size");
        
        for (int i=0;i<X.length;i++)
        if (X[i].length!=Y[i].length)
            throw new IllegalArgumentException("[Error] The number of columns of the matrices must be the same size");
        
        
        int nRows=X.length;
        int nCol=X[0].length;
        double [][] sum = new double [nRows][nCol];
        
        for (int i=0;i<nRows;i++){
            for (int j=0;j<nCol;j++){
                sum[i][j]=X[i][j]+Y[i][j];
            }
        }
        return sum;
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
       int numberOfRows = 5;
       int numberOfColumns = 10;
       
       //declare a two dimensional array
       int [][] intMatrix = new int [numberOfRows][numberOfColumns];
       
       intMatrix[0][0] = 3;
       intMatrix[2][1]=-2;
       
       for (int i=0;i<intMatrix.length;i++){
           for (int j=0;j<intMatrix[i].length;j++){
               intMatrix[i][j]=(int)(Math.random()*50);
           }
       }
       
       displayMatrix("intMatrix", intMatrix);   
       
       double [][] A = new double [4][3];
       double [][] B = new double [4][3];
       
       
       double [][] S = new double [3][3];
        
       initMatrix(A);
       initMatrix(B);
        System.out.println("");
       displayMatrix("A", A);
        System.out.println("");
       displayMatrix("B", B);  
       
       S = sumMatrix(A,B);
       System.out.println("");
       displayMatrix("Sum", S);  
       
        
        
    }
    
    
}
