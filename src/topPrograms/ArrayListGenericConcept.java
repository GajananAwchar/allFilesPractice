package arrayConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGenericConcept {
// dynamic array List
	public static void main(String[] args) {
		ArrayList<String> objString= new ArrayList<String>();
		objString.add("Mukesh");
		objString.add("Gajanan");
		objString.add("QTP");
		
		// for each loop
		for (String s :objString) {
			System.out.println("values by for each loop"+s);
			
		}   // for loop
		for (int i=0; i<objString.size();i++) {
			System.out.println(objString.get(i));
			
		}
		// using Iterator and store them in Iterator <String> list 
	Iterator<String> it =	objString.iterator();
	// while loop
	while (it.hasNext()) {
		Object obj=	it.next();
			System.out.println("all values of list are "+obj);
			
		}
	
		
		
	}}