package practice_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_HandlesDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle is " +parentWindowHandle);
		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle: handles) {
			System.out.println(handle);
			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
			driver.findElement(By.cssSelector("#firstName")).sendKeys("Ganesh");
			Thread.sleep(5000);
		}
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.cssSelector("#name")).sendKeys("Back");
		Thread.sleep(5000);
		driver.quit();
		}
		
	
}
