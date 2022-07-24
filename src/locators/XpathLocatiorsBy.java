package locators;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatiorsBy {
// used xpath child axes, following  and preceding axes method.
	public static void main(String[] args) throws InterruptedException {
		// open Chrome Browser
		WebDriver driver = new ChromeDriver();
		// open web site
		driver.get("https://msbte.org.in/");
		// maximize  browser window
		//driver.manage().window().maximize();
		//select first name text box
		//driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][1]")).click();
		//Enter first name
		//driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][1]")).sendKeys("Gajanan");
		

	}

}
