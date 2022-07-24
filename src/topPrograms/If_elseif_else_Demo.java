package conditionalStatement;
// ladder if elseif .... else demo
public class If_elseif_else_Demo {

	public static void main(String[] args) {
		
		System.out.println("Test Started");
		
		String browser ="safari";
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			System.out.println("test case executed on Chrome");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("test case executed on Firefox");
			}
			
			else if(browser.equalsIgnoreCase("iE"))
			{
				System.out.println("test case executed on IE");
		}
			else
			{
				System.out.println("kindly provides valid Browser Names");
			}
		System.out.println("Test End");
	}
}
