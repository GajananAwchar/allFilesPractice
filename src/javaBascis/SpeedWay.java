package javaBascis;
class students{
	//properties
	int id;
	int fees;
	String name;
	//methods or function
	//print id
	public void printId(int id) {
		System.out.println("id of student is:" +id);
	}
	public void printFees(int fees) {
		System.out.println("fees of student is : " +fees);
	}
	public void printName(String name) {
		System.out.println("name of the student is:" +name);
	}
}
public class SpeedWay {
	public static void main(String[] args) {
		//objects creation
		students gajanan =new students();
		gajanan.printId(01);
		gajanan.printFees(100);
		gajanan.printName("gajanan");		
		students aarya =new students();
		aarya.printId(02);
		aarya.printFees(101);
		aarya.printName("aarya");
	}
}