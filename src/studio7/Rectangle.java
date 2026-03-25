
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
    public double getArea(){
        double area = length*width;
        return area;

}
    



}
public static void main(String[] args){
   double square = new Rectangle(2.0,2.0);
    System.out.println(getArea(square));
}
       


    
