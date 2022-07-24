package practice_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_New_Account_Facebook {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.get("https://www.facebook.com/");
			driver.manage().deleteAllCookies();
			driver.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("abcd");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("abc");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("awchar@gmail.com");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("awchar@gmail.com");
			Thread.sleep(4000);
			driver.findElement(By.name("reg_passwd__")).sendKeys("New@1234567");
			Thread.sleep(4000);
			WebElement dayElement = driver.findElement(By.id("day"));
			Thread.sleep(1000);
			WebElement monthElement = driver.findElement(By.id("month"));
			Thread.sleep(1000);
			WebElement yearElement = driver.findElement(By.id("year"));
			Thread.sleep(1000);
			Select dayDropdown = new Select(dayElement);
			Thread.sleep(4000);
			Select monthDropdown = new Select(monthElement);
			Thread.sleep(4000);
			Select yearDropdown = new Select(yearElement);
			Thread.sleep(4000);
			dayDropdown.selectByVisibleText("20");
			monthDropdown.selectByVisibleText("Oct");
			Thread.sleep(4000);
			yearDropdown.selectByVisibleText("2008");
			Thread.sleep(5000);
			
			//driver.findElement(By.xpath("//label[text()='Board']/following-sibling::input")).click();
			driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
			//label[text()='Female']/following-sibling::input
			Thread.sleep(4000);
			driver.findElement(By.name("websubmit")).click();			
			Thread.sleep(8000);
			
			
				
		}

}
