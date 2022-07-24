package encapsulationConcept;
// use of this keyword to use current class object
// use of super() keyword to access parent class properties
class Candidate{ // parent class
	int idNo;
	String name;
	int age;
	Candidate(int idNo, String name, int age){ // constructor with args.
		this.idNo= idNo;  // using this keyword to use current class object
		this.name=name;
		this.age=age;
		}}
class Employee extends Candidate{  // child class
	float salary;
	Employee (int idNo, String name, int age, float salary){
		super(idNo, name, age);  // reusing parent constructor by super keyword
		this.salary=salary;}   // again this keyword use for instance variable
	void diplay () {
		System.out.println("Employee id is "+idNo);
		System.out.println("Name is :" +name);
		System.out.println("Age is :" +age);
		System.out.println("Salary is :"+salary);
	}}
public class SuperKeywordUse {
	public static void main(String[] args) {
		Employee em = new Employee(12345, "Gaurav", 25, 50000);
		em.diplay();
	}
}
