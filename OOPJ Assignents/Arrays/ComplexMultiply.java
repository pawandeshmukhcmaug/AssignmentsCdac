import java.util.*;

class ComplexNumber {
  private int number1;
  private int number2;
  
  public int getNumber1() {
	return number1;
  }
  public void setNumber1(int number1) {
	this.number1 = number1;
  }
  public int getNumber2() {
	return number2;
  }
  public void setNumber2(int number2) {
	this.number2 = number2;
  }
  public int computeComplex() {
	  return number1*number2;
  }
  
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    System.out.println("enter 5 element of an array :");
	 
    ComplexNumber[] arr = new ComplexNumber[5];
	  for(int i=0; i<5; i++) {
		 
		  arr[i] = new ComplexNumber();
		  
		  System.out.println("enter first value :");
		  int number1 = sc.nextInt();
		  System.out.println("enter second value :");
		  int number2 = sc.nextInt();
		  
		  arr[i].setNumber1(number1);
		  arr[i].setNumber2(number2);
		  }
	  for(int i=0; i<5;i++) {
		System.out.println("result : "+ arr[i].computeComplex());
	  }
	  sc.close();
  } 
  
}
