package myProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FacebookLaunch {

	public static void main(String[] args) {
		WebDriver driver = new OperaDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gajanan@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("New@12345");
		
		

	}

}
