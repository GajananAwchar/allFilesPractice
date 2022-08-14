package driverMethodsPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Switch_To_Window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();      // maximize window
		driver.manage().window().maximize();
		// open goole search website
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 driver.findElement(By.id("newWindowBtn")).isDisplayed();
		 driver.findElement(By.id("newWindowBtn")).isEnabled();
		 driver.findElement(By.id("newWindowBtn")).isSelected();
		 	
	
	}
}
