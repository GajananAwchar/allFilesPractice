package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_ActionClass2 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		//WebElement button =driver.findElement(By.id("yesRadio"));
		WebElement button =driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
		Actions act = new Actions(driver);
		act.click(button).build().perform();
	Thread.sleep(5000);
		driver.close();
	
		
		

	}

}
