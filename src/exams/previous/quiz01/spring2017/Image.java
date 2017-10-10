package exams.previous.quiz01.spring2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Image {
    
    private String name;
    private int width;
    private int height;
    private int[][]  img ;

   public Image(String name, int width, int height, int[][]image){
        setName(name);
        setWidth(width);
        setHeight(height);
        setImg(image);
    }
   public Image(String name, int width, int height){
        setName(name);
        setWidth(width);
        setHeight(height);
        img = new int [this.height][this.width] ;
    }
    
    public Image(Image i){
        this(i.getName(),i.getWidth(),i.getHeight(), i.getImg());
    }
    
     public Image(){
    }

    //get and set methods with validation
     
     public int[][] getImg(){
         return img;
     }
     
     public void setImg(int [][] img){
         this.img = img;
     }
    
        public String getName() {
        return name;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setWidth(int width){
        if(width>=0)
        this.width = width;
        else throw new IllegalArgumentException("The width must be greater than 0");
    }
    
    public void setHeight(int height){
       if(height>=0)
        this.height = height;
        else throw new IllegalArgumentException("The height must be greater than 0");
    }
    
        
    public String toString(){
        return String.format("Filename: %s.pgm\nWidth: %d\nHeight: %d" + name,width,height);
    }
    
/*
The class Image has the method 
    public boolean imread(String filename), 
    which reads an image 
    from a file according to the structure as 
    defined below for a 10 x 10 image:
P2
#Converted from MAP format
10 5
192 255 252 95 18 229 68 152 57 116 
18 66 6 193 43 62 164 250 75 31 
8 87 195 243 46 218 71 82 218 75 
36 82 194 255 251 98 211 181 184 199 
215 94 59 142 76 25 1 7 244 137 
The first line is written P2, which is the format of the image.
The second line is just a comment to skip.
The third line contains the width = 10 and 
    height = 10 of the image
The fifth line until the last contains the 
    values of the colors of the image matrix. 
    You need to read these values and put 
    them in the img matrix. 
    */
    
    
    
    public boolean imread(String filename){
        
        File file = new File(filename);
        
         try {
            Scanner scanner = new Scanner(file);
            String firstLine = scanner.nextLine(); //P2
            String secondLine = scanner.nextLine();//#comment
            /*String dimensionLine = scanner.nextLine();//10 10
            String [] dimensions = dimensionLine.split(" ");//[10, 10]
            int width =  Integer.parseInt(dimensions[0]);//extract the width
            int height = Integer.parseInt(dimensions[1]);//extract the height
            */
            
            int width = scanner.nextInt(); //10
            int height = scanner.nextInt();//5
           
            
            int i =0;
            while(scanner.hasNextInt()){
                //System.out.println(color);
                for (int j=0;j<img[i].length;j++){
                    int color = scanner.nextInt();
                    img[i][j]=color;
                }
                i++;
            }
        } catch (
            FileNotFoundException ex) {
            System.out.println("Error: The file your want to read was not found. Check the name of your file");
        }
        return true;       
        
    }
    
    /*
    The class Image has the method public boolean 
    imwrite(String filename), which writes an image 
    to a file according to the structure as defined above.
    Write the method imwrite(filename).
    */
    
    public boolean imwrite(String filename){
        
        File file = new File(filename);
        FileWriter fw;
        try {
             fw = new FileWriter (file);
             fw.write("P2\n");
             fw.write("#Converted from MAP format\n");
             fw.write(width+" "+ height+"\n");
             for (int i=0;i<height;i++){
                 for (int j=0;j<width;j++){
                     fw.write(img[i][j]+" ");
                 }
                 fw.write("\n");
             }
             fw.close();
        } catch (IOException ex) {
            System.out.println("File IO Exception");
        }
        
        return true;
    }
    
    public void displayImage (){
        System.out.println("Image: "+ name);
        for (int i=0;i<img.length;i++){
           for (int j=0;j<img[i].length;j++){
               System.out.printf("%d\t", img[i][j]);
           }
            System.out.println("");
       } 
    }
    
}



