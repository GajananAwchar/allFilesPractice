package javaBascis;
class car{
	//properties
	int price;
	int mileage;
	String CompanyName;
	String Colour;
	//method
	public void PrintPrice(int price){
		System.out.println("price of car in INR is "+price);
	}
	public void PrintMileage(int mileage) {
		System.out.println("The mileage of car in Km is " +mileage);
	}
	public void PrintCompanyName(String CompanyName) {
		System.out.println("The company Name is " +CompanyName);
	}
	public void PrintColour(String Colour) {
		System.out.println("The colour of car is :" +Colour);
	}
}
public class SpeedWayObjectCreation {

	public static void main(String[] args) {
		System.out.println("First car is Launched");
		//objects creation
		car Creta = new car();
		Creta.PrintCompanyName("Hyundai");
		Creta.PrintPrice(800000);
		Creta.PrintMileage(22);
		Creta.PrintColour("White");
		System.out.println("");
		System.out.println("Second CarCompany is Launched ");
		
		car Nexon = new car();
		Nexon.PrintCompanyName("Tata");
		Nexon.PrintMileage(24);
		Nexon.PrintPrice(7000000);
		Nexon.PrintColour("Yellow");
		System.out.println("");
		System.out.println("This was last launch of car");	
	}
}
