package topPrograms;
import java.util.Scanner;
public class RevEachWordInString {
public static void revEachWord() {
	// reverse each word in string not string
	Scanner sc= new Scanner(System.in);
	System.out.println("enter input : ");
	String input= sc.nextLine();
	String s []= input.split("\\#");
	sc.close();
	String revWord = "";
for (String aa:s) {
	StringBuilder sb= new StringBuilder(aa);
	StringBuilder sbc= sb.reverse();
		revWord = revWord + sbc.toString() + "#";
	}
System.out.println(revWord);
}
public static void main (String [] args) {
	revEachWord();
	
	
}
}

