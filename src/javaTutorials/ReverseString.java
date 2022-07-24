package javaTutorials;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse String without using reverse string  inbuilt function
		String str = "look";
		StringBuilder str2 =new StringBuilder();
		str2.append(str);
		str2= str2.reverse();
		System.out.println("str2 :" +str2);

	}

}
