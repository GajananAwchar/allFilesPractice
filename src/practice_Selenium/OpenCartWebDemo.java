package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartWebDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement registerEle = driver.findElement(By.xpath("//a[text()='Login']//following-sibling::a"));
		registerEle.click();
		WebElement textboxUser = driver.findElement(By.id("input-username"));
		textboxUser.sendKeys("Gajanan");
	}

}
