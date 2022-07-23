package topPrograms;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class DuplicateSubStringInString {  // find duplicate substring in String
public static void findDupCharInString() {
	Scanner sc= new Scanner(System.in);  // input from user
	System.out.println("enter string :");
	String input1 = sc.nextLine();
	String input= input1.trim();
	String [] aa = input.split(" ");
	sc.close();
	// find number of duplicate SubString in String
Map <String, Integer> output = new LinkedHashMap <String, Integer>();
for (String ch:aa) {
	//char ch= input.charAt(i);
	if(output.containsKey(ch)) {
		output.put(ch, output.get(ch)+1);}
	else {
		output.put(ch, 1);
	}}
System.out.println(output);}
public static void main(String [] args) {
	findDupCharInString();
}}
