package practice_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCLickEvent {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
		Actions act1 =new Actions(driver);
		WebElement clickButton1 = driver.findElement(By.id("alertButton"));
		act1.click(clickButton1).build().perform();
		Alert alert1 = driver.switchTo().alert();
		String  string1 = alert1.getText();
		System.out.println("The alert1 is: " +string1);
		Thread.sleep(4000);
		alert1.accept();
		Actions act2 =new Actions(driver);
		WebElement clickButton2 = driver.findElement(By.id("timerAlertButton"));
		act2.click(clickButton2).build().perform();
		Thread.sleep(7000);
		Alert alert2 = driver.switchTo().alert();
		String string2 = alert2.getText();
		System.out.println("Ther alert 2 is: " +string2);
		Thread.sleep(7000);
		alert2.accept();;
		Thread.sleep(5000);
		
	}

}
