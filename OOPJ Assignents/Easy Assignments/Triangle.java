
public class Triangle {
	private int side1,side2,side3;
	Triangle(int side1,int side2,int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	int getPerimeter(){
		return side1+side2+side3;
	}
	double getArea(){
		double semiperimeter = getPerimeter()/2;
		return (semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
	}
   public static void main(String[] agrs){
     Triangle side = new Triangle(3,4,5);
  
     System.out.println("perimeter is :"+side.getPerimeter());
     System.out.println("area is : "+side.getArea());
  }
}
