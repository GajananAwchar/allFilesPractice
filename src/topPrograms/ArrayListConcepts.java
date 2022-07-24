package arrayConcept;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcepts {
	public static void main(String[] args) {
		
	
	ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);
    for (String i:cars) {
    System.out.println(i);	
    }
 System.out.println(cars);  
 cars.add("my Car");
 System.out.println(cars);
    cars.remove("my Car");
    System.out.println(cars);
    cars.add(2, "4Car");
    //cars.size();
    System.out.println(cars.size());
   System.out.println(cars.indexOf("BMW")); 
    System.out.println(cars);
    for (String i:cars) {
    	System.out.println(i);
    }
    System.out.println("***");
	}
	

}
