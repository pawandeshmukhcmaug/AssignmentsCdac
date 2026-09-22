
public class Main {
  public static void main(String[] args) {
	  EquilateralTriangle Triangle = new EquilateralTriangle(5);
	  Square sq = new Square(10);
	 
	  System.out.println(Triangle.getNumSide());
	  System.out.println(Triangle.getPerimeter());
	  System.out.println(Triangle.getInteriorAngle());
	  System.out.println(Triangle.getSideLength());
	  
	  System.out.println(sq.getNumSide());
	  System.out.println(sq.getPerimeter());
	  System.out.println(sq.getInteriorAngle());
	  System.out.println(sq.getSideLength());
	  
	  System.out.println();
	  RegularPolygon[] polygon = { Triangle , sq , new EquilateralTriangle(7) };
	  System.out.println(RegularPolygon.totalSide(polygon));
  }
}