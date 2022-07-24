package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LocatorsByXpathFacebook2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new OperaDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("email")).sendKeys("7709221235");
		//driver.findElement(By.name("pass")).sendKeys("Seema@1234");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7709221235");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Seema@1234");
		//driver.findElement(By.id("loginbutton")).click();
		//Thread.sleep5000);
		//System.out.println("Facebook Login Done Sucessffuly");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("gawchar555@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//button[@value='1']")).click();
		//driver.findElement(By.id("recovery_code_entry")).sendKeys("12514563");
		
		
		
		
		
		

	}

}
