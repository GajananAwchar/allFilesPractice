package practice_Selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandleGetTitle {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle is " +parentWindowHandle); 
		 // click on click button
		driver.findElement(By.xpath("//button[text()='    click   ']")).click(); 
		Thread.sleep(2000);
// save all handles in allHandles  list  which is string type variable
// Set class is java class which store unique data types variables values
		Set<String> allHandles = driver.getWindowHandles();
		for (String i:allHandles) {
//save title of all handles and save in title  which is string type variable 
			String title =driver.switchTo().window(i).getTitle();
			System.out.println("title of window is :"+title);
			System.out.println("windowHandle name are : "+i);
// this will check if condition and close if true it will close browser with title Selenium.		
			if (title.contains("Selenium")){     
				driver.close();		  		
			}
		}
	}
}
