package javaTutorials;

public class MethodConcept {

	public static void main(String[] args) {
		MethodConcept meth1 = new MethodConcept();
		MethodConcept meth2 = new MethodConcept();
		MethodConcept meth3 = new MethodConcept();
		MethodConcept meth4 = new MethodConcept();
		
		meth1.Bank();
		meth2.Login();
		meth3.payment();
		meth4.Balance();
		meth4.login1();
		meth4.addtion(10, 20);
	
	}
	
	public void addtion (int a, int b) {
		
		 int c=a+b;
		System.out.println(c);
	}
	
	public void Login () {
		
		System.out.println("login sucessful");
	}
	public void Bank () {
		System.out.println("Select Bank");
	}
	public void payment() {
		System.out.println("payment done");
	}
	public void Balance() {
		System.out.println("get balance");
	}
	public void login1 () {
		
		System.out.println("login sucessfully");
	}
	
	

}
