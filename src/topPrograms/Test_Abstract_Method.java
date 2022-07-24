package abstractMethod_AndClass;
// for abstract class object creation is not possible
abstract class ParentBank{  // abstract class
	public abstract int depositMoney();   //abstract method
	public abstract int TransferMoney();   //abstract method
	public abstract int WithDraw();        //abstract method
}
// Implementation for all abstract methods in abstract class should be provide by child class compulsory.
class subSubBank extends ParentBank{  // child class

	public int depositMoney() {         // abstract method implementation 
		return 6000;
	}	
	public int TransferMoney() {        // abstract method implementation
		return 4000;
	}
public int WithDraw() {                  // abstract method implementation
	return 2000;
}
} 
public class Test_Abstract_Method {
	public static void main(String[] args) {
		subSubBank s = new subSubBank();  // object can be created for child class of abstract parent class
		int deposit =s.depositMoney();	
		int transfer =s.TransferMoney();
		int withdraw = s.WithDraw();
		System.out.println("deposit money :"+deposit);
		System.out.println("transfer money :"+transfer);
		System.out.println("deposit withdraw :"+withdraw);
	}
}
