package practice_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(4000);
		//alert type : alert box
		Actions act1 =new Actions(driver);
		WebElement clickButton1 = driver.findElement(By.xpath("//button[@id='alertBox']"));
		act1.moveToElement(clickButton1).click().build().perform();
		Alert alert1 = driver.switchTo().alert();
		String  string1 = alert1.getText();
		System.out.println("The alert1 is: " +string1);
		Thread.sleep(4000);
		alert1.accept();
		//alert type : Confirm box
		Actions act2 =new Actions(driver);
		WebElement clickButton2 = driver.findElement(By.xpath("//button[@id='confirmBox']"));
		act2.click(clickButton2).build().perform();
		Thread.sleep(7000);
		Alert alert2 = driver.switchTo().alert();
		String string2 = alert2.getText();
		System.out.println("Ther alert 2 is: " +string2);
		Thread.sleep(7000);
		alert2.accept();
		Thread.sleep(5000);
		//alert type : Prompt box
		Actions act3 =new Actions(driver);
		WebElement clickButton3 = driver.findElement(By.xpath("//button[@id='promptBox']"));
		act3.click(clickButton3).build().perform();
		Thread.sleep(7000);
		Alert alert3 = driver.switchTo().alert();
		String string3 = alert3.getText();
		System.out.println("Ther alert 3 is: " +string3);
		Thread.sleep(7000);
		alert3.sendKeys("Text is Entered:");
		Thread.sleep(7000);
		alert3.accept();
		Thread.sleep(5000);
		driver.close();
	}

}
