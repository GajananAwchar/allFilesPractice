package action_class;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class CheckBox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\operadriver.exe");
		
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("radiooptions"));
	String value = element.getAttribute("value");
	Thread.sleep(2000); 
	System.out.println(value);
	if(value.contains("Male")) {
		element.click();
	}
	
	}
	
}
