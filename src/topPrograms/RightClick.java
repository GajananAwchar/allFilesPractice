package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		//Create Web Element Object
		WebElement button= driver.findElement(By.id("rightClickBtn"));
		//Create Action Object
		Actions act = new Actions(driver);
		act.contextClick(button).build().perform();
		
		

	}

}
