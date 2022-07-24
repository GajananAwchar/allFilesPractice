package accessmodifiers;
class Add{
	private int a=10;  // private variable
	private int b=20;  // private variable
	void addNumber (){    
		System.out.println(a+b);  // private variable can be accessed within class . no Compile time error	
	}
	}
public class ModifierLimited_ToClass {
	
	public static void main(String[] args) {
		Add add = new Add();
		// can't access private method addNumber outside class Add . 
		//because it is scope is limited to its class only
		add.addNumber();  
	
	}
	}
