package stringPractice;

import java.util.HashSet;

public class DuplicateElementsOfArray {
	public static void main(String[] args) {
		  // using For loop
		String names[]= {"Java", "C","Java", "PHP", "C"};
		
		for(int i=0;i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("THe Duplicate String is :: " +names[i]);
				}
			}
		}
		// by Hashset collections class
		HashSet store= new HashSet();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("duplicate String"+name);
				
			}
		}
		int num []= {1,2,3,4,5,6,7,8,2,4,6};
		HashSet numStore= new HashSet();
		for(int numbers:num) {
			if(numStore.add(numbers)==false) {
				System.out.println("the duplicate element::>>"+numbers);
				
			}
		}
		
	}

}
