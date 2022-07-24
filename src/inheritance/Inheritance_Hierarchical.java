package inheritance;
public class Inheritance_Hierarchical {
// two or more than two classes inherits same class
	public static void main(String[] args) {
		TwoWheeler vehicleType1= new TwoWheeler();
		vehicleType1.Bike();
		vehicleType1.Passenger();
		System.out.println("******************");
		Truck vehicleType2= new Truck();
		vehicleType2.TataTrucks();
		vehicleType2.Transport();
		Bus vehicleType3 =new Bus();
		System.out.println("******************");
		vehicleType3.AshokLeylandBus();
		vehicleType3.Passenger();	}}
class Vehilce{   //  this is parent class or base class or super class
	void  Transport() {
		System.out.println("It Carry Goods");	}
	void Passenger() { 
		System.out.println("It Carry Passenger");}}
	class TwoWheeler extends Vehilce{  //this is first child class or base class or super class for parent class vehicle
		void Bike() {
			System.out.println("It is first vehicle type");
			System.out.println("It is two Wheeler Passengers");	}}
	class Truck extends Vehilce{      //this is Second child class or base class or super class for parent class vehicle
		void TataTrucks() {
			System.out.println("It is Second vehicle type");
			System.out.println("It is  Heavy transport truck");}}
	class Bus extends Vehilce{    //this is third child class or base class or super class for parent class vehicle
		void AshokLeylandBus() {
			System.out.println("It is Third vehicle type");
			System.out.println("It is passenger bus");}}
