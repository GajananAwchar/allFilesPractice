package encapsulationConcept;
public class EncapsulationParent {
	private String username="admin";
	private String password="admin@123";
	public void getData() {
		System.out.println(username);
		System.out.println(password);
	}
public  void setData(String username, String password) {
	this.username= username;
	this.password= password;
	}
public  String getPass() {
	System.out.println();
	return password;
	}
public  String getUser() {
	System.out.println();
	return username;
	}
public static void main(String[] args) {
	EncapsulationParent en = new EncapsulationParent();
	System.out.println("old credentials");
	System.out.println("old pass: "+ en.getPass());
	System.out.println("old user : "+en.getUser());
	en.setData("newadmin", "newpass@123");
	System.out.println("new credentials");
	System.out.println("new pass: "+ en.getPass());
	System.out.println("new user : "+en.getUser());
}
}
