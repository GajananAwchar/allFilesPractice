package stringPractice;

public class ArrayIntType {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0]= 1;
		a[1]= 2;
		a[2]= 3;
		a[3]= 4;
		a[4]= 5;
		//System.out.println(a[4]);
		for(int i=0;i<=a.length-1; i++) {
			String b= a.toString();
			System.out.print(b);
		}

	}
}
