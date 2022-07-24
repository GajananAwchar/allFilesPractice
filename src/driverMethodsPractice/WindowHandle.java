package driverMethodsPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

import com.google.common.base.Verify;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\operadriver.exe");
		// open opera browser
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		List <WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Totle links are" +links.size());
		for (int i=0; i<links.size(); i++) {
			
		}
	}}

		