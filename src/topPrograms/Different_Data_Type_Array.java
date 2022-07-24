package arrayConcept;

public class Different_Data_Type_Array {

	public static void main(String[] args) {
		Object a[] = new Object[8];
		a[0]= "I passed";
		a[1]= " my";
		a[2]=  10;
		a[3]=  " std. with ";
		a[4]=	75;
		a[5]= " percentage marks";
		a[6]=  " in Year";
		a[7]=   2005;

		for (Object i:a) {
			System.out.println(i);
			
		}
		System.out.println("  ");
	}

}
