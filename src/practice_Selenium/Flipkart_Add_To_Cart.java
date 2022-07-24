package practice_Selenium;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart_Add_To_Cart {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			//String parentWindowHandle =driver.getWindowHandle();
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Mobiles']/parent::a")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[contains(@href,'-tab-name=Redmi+9i+Series&param=10')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[text()='REDMI 9i (Midnight Black, 64 GB)']")).click();
			Set <String> windows = driver.getWindowHandles();  // get and store windowHandles in string
			Iterator <String> it= windows.iterator();    // use iterator save windows handles in String 
			String pwh = it.next();
			String cwh = it.next();
			driver.switchTo().window(cwh);   // switch to child window
			Thread.sleep(6000);
		 driver.findElement(By.xpath("//ul[@class='row']//button[text()='ADD TO CART']")).click();
		driver.switchTo().window(pwh);   // switch to pwh
			Thread.sleep(3000);
				} 

}
