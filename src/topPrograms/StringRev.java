package topPrograms;

public class StringRev {
// reverse String simple logic for loop
	public static void revString() {
		String s= "i am Gajanan";
		int len= s.length();
		String rev= "";
		for (int i= len-1; i>=0; i--) {
			rev= rev+ s.charAt(i);
		
		}
		System.out.println(rev);
	}
	public static void main(String [] args) {
		revString();
	}
}
