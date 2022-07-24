package javaTutorials;

public class Employee {
// this instance variable is visible to any child class
	String name;
	// private variable is visible only within employee class 
	private double salary;
	
	//name variable is assigned in constructor
	public Employee(String empName) {    //this is constructor with argument String type
		name =empName;
	}
	// the salary variable is assigned value
	//setsalary  is void method non static type and public can be called by anywhere
	public void setsalary(double empsalary) {   
		salary= empsalary;
	}
	public void printEmp() {
		System.out.println("name: " +name);
		System.out.println("salary : " +salary);
	}
	
	public static void main(String[] args) {
		Employee empOne = new Employee("Gajanan");
		empOne.setsalary(50000);
		empOne.printEmp();
		
	}

}
