public class Complex {
    private int real;
    private int img;
	public Complex(int real, int img) {
        this.real = real;
		this.img = img;
	}
	public Complex add(Complex c2) {
	  Complex result = new Complex(0,0);
	  result.real = this.real + c2.real;
	  result.img = this.img + c2.img;
	  return result;
	  }
	public Complex sub(Complex c2) {
		Complex result = new Complex(0,0);
		  result.real = this.real - c2.real;
		  result.img = this.img - c2.img;
		  return result;
		  }
	public Complex product(Complex c2) {
		Complex result = new Complex(0,0);
		  result.real = this.real * c2.real;
		  result.img = this.img * c2.img;
		  return result;
		  }
	void display() {
		System.out.println(real+"+"+img+"i");
	}
	   public static void main(String[] args) {
	   Complex c1 = new Complex(4,3);
	   Complex c2 = new Complex(1,2);
	 Complex result1 = c1.add(c2);
	 Complex result2 = c1.sub(c2);
	 Complex result3 = c1.product(c2);
	 result1.display();
	 result2.display();
	 result3.display();
   }
}
