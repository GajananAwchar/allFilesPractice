package interfaceConcept;


// abstract class implements polygon interface
public  class polygonType implements Polygon{
	
	public void areaOfPolygon(int a, int b) {
		System.out.println("Area Of polygon type :"+a*b);	
	}
	public void sideLength(int length){
		System.out.println("Side Lenght of polygon type: "+length);
	}
	public void noOfSidesOfPolygon(int noOfSides) {
		System.out.println("Number of Sides of polygon type: "+noOfSides);
	}
	public void PolygonType(String type) {
		System.out.println("THe type of Polygon is "+type);
	}
	public static void main(String[] args) {
		polygonType rt= new polygonType();
		rt.areaOfPolygon(5, 5);
		rt.sideLength(4);
		rt.noOfSidesOfPolygon(4);
		rt.PolygonType("Square");
		
	}
}
