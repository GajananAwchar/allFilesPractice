package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		WebElement nameElement = driver.findElement(By.xpath("//label[text()='First Name ']//following-sibling::input"));
		nameElement.sendKeys("Gajanan");
		WebElement lastName = driver.findElement(By.xpath("//label[text()='Last Name']//following-sibling::input[1]"));
		lastName.sendKeys("Awchar");
		WebElement email = driver.findElement(By.xpath("//div[@class='container']//following::input[@type='text'][3]"));
		email.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//label[text()='Password']//following::input[1]"));
		pass.sendKeys("abc@32021");
		WebElement repeatPass = driver.findElement(By.xpath("//label[@for='psw-repeat']//following-sibling::input"));
		repeatPass.sendKeys("abc@32031");
		Thread.sleep(8000);
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		register.click();
		Thread.sleep(10000);
		
		
	}

}
