package javaBascis;

public class Var_Arg_Sum_Method {
	
	/*public static void main(String[] args) {
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	
	}
public static void sum(int... x) {
	int total = 0;
	for(int x1 : x) {
		total = total +x1;
	}
	System.out.println("The Sum:" +total);
	
}
}*/
public static void main(String[] args) {
	sum();
	sum(200,400);
	sum(500,-200);
	sum(-50,60);
	sum(10,20,40,50,80,100);
}
	public static void sum(int...x) {
		
	int total= 0;
	for(int x1: x) {
		total = total +x1;
	}
	System.out.println("The Sum is :" +total);
	
}
	
}