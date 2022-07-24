package methodOverriding;

//Overriding  or runtime polymorphism  or Dynamic polymorphism or late Binding
public class Child extends Parent {   
	
	void marry() {  // overriding method
		 System.out.println("Child Method :marry with girl B");
	 }
	public static void main(String[] args) {
		// parent reference and parent object
		Parent p= new Parent();
		p.marry(); // jvm runtime object is  parent object hence parent method get chance to execute
		// Child reference and Child object
		Child c= new Child();
		c.marry();  // jvm runtime object is  child object hence child method get chance
		// Child reference and Child object
		Parent p1 = new Child();
		p1.marry();  // jvm runtime object is  child object hence child method get chance
	}

}
