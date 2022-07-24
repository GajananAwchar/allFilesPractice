package javaBascis;

public class Local_Variable {
	// here age is local variable
			// it is only limited to pupAge() method , in which it is defined
			public void pupAge() {
				int age =0;
				age = age+10;
				System.out.println("Puppy age is "+age);
			}
			public static void main(String[] args) {
				Test check = new Test();
				check.pupAge();
			}

	}
