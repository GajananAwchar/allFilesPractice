package practice_Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.opera.OperaDriver;
public class RediffMailAlertBox {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
				+ "\\Automation\\Drivers\\operadriver.exe");
		// instance of opera browser
		OperaDriver driver = new OperaDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//alert type : Alert box
		driver.findElement(By.id("Register")).click();
		Alert alertbox =driver.switchTo().alert();
		Thread.sleep(4000);
		 String string2 = alertbox.getText();
		 System.out.println(string2);
		 Thread.sleep(4000);
		alertbox.accept();
		if(string2.contains("Please enter your firstname and lastname")) {
			System.out.println("you switched to alertbox window");}
			else {
				System.out.println("you not switched to alertbox window");
			}
		Thread.sleep(4000);
		driver.close();
		}}
	
	