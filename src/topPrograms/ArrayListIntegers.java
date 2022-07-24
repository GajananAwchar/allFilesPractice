package arrayConcept;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntegers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(33);
	    numbers.add(15);
	    numbers.add(20);
	    numbers.add(34);
	    numbers.add(8);
	    numbers.add(12);
	
	ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);
    myNumbers.addAll(numbers);
   
    Collections.sort(myNumbers);
    myNumbers.add(1, 20);
   System.out.println( "index 2 value is "+myNumbers.get(2));
    for (int i:myNumbers) {
    	System.out.println(i);
    	
    }
    
	}
}
