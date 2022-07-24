package action_class;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\operadriver.exe");
		
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		// <String>, <WebElement>
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		for(WebElement element:checkbox) {
			element.click();
		}
	}

}
