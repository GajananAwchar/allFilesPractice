package locators;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.opera.OperaDriver;

public class LocatorsXpathAxes {
// used xpath child axes, following  and preceding axes method.
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(4000);
		
		
		
		

	}

}
