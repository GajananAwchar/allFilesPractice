package driverMethodsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Launch_ChromeBrowser {
WebDriver driver;
@BeforeMethod
	public void start () {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aarya\\eclipse\\Eclipse Ide 2021 22\\firstProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
@Test
public void GoogleWebSiteLaunch () {
	driver.get("https://www.google.com/");
	driver.getCurrentUrl();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	String currentUrl = driver.getCurrentUrl();
	String title =driver.getTitle();
	System.out.println("google title is "+title);
	System.out.println(currentUrl);
	Assert.assertTrue(currentUrl.contains("https://www.google.com/"));
	
	
}
@Test
public void YahooWebSiteLaunch () {
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	driver.getCurrentUrl();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	String currentUrl = driver.getCurrentUrl();
	String title =driver.getTitle();
	System.out.println("yahoo title is "+title);
	System.out.println(currentUrl);
	Assert.assertTrue(currentUrl.contains("https://in.search.yahoo.com/?fr2=inr"));

}
@AfterMethod
public void closeResources() {
	driver.close();
}
}