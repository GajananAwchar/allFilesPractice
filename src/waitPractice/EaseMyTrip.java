package waitPractice;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EaseMyTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		// select google search options list
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("irctc");
		Thread.sleep(10000);
	List <WebElement> webelements =	driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	Thread.sleep(10000);
	int numberOfwebelements= webelements.size();
	Thread.sleep(10000);
	System.out.println("The index size of searches is :- "+numberOfwebelements);
	Thread.sleep(5000);
	for (WebElement element:webelements) {
		String searchList=element.getText();
		Thread.sleep(5000);
		System.out.println(searchList);
		Thread.sleep(3000);

	if(searchList.equalsIgnoreCase("irctc login")) {
		Thread.sleep(3000);
		element.click();
		Thread.sleep(5000);
	
	}
	
	Thread.sleep(5000);
	driver.close();
	}
	}
}
