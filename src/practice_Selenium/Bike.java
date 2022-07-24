package practice_Selenium;

public class Bike {

	int price;
	String colour;
	String company;
	public Bike (){
		
		
		System.out.println("this is constructor without args");
		
		colour = "red";
		company = "Hero";
		
	}
	static {System.out.println("this is first static block");}
	// first instance
	{System.out.println("this is first instance block");}
	Bike (int price, String colour, String company){
	
	super();
	System.out.println("this is constructor with args");
	}
	
	
	public static void main(String[] args) {
			Bike bike1 = new Bike();
			System.out.println("bike1 company is : " +bike1.company);
			System.out.println("bike1 price is : " +bike1.price);
			System.out.println("bike1 colour is : " +bike1.colour);
			Bike bike2 = new Bike(60000,"white","TVS");
			
			System.out.println("bike2 company is : " +bike2.company);
			System.out.println("bike2 price is : " +bike2.price);
			System.out.println("bike2 colour is : " +bike2.colour);
	}
	// second instance
	{System.out.println("this is second instance block");
	}
	static {System.out.println("this is second static block");}

}
