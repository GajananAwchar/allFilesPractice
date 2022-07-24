package interviewQuestions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aarya\\eclipse\\"
				+ "Eclipse Ide 2021 22\\firstProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		takeScreenshot("Fb_LoginPage");
	}
	public static void takeScreenshot(String fileName) throws IOException {
	File file=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\Aarya\\Desktop"+fileName+".jpg"));  // append string concatation to save file as in jpg format
		
	}

}
