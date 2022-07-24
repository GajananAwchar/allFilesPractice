package javaTutorials;

public class Reverse_String_Using_StringBuilder_Class {

	public static void main(String[] args) {
		String inputstring = "look";
		StringBuilder stringbuilder = new StringBuilder(inputstring);
		stringbuilder =stringbuilder.reverse();
		System.out.println("The reverse String is:" +stringbuilder);
	}

}
