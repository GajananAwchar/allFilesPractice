package driverMethodsPractice;
import org.openqa.selenium.opera.OperaDriver;
public class Launch_OperaBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\operadriver.exe");
		// instance of opera browser
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		// open goole search website
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		// get title of current url
		String title = driver.getTitle();
		// print title of current url
		System.out.println("The title of google search page is :"+title);
		//get current url
		String currentUrl =driver.getCurrentUrl();
		// print current url
		System.out.println("The current Url of page Opened is:"+currentUrl);
		Thread.sleep(2000);
		// navigate to yahoo website
		driver.navigate().to("https://in.search.yahoo.com/");
		Thread.sleep(2000);
		// print url of yahoo page
		System.out.println("current ofUrl  yahoo is:-"+driver.getCurrentUrl());
		Thread.sleep(4000);
		// this will refresh 
		driver.navigate().refresh();
		Thread.sleep(4000);
		//this will go to 1 step back from current URL page
		driver.navigate().back();
		Thread.sleep(4000);
		//this will go to 1 step forward from current URL page
		driver.navigate().forward();
		driver.quit();  // this will close all window opened by driver instance.
		}
}
