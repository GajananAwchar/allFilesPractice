package driverMethodsPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.google.common.base.Verify;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();      // maximize window
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Totle links are" +links.size());
		for (int i=0; i<links.size(); i++) {
			
		}
	}}

		