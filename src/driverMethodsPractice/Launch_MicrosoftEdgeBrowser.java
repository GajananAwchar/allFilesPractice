package driverMethodsPractice;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_MicrosoftEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.close();
	}

}
