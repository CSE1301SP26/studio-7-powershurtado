
public class Rectangle{


    private double length; 
    private double width; 

    public Rectangle(double newLength, double newWidth){ 
         length = newLength;
         width = newWidth;
    }
        public double getLength(){
            return length;
        }
        public void setLength(double newLength){
         length = newLength;
        }
        public double getWidth(){
            return width;
        }
        public void setWidth(double newWidth){
             width = newWidth;
        }
 public static double getArea(double length, double width ){
      
        double area = length*width;
        return area;

 }




    public static void main(String[] args){
        Rectangle r1  = new Rectangle(5.0,4.0);
         double a = r1.length;
         double b = r1.width;
         if(a!=b){
            System.out.print("this is not a square. however, the area of this rectangle is ");
         }else{
            System.out.print("the area of your square is ");
         }
            
        System.out.print(getArea( a, b));

    }
}
       


    
