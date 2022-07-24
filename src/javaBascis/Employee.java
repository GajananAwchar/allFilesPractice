package javaBascis;

/*public class Employee {
	//this instance variable is visible for any child class
		public String name;
		//salary variable in Instance_Variable class only
		private double salary;
		public Employee(String employeeName) {
			name = employeeName;
		}
		public void setSalary(double employeeSalary) {
			salary = employeeSalary;
		}
		public void printInstance_Variable() {
			System.out.println("name :" + name);
			System.out.println("salary" + salary);
			
		}
		
		public static void main(String[] args) {
		Employee employee1 = new Employee("Gajanan");
		employee1.setSalary(2000);
		employee1.printInstance_Variable();
		
		}
}*/

public class Employee {
	public static double salary;
	public static final String DEPARTMENT= "Development";
	public static void main(String[] args) {
		salary = 10000;
		
		System.out.println(DEPARTMENT + " average salary" + salary);
		
	}
}
