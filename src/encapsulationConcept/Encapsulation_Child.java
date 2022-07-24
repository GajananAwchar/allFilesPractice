package encapsulationConcept;

public class Encapsulation_Child extends EncapsulationParent {
	
	public static void main(String[] args) {
		Encapsulation_Child ec= new Encapsulation_Child();
		System.out.println("current login data>>>>");
		ec.getData();
		ec.setData("NewAdmin", "Admin@123");
		System.out.println("new Login login data>>>>");
		ec.getData();
		
	}

}
