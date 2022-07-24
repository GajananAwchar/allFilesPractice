package inheritance;
public class School {   // MultiLevel Inheritance
	void school1() {
		System.out.println("My School name is School1");	}
	void school2() {
		System.out.println("My School name is School2");	}
	public static void main(String[] args) {
		StudentName name= new StudentName();
		name.Student1();
		name.Medium1();
		name.standard1();
		name.Student2();
		name.Medium2();
		name.standard2();  }}
class LanguageMedium extends School {
	void Medium1 (){	
		System.out.println("My Medium is MarathiMedium");	}	
	void Medium2 (){
		System.out.println("My Medium is EnglishMedium");	}}
class Standard extends LanguageMedium {
	void standard1 (){
		System.out.println("My standard is First");	}	
	void standard2(){
		System.out.println("My standard is Second");		}}
class StudentName extends Standard {
	void Student1 (){
		System.out.println("student  information");
		System.out.println("My Name is Gaurav");	}	
	void Student2 (){
		System.out.println("student 2 information");
		System.out.println("My Name is Rahul");		}}
