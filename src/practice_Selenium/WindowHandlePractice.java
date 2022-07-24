package practice_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle is " +parentWindowHandle);    
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();  // click on click button
		Thread.sleep(2000);
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle: allHandles) {
			System.out.println(handle);
			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
			driver.findElement(By.linkText("Documentation")).click();  // click on documentation
			Thread.sleep(5000);
		}
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.linkText("Home")).click();  // click on Home 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#dismiss-button div span")).click();
		//driver.findElement(By.xpath("//span[text()='Close']")).click();  // click  cancel button add
		
		Thread.sleep(5000);
		}
		
	
}
