package topPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountSubStringandCountString {
public void countChar() {
	// find duplicate char  and  count 
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter input string");
	String input =sc.next();
	char [] b= input.toCharArray();
	Map <Character, Integer> m= new HashMap <Character, Integer>();
	sc.close();
	for (char c:b) {
		 if (m.containsKey(c)) {
			m.put(c, m.get(c)+1);
		 }
		 else {
			 m.put(c, 1);			 
			 }}
	for (Map.Entry<Character, Integer> entry:m.entrySet()) {
		System.out.println(entry.getKey() + " "+ entry.getValue());
	}
	System.out.println(m);
	}
public static void main(String [] args) {
	CountSubStringandCountString c= new CountSubStringandCountString();
	c.countChar();
}}


