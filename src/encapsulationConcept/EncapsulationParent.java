package encapsulationConcept;

public class EncapsulationParent {
	String username="admin";
	String password="admin@123";
	public void getData() {
		System.out.println(username);
		System.out.println(password);
	}
public void setData(String username, String password) {
	this.username= username;
	this.password= password;
	}
	//public static void main(String[] args) {
		
		
	//}

}
