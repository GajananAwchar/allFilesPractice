package topPrograms;

import java.util.Scanner;

public class ReverseStringReturnMethod {

	public String revString() {// return type method
		// reverse string by Standard method StringBuilder
		//input by user
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input String to rev ");
		String s= sc.nextLine();
		StringBuilder sb= new StringBuilder(s);
		sc.close();
		StringBuilder sbb= sb.reverse();
		String rev= sbb.toString();
		return rev;
	}
	
	public static void main(String [] args) {
	ReverseStringReturnMethod r= new ReverseStringReturnMethod();
	String output= r.revString();
System.out.println(output);
	}
}
