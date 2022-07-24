package javaTutorials;

public class Reverse_String_Without_ReverseFunction {
// convert string to char [] and use for loop
	public static void main(String[] args) {
		String str = "look";
		String revword = "";
		char chars[] = str.toCharArray();
		int length = chars.length;
		for (int i= length-1; i>=0;i--) {
			revword =revword + str.charAt(i);
		}
		System.out.println("the reverse word is : "+revword);

	}

}
