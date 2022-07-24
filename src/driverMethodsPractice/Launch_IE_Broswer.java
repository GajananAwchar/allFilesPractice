package driverMethodsPractice;

import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch_IE_Broswer {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.InternetExplorerDriver.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\IEDDriverServer.exe");
		
		
        InternetExplorerDriver driver2 = new InternetExplorerDriver();
        driver2.manage().window().maximize();
		driver2.get("https://www.google.co.in/");
		driver2.close();
		Alert al= driver2.switchTo().alert();
		Actions act= new Actions(driver2);
		Select s= new Select(null);
		Iterator it= s.getOptions().iterator();
	s.selectByIndex(4);
		
	}

}
