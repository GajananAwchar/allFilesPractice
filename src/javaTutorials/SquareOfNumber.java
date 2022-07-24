package javaTutorials;

public class SquareOfNumber {

	public int square (int number) {
		return number+ number;
	}
	public void addtion1 (int number1, int number2) {
	
		int totalNumber = number1+number2;

		System.out.println(totalNumber);
	}
	public static void main(String[] args) {
		SquareOfNumber s= new SquareOfNumber();
		int addition12 = s.square(100);
		System.out.println("addition of given number  is:"+addition12);	
		s.addtion1(100, 200);

	}
}
