package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("This is Textbox");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Hello");
		WebElement framePracticeEle = driver.findElement(By.id("selectnav1"));
	Select framePractice = new Select(framePracticeEle);
	framePractice.selectByVisibleText("- Java");
	}

}
