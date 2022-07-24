package inheritance;
// Single inheritance . child class CarModel inherits Parent class Company
//CarModel class inherits CarCompany class
public class CarCompany {
	void Company1(){
		System.out.println("Name of Car Company is TATA");
	}
	void Company2(){
		System.out.println("Name of Car Company is Honda");
	}
	public static void main(String[] args) {	
		CarModel model = new CarModel();
		model.Model_1();
		model.Company1();
		model.Model_2();
		model.Company2();
	}
}
class CarModel extends CarCompany{
	void Model_1() {
		System.out.println("model 1 info");
		System.out.println("Model name is Indica");
	}
	void Model_2() {
		System.out.println("model 1 info");
		System.out.println("Model name is Accord");
	}
}
