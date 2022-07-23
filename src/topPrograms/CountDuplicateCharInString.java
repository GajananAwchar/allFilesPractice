package topPrograms;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class CountDuplicateCharInString {
/*public static void countChar() {
	// find duplicate char  and  count 
	String input ="i am am gggg";
	char [] b= input.toCharArray();
	Map <Character, Integer> m= new HashMap <Character, Integer>();
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
	
	}*/
public void countdupChar() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter input String");
String input= sc.next();
char [] ch= input.toCharArray();
Map <Character, Integer> map = new LinkedHashMap <Character, Integer>();

for(char chh:ch){
	if(map.containsKey(chh)) {
		map.put(chh, map.get(chh)+1);
	}
	else {
		map.put(chh,1);
	}
}
for (Map.Entry<Character, Integer> entry:map.entrySet()) {
	System.out.println(entry.getKey()+ " "+ entry.getValue());
	
}
sc.close();

}
public static void main(String [] args) {
	CountDuplicateCharInString c= new CountDuplicateCharInString();
//countChar();
c.countdupChar();
}}


