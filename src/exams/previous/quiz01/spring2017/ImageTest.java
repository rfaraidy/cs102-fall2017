package exams.previous.quiz01.spring2017;


public class ImageTest {
    public static void main(String []args){
        
        
        Image image02 = new Image("image01.pgm", 100, 200);
        
        
        image02.imread("image01.pgm");
        image02.displayImage();
        
        
        image02.imwrite("image01-copy.pgm");
        
        
        
        Image image01 = new Image("quiz01_image01.pgm", 20, 30);

        for (int i=0;i<image01.getHeight();i++){
            for (int j=0;j<image01.getWidth();j++){
                image01.getImg()[i][j]=(int)(Math.random()*255);
            }
        }
        
        
        image02 = new Image();
        image02.setHeight(20);
        image02.setWidth(10);
        image02.setName("quiz01_image02.pgm");
        
        
        Image image03 = new Image (image01);
        image03.imwrite("quiz01_image03.pgm");
        
        
    }
    
}
