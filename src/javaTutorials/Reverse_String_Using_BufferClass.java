package javaTutorials;

public class Reverse_String_Using_BufferClass {

	// reverse String using StringBuffer Class
	public static void main(String[] args) {
		String inputString = "loop";
		StringBuffer stringbuffer = new StringBuffer(inputString);
		stringbuffer = stringbuffer.reverse();
		System.out.println("The reverse word is:" + stringbuffer);
		
	}

}
