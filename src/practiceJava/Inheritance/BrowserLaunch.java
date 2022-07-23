package practiceJava.Inheritance;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaunch {
public  void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aarya\\eclipse\\Eclipse Ide 2021 22\\practiceJava\\Driver"
			+ "\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().window().maximize();
	WebElement username= driver.findElement(By.id("txtUsername"));
	username.sendKeys("Admin");
	WebElement pass = driver.findElement(By.id("txtPassword"));
	pass.sendKeys("admin123");
	WebElement login= driver.findElement(By.id("btnLogin"));
	
JavascriptExecutor js =  (JavascriptExecutor)driver;
login.submit();
//js.executeScript("arguments[0].click();", login);
js.executeScript("alert('welcome to orange HRM');");
Alert al= driver.switchTo().alert();
al.accept();
driver.close();
}
	public static void main(String[] args) {
		BrowserLaunch bL= new BrowserLaunch();
		bL.launch();
		System.out.println("launched browser sucessfully");
		
	}

}
