 package practice_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.get("https://en-gb.facebook.com/");
			driver.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(5000);
			WebElement name =driver.findElement(By.name("firstname"));
			WebElement email =driver.findElement(By.name("reg_email__"));
			Thread.sleep(5000);
			if(name.isDisplayed()&& name.isEnabled()) {
				name.sendKeys("abc");
			}
			else {
				System.out.println("name textfield is not displayed or enabled");
			}
			Thread.sleep(5000);
			
			if(email.isDisplayed()&& email.isEnabled()) {
				email.sendKeys("abc@gmail.com");
			}
			else {
				System.out.println("email textfield is not displayed or enabled");
			}
			Thread.sleep(5000);
			WebElement maleButton =driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
			Thread.sleep(5000);
			if (maleButton.isSelected()==false) {
				maleButton.click();
			}
			
			Thread.sleep(4000);
			String title=driver.getTitle();
			Thread.sleep(4000);
			System.out.println("this is facebook title"+title);
			Thread.sleep(4000);
			driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
			String title1=driver.getTitle();
			Thread.sleep(4000);
			System.out.println("this is facebook title"+title1);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.navigate().forward();
			Thread.sleep(4000);
			
			driver.manage().deleteAllCookies();
			driver.close();
			
			
			
				
		}

}
