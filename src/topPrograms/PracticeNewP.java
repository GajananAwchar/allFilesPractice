package topPrograms;

import java.util.Scanner;

public class PracticeNewP {
	public void Reverse() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input");
		String input= sc.next();
		int len= input.length();
		sc.close();
		String rev="";
		for(int i=len-1; i>=0; i--) {
			rev= rev+ input.charAt(i);
		}
		System.out.println("Reversed String is"+rev);
	}	
	public static void main(String [] args) {
		PracticeNewP s= new PracticeNewP();
		s.Reverse();
	}
	}

