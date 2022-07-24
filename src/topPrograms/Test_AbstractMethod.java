package abstractMethod_AndClass;
abstract class Vehicle {  // this is abstract class
	public abstract int getNoOfWheels();    // this is abstract method
	public abstract int getNoOfGears(); // this is abstract method
	public abstract void vehicleType();
	}
class Car extends Vehicle{   // this child class extends abstract class vehicle
	public void vehicleType() {
		System.out.println("Vehicle Type is Car");  }
	public int getNoOfWheels() {  // provide implementation to abstract method getNoOfWheels
		return 4;}
	public int getNoOfGears() {  // provide implementation to abstract method getNoOfGears
		return 7;  
		}}
class Auto extends Vehicle{    // this child class extends abstract class vehicle
	public void vehicleType() {
		System.out.println("Vehicle Type is Auto");  }
	public int getNoOfWheels() {  // provide implementation to abstract method getNoOfWheels
		return 3;  }
	public int getNoOfGears() {  // provide implementation to abstract method getNoOfGears
		return 4;  
		}}
public class Test_AbstractMethod {
	public static void main(String[] args) {
		Car c= new Car();
		c.vehicleType();
	int carWheels=	c.getNoOfWheels();
		System.out.println("Number of Wheels in Car are "+carWheels);
		int carGears = c.getNoOfGears();
		System.out.println("Number of Gears in Car are "+carGears);	
		Auto a = new Auto();
		a.vehicleType();
		int autoWheels=	a.getNoOfWheels();
			System.out.println("Number of Wheels in Auto are "+autoWheels);
			int autoGears=	a.getNoOfGears();
			System.out.println("Number of Gears in Auto are "+autoGears);
	}}
