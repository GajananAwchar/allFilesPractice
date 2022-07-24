package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRandom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(4000);
		driver.findElement(By.id("firstName")).sendKeys("Gajanan");
		driver.findElement(By.name("lName")).sendKeys("Awchar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='bcRadioButton'][1]")).click();
		driver.findElement(By.cssSelector(".bcCheckBox[id='englishchbx']")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("abc@30330");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
