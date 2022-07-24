package javaTutorials;

public class MethodWithArgs {

	public static void main(String[] args) {
		MethodWithArgs meth1 = new MethodWithArgs();
		MethodWithArgs meth2 = new MethodWithArgs();
		MethodWithArgs meth3 = new MethodWithArgs();
		MethodWithArgs meth4 = new MethodWithArgs();
		meth1.Bank();
		meth2.Login();
		meth3.payment();
		meth4.Balance();
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
	

}
