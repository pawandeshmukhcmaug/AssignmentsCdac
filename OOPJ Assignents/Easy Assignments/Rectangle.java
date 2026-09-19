public class Rectangle {
   double length, breadth;   
   
   public Rectangle(double length, double breadth) {
	   this.length = length;
	   this.breadth = breadth;
   }
   public double area(){
	   return length*breadth;
   }
   public static void main(String[] agrs) {
	   Rectangle obj1 = new Rectangle(4,5);
	   Rectangle obj2 = new Rectangle(5,8);
	 System.out.println( "Reactangle 3 : " + obj1.area());
	 System.out.println("Rectangle 2 : "+ obj2.area());
   }
}       


