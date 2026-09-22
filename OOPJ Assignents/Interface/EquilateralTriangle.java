
class EquilateralTriangle implements RegularPolygon {
    private double sideLength;

	public EquilateralTriangle(double sideLength) {
		this.sideLength = sideLength;
	}
    public int getNumSide() {
    	return 3;
    }
    public double getSideLength() {
    	return sideLength;
    }
	
	
}
