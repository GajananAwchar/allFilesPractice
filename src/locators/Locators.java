package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
// used xpath child axes, following  and preceding axes method.
	public static void main(String[] args) throws InterruptedException {
		// open Chrome Browser
		WebDriver driver = new ChromeDriver();
		// open web site
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		// maximize  browser window
		driver.manage().window().maximize();
		//select first name text box
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][1]")).click();
		//Enter first name
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][1]")).sendKeys("Gajanan");
		//select last name text box
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][2]")).click();
		//Enter last name
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][2]")).sendKeys("Awchar");
		//select email text box
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][3]")).click();
		//enter email
		driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][3]")).sendKeys("gawchar555@gmail.com");
		// Select  password text box
		driver.findElement(By.xpath("//label[text()='Repeat Password']/preceding::input[1]")).click();
		// Enter in password text box
		driver.findElement(By.xpath("//label[text()='Repeat Password']/preceding::input[1]")).sendKeys("New@2016");
		// Select  repeat password text box
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input[1]")).click();
		// Enter in  repeat password text box
		driver.findElement(By.xpath("//label[text()='Repeat Password']/following::input[1]")).sendKeys("New#2004");
		// wait for 4 seconds 
		Thread.sleep(4000);
		// Click on register button
		driver.findElement(By.xpath("//button[@class='btn'][1]")).click();
		// wait for 4 seconds 
		Thread.sleep(4000);
		// Close Browser
		
		driver.findElement(By.xpath("//font[text()='DOWNLOADS']")).click();
		
		
		

	}

}
