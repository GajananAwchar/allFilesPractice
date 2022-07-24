package encapsulationConcept;
class Student {
	int a=10;
	int b= 20;
	void Reading() {
		System.out.println("Student must be able to read");
		}
	void Writing() {
		System.out.println("Parent writing method");
		}
	void Learn() {
		System.out.println("Student must be able Learn New Things");	
	}
void LearnSkills() {
	System.out.println("Parent method");
}	
}
class Rahul extends Student{
	int a=50;
	int b =60;
	void Dancing() {
		System.out.println("Rahul must be able to dance");
	}
	void Writing() {
		System.out.println("child writing method");
	}
	void sum() {
		int sum= this.a+this.b;
		int sumPrent=super.a+super.b;
		System.out.println(sumPrent);
		System.out.println(sum);
	}
	void LearnSkills() {
		super.Learn();  // calling parent methods by using super keyword
		super.Reading();
		super.Writing();
		Dancing();	
		Writing();
		this.Writing();
		super.Writing();
		this.sum();
	}}
public class Super_Use_CallMethod {
	public static void main(String[] args) {
		Rahul r = new Rahul();
		r.LearnSkills();
		r.LearnSkills();
		Student s= new Student();
		s.LearnSkills();
	}}
