package interfaceConcept;

public class PyramidType_1 extends PyramidTypes {
	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Square Pyramid";
	}
	@Override
	public int noOfLines() {
		return 8;
	}
	@Override
	public int noOfFaces() {
		// TODO Auto-generated method stub
		return 4;
	}
	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 10;
	}
	public static void main(String[] args) {
		PyramidType_1 p = new PyramidType_1();
		p.type();
		System.out.println("type of Pyramid is :"+p.type());
		p.noOfLines();
		System.out.println("No. of lines in Pyramid are :"+p.noOfLines());
		p.noOfFaces();
		System.out.println("No. of Faces in Pyramid are :"+p.noOfFaces());
		p.height();
		System.out.println("Height of Pyramid in cm is :"+p.height());
		
	}
	
	
}
