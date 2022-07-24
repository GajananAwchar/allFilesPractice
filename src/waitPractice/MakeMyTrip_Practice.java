package waitPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip_Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		/*driver.get("https://www.google.co.in/");
		// select google search options list
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("makemytrip");
	List <WebElement> webelements =	driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	int numberOfwebelements= webelements.size();
	System.out.println("The index size of searches is :- "+numberOfwebelements);
	for (WebElement element:webelements) {
		String searchList=element.getText();
		System.out.println(searchList);
	if(searchList.equalsIgnoreCase("makemytrip flight")) {
		element.click();
		break;}
	}
	 driver.findElement(By.xpath("//h3[text()='Flight Booking, Flight Tickets Booking at Lowest Airfare']")).click();
	 //Thread.sleep(5000);
	  * 
	  */
	//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
	
		driver.get("https://www.makemytrip.com/flights/");
		
		/*WebElement ele1 =driver.findElement(By.xpath("//input[@id='fromCity']"));
	 Actions act= new Actions(driver);
	 act.moveToElement(ele1).click(ele1).build().perform();
	 
	 WebElement fromText = driver.findElement(By.xpath("//input[@data-cy='fromCity']"));
	 act.moveToElement(fromText).click(fromText).build().perform();
	 Thread.sleep(2000);
	 WebElement fromSearch1 = driver.findElement(By.xpath("//input[@placeholder='From']"));
	
	 Thread.sleep(2000);
	 fromSearch1.sendKeys("mumbai");
	fromSearch1.sendKeys(Keys.ARROW_DOWN);
	fromSearch1.sendKeys(Keys.ENTER);
	 WebElement toSearch = driver.findElement(By.xpath("//input[@placeholder='To']"));
		
	 Thread.sleep(4000);
	 toSearch.sendKeys("aurangabad");
	 toSearch.sendKeys(Keys.ARROW_DOWN);
	 toSearch.sendKeys(Keys.ENTER);*/
	 driver.findElement(By.xpath("span[@class='lbl_input latoBold appendBottom10' and text()='DEPARTURE']")).click();
	
	List <WebElement> firsttable= driver.findElements(By.xpath("// //div[@role='gridcell']"));
	int totalNodes = firsttable.size();
	for(int i=0; i<=totalNodes; i++){
		String date= firsttable.get(i).getText();
		System.out.println(date);
		if(date.equals("4\r\n" + 
				"4415")) {
			firsttable.get(i).click();
			break;
			
		}
		
	}
	
	
	}

}
