package practiceJava.Inheritance;

import java.util.ArrayList;

public class Stringiterate {
public static void main(String[] args) {
	String str="i am gaja%%%&%nan aw33243char";
String s= str.replaceAll("[^A-Za-z]", "");
String a= s.split(" ");
String rev="";
ArrayList<String> arr= new ArrayList<String>();
arr.add(a);
}
}
