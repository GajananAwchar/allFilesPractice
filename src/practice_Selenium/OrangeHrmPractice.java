package practice_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		WebElement adminButton = driver.findElement(By.xpath("//b[text()='Admin']"));
		Actions act= new Actions(driver);
		act.moveToElement(adminButton).perform();
		Thread.sleep(5000);
		WebElement jobButton = driver.findElement(By.xpath("//a[text()='Job']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(jobButton).perform();
	}

}
