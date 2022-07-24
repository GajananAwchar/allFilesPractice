package interviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCaps {

	public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	DesiredCapabilities caps= new DesiredCapabilities();
	//caps.setAcceptInsecureCerts(true);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cacert.org/");
	
	}

}
