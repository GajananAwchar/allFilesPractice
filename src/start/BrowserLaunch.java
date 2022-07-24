package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
// 
public class BrowserLaunch {
	WebDriver driver;
	public void  ChromeBrowserLaunch() {   // public method
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	protected void  OperaBrowserLaunch() {  // protected method
		WebDriver driver = new OperaDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr/");
	}
}
