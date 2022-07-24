package arrayConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		// list allow duplicate values
		arr.add(785622);
		arr.add(785622);
		arr.add('c');
		arr.add('c');
		arr.add("gajanan, awchar");
		arr.add(12.322);
	int myList = arr.size();	
		//it follows execution order as it is written top to bottom
		// if we direct print object will return all values stores in object
		//System.out.println(arr);
		//System.out.println(arr.get(4));
		for (int i=0; i<arr.size();i++) {
			System.out.println("values from array list"+arr.get(i));
		}
		// for each i.e. enhanced loop
		for(Object abc:arr) {
			System.out.println("all values"+abc);
		}
		Iterator iterrat = arr.iterator();
		 
		while (iterrat.hasNext()) {
		Object obj=	iterrat.next();
			System.out.println("all values of list are "+obj);
			
		}
		
	}

}
