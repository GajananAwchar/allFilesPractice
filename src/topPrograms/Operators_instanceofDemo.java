package classDemo;
class parent {}
class child extends parent implements MyInterface{}
interface MyInterface{}

public class Operators_instanceofDemo {
	public static void main(String[] args) {
		parent object1 = new parent();
		child object2 = new child ();
		System.out.println("object1 is instanceof parent: " + (object1 instanceof parent));
		System.out.println("object1 is instanceof child: " + (object1 instanceof child));
		System.out.println("object2 is instanceof parent: " + (object2 instanceof parent));
		System.out.println("object2 is instanceof child: " + (object2 instanceof parent));
		System.out.println("object1 is instanceof MyInterface: " + (object1 instanceof MyInterface));
		System.out.println("object2 is instanceof MyInterface: " + (object2 instanceof MyInterface));
	}

}
