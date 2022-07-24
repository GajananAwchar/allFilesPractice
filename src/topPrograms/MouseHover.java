package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		//Create Web Element Object
		WebElement element =driver.findElement(By.linkText("Shipping & Payments"));
		//Create Action Object
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();

	}

}
