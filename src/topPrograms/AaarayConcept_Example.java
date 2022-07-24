package arrayConcept;

public class AaarayConcept_Example {

	public static void main(String[] args) {
		// by using array we can store multiple variables of same data type
		// each element is stored  in each location is identified by index value
		// we can read any element by its index value
		// we can't store different data type elements here
		int a[] = new int [5];  // based on limit we can store only those number of elements here. 5
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		// we can read all elements by using for loop
		System.out.println("printing values upto index 2");
		// here we can print any limited number of values in
		//sequence from array by for loop by giving index 
		for (int i=2; i<4; i++) {
			
			System.out.println(a[i]);
		}
		System.out.println("By for each enhanced loop we can print all values");
		// here no need to give increment 
		for (int j:a) {
			System.out.println(j);
			
		}
}}
