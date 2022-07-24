package strinManupulationMethods;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "IT industry is growing very rapidly";
		// .length() method we can get length of any String
		System.out.println("The string length is: "+str.length());
// this will print value available at fifth index. index always start from 0 ,1, 2, ... and so on 
		System.out.println("The letter at fifth index is : "+str.charAt(5));
		System.out.println("The index of 'i'letter is : "+str.indexOf("i"));
		// when counting index space is also considered as one index number
		System.out.println("The letter second i from start is is at index : "+str.indexOf('i', 4));
		// instead of hard core value 4 we can use previous 'i' value index str.indexOf("i")
		System.out.println(" the second i from start index number is :"+str.indexOf("i",str.indexOf("i")+1));
		// to get last char in string we can take str.length()-1  because index start from 0.
		System.out.println("The letter at last value index is : "+str.charAt(str.length()-1));
		// to check index of specific string word .  eg "very" in above example 
		System.out.println("The word 'very'  index is : "+str.indexOf("very"));
		// if any index is not available it will return -1 eg. 'happy 
		//' which is not in above string we will get result as -1
		System.out.println("result if any word not in above string str is : "+str.indexOf("happy"));
		// Two string comparison  String str and str1 are not equal 
		//(due to java is case sensitive )hence result must be false
				 }
}
