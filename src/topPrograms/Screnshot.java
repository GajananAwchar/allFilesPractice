package topPrograms;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screnshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\coding\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// scroll to bottom of page
		
	WebElement ele= driver.findElement(By.xpath("//img[contains(@src,'//s2.rdbuz.com/web/images/home/a')]"));
	// scroll to element on page
	String str= ele.getCssValue("font size");
		Thread.sleep(2000);
		System.out.println(str);
		js.executeScript("arguments[0].scrollIntoView();", ele);
	Thread.sleep(2000);
	// scroll to bottom of page
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	// scroll by pixel (x,y)
	js.executeScript("window.scrollBy(0,-350)", "");
	TakesScreenshot scr= (TakesScreenshot)driver;
	File srcFile= scr.getScreenshotAs(OutputType.FILE);
	File DesFile = new File("C:\\Users\\Aarya\\eclipse\\Eclipse Ide 2021 22"
			+ "\\practiceJava\\Screenshot\\homePageScreen1.png");	
	
	FileUtils.copyFile(srcFile, DesFile);
	
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
    //Copy the file to a location and use try catch block to handle exception
    try {
        FileUtils.copyFile(screenshot, new File("C:\\Users\\Aarya\\eclipse\\Eclipse Ide 2021 22"
        		+ "\\practiceJava\\Screenshot\\homePageScreenshot1.png"));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
	driver.close();
	}

	

}
