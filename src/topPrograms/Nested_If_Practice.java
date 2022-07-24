package classDemo;

public class Nested_If_Practice {

	public static void main(String[] args) {
		int age=20;
		int weight=70;
		if(age>=20){	
		if(weight>=70){
			System.out.println("you are eligible to donate the blood");
		}
		
		}else {
			System.out.println("you are  not eligible to donate the blood");
		}
		int age1=22;
		int weight1=62 ;
		if(age1<=23&& age1>=21){	
		if(weight1<=65||weight1>=55){
			System.out.println("you are eligible to give army exam");
		}
		
		}else {
			System.out.println("you are not eligible to army exam");
		}
		String bloodGroup1= "O+ve";
		if(bloodGroup1.equalsIgnoreCase("ab-ve")) {
			System.out.println("you are universal blood donar");
			
		}
		else if (bloodGroup1.equalsIgnoreCase("O-ve")) {
			System.out.println("you are universal blood receiver");
			
			
		}
		else {
			System.out.println("you can donate blood to you blood group group people only");
		}
	}
	

}
