interface RegularPolygon{
	public int getNumSide();
	public double getSideLength();
	
	public static int totalSide(RegularPolygon[] polygons) {
		  int total =0;
		  for(RegularPolygon polygon : polygons) {
			  total = total+polygon.getNumSide();
		  }
		  return total;
	}
	 default double getPerimeter() {
		return getNumSide() * getSideLength();
	}
	public default double getInteriorAngle() {
		return (getNumSide()-2) * Math.PI / getNumSide();
	}
	}
