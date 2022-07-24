package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=us");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-username")).sendKeys("gajananawchar@ymail.com");
		driver.findElement(By.id("login-signin")).click();
		
		

	}

}
