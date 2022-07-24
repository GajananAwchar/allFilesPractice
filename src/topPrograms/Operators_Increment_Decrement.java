package classDemo;

public class Operators_Increment_Decrement {

	public static void main(String[] args) {
		int number = 10;
	  // post fix increment operator increase number value by 1. i.e. print as '11'
		System.out.println(number++); // post fix print value as it is then increase value by 1
	  // pre fix increment operator increase number value by 1. i.e. print as '12'
		System.out.println(++number);  // prefix first increase value by 1 then print after addition
		System.out.println(number++);
		System.out.println(number++);
		System.out.println(number);
		int b=++number;
		System.out.println(b);
		
	}
}

