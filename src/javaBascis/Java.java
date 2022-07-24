package javaBascis;

interface i {
	public void start();
}
class A {
	public void mA() {
		System.out.println("this parent class method");
	}}
	class B extends A implements i {
		public void start() {
			System.out.println("implementing method of interface");
		}
		public void mB() {
			System.out.println("this child class method");
		}
}
public class Java {

	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new B();
		B obj2 =new B();
		obj.
		//B obj3 new A();
			
	}
}
