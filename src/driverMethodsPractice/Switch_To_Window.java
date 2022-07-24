package driverMethodsPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.opera.OperaDriver;
public class Switch_To_Window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\operadriver.exe");
		// instance of opera browser
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		// open goole search website
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 driver.findElement(By.id("newWindowBtn")).isDisplayed();
		 driver.findElement(By.id("newWindowBtn")).isEnabled();
		 driver.findElement(By.id("newWindowBtn")).isSelected();
		 	
	
	}
}
