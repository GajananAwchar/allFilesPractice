package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//Create Web Element Object
		//driver.findElement(By.id("radio2")).click();
		//driver.findElement(By.id("alert1")).click();
		WebElement doubleclickopton = driver.findElement(By.id("testdoubleclick"));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleclickopton).build().perform();
		
		
		

	}

}
