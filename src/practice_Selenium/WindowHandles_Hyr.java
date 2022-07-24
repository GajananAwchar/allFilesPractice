package practice_Selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandles_Hyr {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aarya\\eclipse\\Eclipse Ide 2021 22\\firstProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		//String parentWinHandle= driver.getWindowHandle();
		// open new window
		driver.findElement(By.id("newWindowBtn")).click();
		driver.switchTo().defaultContent();
		// open new tab in same window
		driver.findElement(By.id("newTabBtn")).click();
		driver.switchTo().defaultContent();
		// open multiple browser window
		driver.findElement(By.id("newWindowsBtn")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("newWindowsBtn")).click();
		driver.switchTo().defaultContent();
		// open multiple tabs
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String> allHandles = driver.getWindowHandles();
	
	
for (String handle:allHandles) {
	System.out.println(handle);
	String windowTitle= driver.getTitle();	
	System.out.println(windowTitle);
	}
driver.quit();
	}
}
