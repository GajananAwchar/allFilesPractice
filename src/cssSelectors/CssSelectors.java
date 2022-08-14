package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class CssSelectors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();      // maximize window		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Gajanan");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Awchar");
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");
		driver.findElement(By.cssSelector(".city")).sendKeys("Parbhani");
		driver.findElement(By.cssSelector("input[placeholder='Country']")).sendKeys("India");
		driver.findElement(By.cssSelector("input[placeholder$='question'")).sendKeys("My Favourite hobby");
		driver.findElement(By.cssSelector("input[placeholder*='answer'")).sendKeys("Cricket");
		driver.findElement(By.cssSelector("input[placeholder$='personal details']")).sendKeys("Hello");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("option[value='apple']")).click();
		driver.findElement(By.cssSelector("option[value='apple']")).click();
		driver.findElement(By.cssSelector("input[value='Confirm']")).click();
		driver.findElement(By.cssSelector("input[value='Buttton1']")).click();
		driver.findElement(By.cssSelector("select>option[value='java']")).click();
		driver.findElement(By.xpath("//a[text()=' Click Here']")).click();
		
		


	}

}
