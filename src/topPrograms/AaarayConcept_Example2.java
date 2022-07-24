package arrayConcept;

public class AaarayConcept_Example2 {

	public static void main(String[] args) {
		// we can store any number of elements
	    int s[] = {10,20,30,40,50,60,70,80};
	    int sum=0;
		// iterate each value
		for (int i:s) {
			System.out.println(i);
			sum = sum+i;
			
		}
		System.out.println("Total sum is of all array elements is : "+sum);
	
	}

}
