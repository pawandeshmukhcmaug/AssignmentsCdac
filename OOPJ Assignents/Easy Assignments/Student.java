
public class Student {
  private String name;
  private int roll_no;
  private String phone_no;
  private String address;
     
  
  public Student(String name, int roll_no, String phone_no, String address) {
	  
	this.name = name;
	this.roll_no = roll_no;
	this.phone_no = phone_no;
	this.address = address;
	}
  public void display() {
	  System.out.println("name : "+name);
	  System.out.println("roll_no :"+roll_no);
	  System.out.println("phone_no :"+phone_no);
	  System.out.println("address :"+address);
  }


  public static void main(String[] args) {
	  Student obj1 = new Student("john",2,"982700xxxx","mumbai");
	  Student obj2 = new Student("sam",3,"982600xxxx","bhopal");
	  obj1.display();
	  obj2.display();
  }
}
