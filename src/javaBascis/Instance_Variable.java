package javaBascis;

public class Instance_Variable {
//this instance variable is visible for any child class
	public String name;
	//salary variable in Instance_Variable class only
	private double salary;
	public Instance_Variable (String employeeName) {
		name = employeeName;
	}
	public void setSalary(double employeeSalary) {
		salary = employeeSalary;
	}
	public void printInstance_Variable() {
		System.out.println("name :" + name);
		System.out.println("salary  " + salary);
		
	}
	
	public static void main(String[] args) {
	Instance_Variable employee1 = new Instance_Variable("Gajanan");
	employee1.setSalary  (2000);
	employee1.printInstance_Variable();
	}

}
