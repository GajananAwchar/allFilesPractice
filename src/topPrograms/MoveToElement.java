package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		//Create Web Element Object
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.name("one")))
		.clickAndHold()
		.moveToElement(driver.findElement(By.name("twelve")))
		.release()
		.build()
		.perform();
		Thread.sleep(5000);
		
	}

}
