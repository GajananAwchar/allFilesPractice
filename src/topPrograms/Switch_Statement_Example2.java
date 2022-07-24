package classDemo;

public class Switch_Statement_Example2 {

	public static void main(String[] args) {
	String streetLightSignal = "Green";
	switch(streetLightSignal) {
	case "Green":
		System.out.println("GO");
		break;
	case "Yellow":
		System.out.println("Caution");
		break;
	case "Red":
		System.out.println("Stop");
		break;
	default:
		System.out.println("no Signal");
		break;
		}
	
	}

}
