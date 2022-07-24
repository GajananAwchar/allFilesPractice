package abstractMethod_AndClass;

public class Abstract_Child  extends AbstractMethod_Parent{
	public void WithDraw() {
		System.out.println("you can withdraw money");
	}
	public void Deposit() {
		System.out.println("you can Deposit money");
	}
	public void Transfer() {
		System.out.println("you can Transfer money");
	}
	public static void main(String[] args) {
	
		Abstract_Child ac= new Abstract_Child();
		ac.color();
		ac.Deposit();
		ac.Transfer();
		ac.WithDraw();
		
		
	}

}
