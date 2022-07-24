package javaTutorials;
class Bus{
	int price;
	int gears;
	String colour;
	String drive;
	Bus(int price, int gears){
	this.price =price;
	this.gears=gears;	
	}
	Bus(String colour, String drive){
		this.colour ="colour";
		this.drive="drive";		
		}	 
}
public class Practice {	
	public static void main(String[] args) {
				Bus first = new Bus(200000,5);
		System.out.println("the bus price is "+first.price);
		Bus str = new Bus("yellow","left");
		System.out.println("the colour of bus is : "+str.colour);
		System.out.println("the drive of bus is : "+str.drive);
		System.out.println("the bus gears is "+first.gears);
		
	}

}
