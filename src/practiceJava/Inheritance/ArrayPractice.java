package practiceJava.Inheritance;

public class ArrayPractice {
public static void main(String[] args) {
	int a[] = {2,3,5,4,6,5,5};
	int sum = 0;
	int count = 0 ;
	for(int b:a) {
		sum = sum + b;
			count ++;
	System.out.println(sum);
}
	System.out.println(count);
}
}
