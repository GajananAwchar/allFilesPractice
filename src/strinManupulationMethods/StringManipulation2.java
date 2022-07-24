package strinManupulationMethods;

public class StringManipulation2 {

	public static void main(String[] args) {
		String str = "IT industry is growing very rapidly";
		String str1 = "IT Industry is Growing very rapidly";
		String str2 ="IT industry is growing very rapidly";
		String str3 ="     Testing Industry    ";
		// we can ignore case sensitive by using. now String str and str1 become true . it will ignore the case sensitiveness 
		System.out.println("String str and str1 copmarison is:: "+str.equalsIgnoreCase(str1));
		// Two string comparison  String str and str2 are  equal hence result must be true
		System.out.println("String str and str2 copmarison is ::"+str.equals(str2));
		// to print substring  by entering start and end index number it giver string between index 
		System.out.println("the substring between index 2 and 11 is:: "+str.substring(2,11));
		// trim it will trim space befor and after in string not between substring or char. 
		System.out.println("trim result of string str3 s:" + str3.trim());
		String date = "10-12-2018"; // string variable
		// this will replace - with / in date string
		System.out.println("New date format is :- "+date.replace("-","/"));  
		// spilt the string with _ . 
		String test= "Hello_World_Test_Selenium";
		String testval[]= test.split("_");
		 for (int i=0; i<testval.length; i++) {
			 System.out.println(testval[i]);
			 
			 
			 //concat Strings
			 String s1= "To", s2="get", s3 = "her";
		String newString= 	 s1.concat(s2).concat(s3);
			 System.out.println("The concated newString is :"+newString);
			 
			 int a=100; int b=200;
			 String p1="yellow"; String p2= "colour";
			 
			 System.out.println(a+b);  // a+b given simple addition
			 System.out.println(p1+p2);  // p1+p2 add two string
			// here concat takes place from left to right. first a+b = 300 , 
			// 300+pa= 300yellow, 300yellow+p2 = 300yellowcolour
			 System.out.println(a+b+p1+p2);  // observe result  
			 System.out.println(p1+a+p2+b);   // observe result
			 
		 }
		
		
			
	}

}
