package waitPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcTrain_Search {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		// select google search options list
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("irctc railway");
	List <WebElement> webelements =	driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	int numberOfwebelements= webelements.size();
	System.out.println("The index size of searches is :- "+numberOfwebelements);
	for (WebElement element:webelements) {
		String searchList=element.getText();
		System.out.println(searchList);
	if(searchList.equalsIgnoreCase("irctc railway booking")) {
		element.click();
		break;}
	}
	
	 driver.findElement(By.xpath("//h3[text()='IRCTC Next Generation eTicketing System']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	WebElement toSearchELe =driver.findElement(By.xpath("//i[@class='fa fa-exchange rotate90']/following::input[@role='searchbox']"));
	WebElement fromSearchELe =driver.findElement(By.xpath("//i[@class='fa fa-exchange rotate90']/preceding::input[@role='searchbox']"));
	
	 // WebElement search = driver.findElement(By.xpath("//div[@id='TrainBySearch']/div/input[@name='txtfrom']"));
	 //search.sendKeys("");
	

	}}
