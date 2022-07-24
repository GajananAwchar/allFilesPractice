package stringPractice;

public class RemoveJunkFromString {
public static void main(String[] args) {
	
String s= "i Am From Mumbai";
String a[] =s.split(" ");
int a1= a.length;
for(int i=a1-1; i>=0;i--) {
	System.out.print(a[i]+" ");
}
}	
}
