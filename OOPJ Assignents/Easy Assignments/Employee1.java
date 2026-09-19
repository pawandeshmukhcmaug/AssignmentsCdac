public class Employee1 {
     private String name;
     private int yearOfJoining;
     private double salary;
     private int noOfHour;
     private String address;
    public Employee1(String name, int yearOfJoining,double salary,String address,int noOfHour) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
		this.salary = salary;
		this.noOfHour = noOfHour;
	}
    void printValue() {
    	
    	System.out.println(name+"\t\t"+yearOfJoining+"\t\t"+salary+"\t\t"+address+"\t\t"+noOfHour);
    	
    }
    void addSalary() {
    	if(salary<500) {
    		salary += 10;
    	}
    	System.out.println("salary when below 500 "+"$"+salary) ;
    }
    void addWork() {
    	if(noOfHour>6) {
    		salary += 5;
    	}
    	System.out.println("salary After 6 hours of work "+"$"+salary) ;
    }
   
   public static void main(String[] args) {
	   System.out.println("Name \t Year_Of_joining \t Address");
	   Employee1 e1= new Employee1("pawan", 2026,300,"bhopal",3);
	   Employee1 e2= new Employee1("sumeet", 2026,250,"nashik",7);
	   Employee1 e3= new Employee1("shivam", 2024,400,"pune",8);
	   e1.printValue();
	   e2.printValue();
	   e3.printValue();
	   e1.addSalary();
	   e2.addSalary();
	   e3.addSalary();
	  e1.addWork();
	  e2.addWork();
	  e3.addWork();
   }
}
