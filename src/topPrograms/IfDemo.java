package conditionalStatement;

public class IfDemo {

	public static void main(String[] args) {
		
		System.out.println("Test Started");
		
		String browser ="Firefox";
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.out.println("test case executed on Chrome");
			
		}
		else
		{
			System.out.println("test case executed on Firefox");
			
		}
		
		System.out.println("Test End");
		
	}

}
