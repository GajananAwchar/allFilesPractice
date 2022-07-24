package interviewQuestions;

public class  LeapYear{
	public static void main(String [] args) {
		// divisible by 4 for  all century years -- ending with 00
		// century year is a leap year if it is perfectly divisible by 400
		// 1900 is not leap year
		int year=2012;
		boolean leap = false; // default value false for boolean
	
		
		
		if(year%4==0) {
			if(year %100==0) {
				if(year % 400==0) {
					leap=true;
				}
				else { leap= false;}
			}
			else {leap= true;}
		}
		else {leap= false;}
		if(leap) {
			System.out.println(year + " is  leap year");
		}
		else {
			System.out.println(year + " is not  leap year");
		}
	}
}