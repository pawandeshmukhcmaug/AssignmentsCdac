public class Employee {
     private String name;
     private int yearOfJoining;
     private double salary;
     private String address;
    public Employee(String name, int yearOfJoining,String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
    void printValue() {
    	
    	System.out.println(name+"\t\t"+yearOfJoining+"\t\t"+address);
    }
   public static void main(String[] args) {
	   System.out.println("Name \t Year_Of_joining \t Address");
	   Employee e1= new Employee("pawan", 2026,"bhopal");
	   Employee e2= new Employee("sumeet", 2026,"nashik");
	   Employee e3= new Employee("shivam", 2024,"pune");
	   e1.printValue();
	   e2.printValue();
	   e3.printValue();
   }
}
