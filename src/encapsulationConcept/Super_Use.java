package encapsulationConcept;

// use super keyword to call constructor of parent
class Automobile {
	Automobile() {
		
System.out.println("Used to transport goods and Passengers");
	}
}
class Tractor extends Automobile {
	Tractor() {
	super();  // will call constructor of parent class as soon as child object is created
	System.out.println("used for Agricultural");	
	}	
}
public class Super_Use {
public static void main(String[] args) {		
	Tractor t= new Tractor();
	}
}
