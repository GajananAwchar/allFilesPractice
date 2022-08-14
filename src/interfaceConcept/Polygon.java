package interfaceConcept;

//interface 1
interface Polygon1{
	void sideLength(int length);
	void areaOfPolygon(int a, int b);
}
//interface 2
interface Polygon2{
	void sideLength(int length); 
	void noOfSidesOfPolygon(int noOfSides);
}
//interface 3
interface Polygon3{
	 void sideLength(int length);
}
//interface  polygon extends multiple interfaces
public interface Polygon extends Polygon1,Polygon2, Polygon3 {  
	void PolygonType(String type);
}
