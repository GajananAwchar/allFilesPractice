package javaBascis;

public class Check_VarArgValid {

	public static void m1(int... x)
	{System.out.println("var-arg method");
		
	}
	public static void m1(int x) {
		System.out.println("General method");
	}
	public static void main(String[] args) {
		
		m1(); // you will get var-arg method
		m1(10,20); // you will get var-arg method
		m1(10);  // you will get var-arg method
		m1(10,20,400);
		m1(0);
		m1();
		
	}
	}

