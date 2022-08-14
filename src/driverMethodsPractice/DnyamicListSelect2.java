package driverMethodsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DnyamicListSelect2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();      // maximize window
			driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		// select countries on above page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement> country = driver.findElements(By.xpath("//ul[@role='tree']//li[@aria-selected='false']"));
		Thread.sleep(4000);
		int  numberOfLan = country.size();
		System.out.println("The size of Countries is "+numberOfLan);
		Thread.sleep(5000);
		for (WebElement element:country) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String countryList=element.getText();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(countryList);
			Thread.sleep(5000);
			if(countryList.equalsIgnoreCase("United States of America")) {
				element.click(); 
				
				break;
			}
			}      driver.close();

	}

}
