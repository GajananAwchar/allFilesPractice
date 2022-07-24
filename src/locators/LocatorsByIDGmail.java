package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class LocatorsByIDGmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new OperaDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		System.out.println("I won't get title="+driver.getTitle());
		Thread.sleep(4000);
		System.out.println("I won't get current url="+driver.getCurrentUrl());
		Thread.sleep(4000);
		System.out.println("I won't get page source="+driver.getPageSource());
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		

	}

}
