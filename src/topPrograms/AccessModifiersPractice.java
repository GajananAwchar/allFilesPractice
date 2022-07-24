package accessmodifiers;
class Practice{
	// If no access modifier is given then its access modifier is always default  
	// default  variable accessible in all classes within package
	String first;  
	String second;
	// default  method accessible in all classes within package

	void example() {   
		first="Scope of default access modifier is";
		second ="limited to package";
		System.out.println(first);
		 System.out.println(second);
		System.out.println("can be used by any class within package");
	}
}
public class AccessModifiersPractice {

	public static void main(String[] args) {
		Practice p = new Practice();
		// accessible method example  within package, because it's modifier is default .
		p.example();  
		
	}

}
