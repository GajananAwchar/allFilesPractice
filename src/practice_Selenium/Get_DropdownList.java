package practice_Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_DropdownList {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.get("https://www.facebook.com/");
			driver.manage().deleteAllCookies();
			driver.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(6000);
			WebElement dayElement = driver.findElement(By.id("day"));
			Thread.sleep(5000);
			Select dayDropdown = new Select(dayElement);
			Thread.sleep(5000);
			List<WebElement> listdays  = dayDropdown.getOptions();
			Thread.sleep(1000);
			System.out.println("totaldays are: " +listdays.size());
			Thread.sleep(1000);
			for (int i=0; i<listdays.size(); i++) {
				String dayvalue = listdays.get(i).getText();
				System.out.println(dayvalue);
			}
			WebElement monthElement = driver.findElement(By.id("month"));
			Thread.sleep(4000);
			Select monthDropdown = new Select(monthElement);
			List<WebElement> listAllMonths = monthDropdown.getOptions();
			Thread.sleep(4000);
			System.out.println("total months are " + listAllMonths.size());
			for (int j=0;j<listAllMonths.size(); j++) {
				String monthValue = listAllMonths.get(j).getText();
				System.out.println(monthValue);
				Thread.sleep(5000);	
			}
			driver.close();				
		}

}
