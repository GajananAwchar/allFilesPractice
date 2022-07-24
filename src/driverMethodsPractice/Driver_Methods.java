package driverMethodsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;

public class Driver_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String titleGoogle = driver.getTitle();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the current Url of page is "+currentUrl);
		if (currentUrl.equalsIgnoreCase(""))
		System.out.println("the title of webpage is :"+titleGoogle);
		if (titleGoogle.equalsIgnoreCase("Google")) {
			System.out.println(" homepage of google launched");
		}
		else {
			System.out.println("homepage of google is not launched");
		}
		
		driver.close();
		
	}

}
