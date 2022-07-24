package javaBascis;
class Mobiles{
	String CompanyName;
	String ModelName;
	int Price;
	int Ram;
	String Colour;
	public void DisplayModelName(String ModelName){
		System.out.println("The Model Name is:"+ModelName);	
		}
	public void DisplayPrice(int Price){
		System.out.println("The Price mobile in Rupee is "+Price);
	}
	public void DisplayRam(int Ram){
		System.out.println("The Ram of Mobile in GB is:"+Ram);
	}
	public void DisplayColour(String Colour){
		System.out.println("The Colour of Mobile is:"+Colour);
	} 
	public void DisplayCompanyName(String CompanyName) {
		System.out.println("The Mobile Company Name is:"+CompanyName);
	}
}
public class Method_ObjectCreationMobile {

	public static void main(String[] args){
		System.out.println("The First Mobile Launched");
		Mobiles mobile1 = new Mobiles();
		mobile1.DisplayModelName("Note8");
		mobile1.DisplayPrice(10000);
		mobile1.DisplayRam(4);
		mobile1.DisplayColour("Purple");
		mobile1.DisplayCompanyName("Redmi");
	}			
	}


