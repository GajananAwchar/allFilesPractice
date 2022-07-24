package javaBascis;
public class Constructor {
	public static void main(String[] args) {
// Bus bus1 = new Bus(newPrice, newNoOfGears, newNoOfDoors);
Bus bus1 = new Bus(1500000,8,4);
Bus bus2 = new Bus(2000000,6,5);
System.out.println("Details of bus1 are:");
System.out.println("The Price of bus1 in rupees is : " +bus1.price);
System.out.println();   // we can print empty to given some space in result
System.out.println("The number of gears in bus1 are : " +bus1.noOfGears);
System.out.println();
System.out.println("The number of doors in bus1 are: " +bus1.noOfDoors);
System.out.println("Details of bus2 are:");
System.out.println("The Price of bus2 in rupees is : " +bus2.price);
System.out.println();   // we can print empty to given some space in result
System.out.println("The number of gears in bus2 are : " +bus2.noOfGears);
System.out.println();
System.out.println("The number of doors in bus2 are: " +bus2.noOfDoors);
	}
}
class Bus{
	int price;
	int noOfGears;
	int noOfDoors;
	// case 1 parameterized constructor
	Bus(int price, int noOfGears, int noOfDoors) {
		this.price = price;
		this.noOfGears = noOfGears;
		this.noOfDoors = noOfDoors;	
	}
	}
