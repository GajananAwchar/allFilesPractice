package topPrograms;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TextSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\coding\\Chrome Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	WebElement ele= driver.findElement(By.xpath("//img[contains(@src,'//s2.rdbuz.com/web/images/home/a')]"));
	// scroll to element on page
	Thread.sleep(2000);
	String str= ele.getCssValue("font-size");
	System.out.println("font- size"+str);
Dimension d= 	ele.getSize();
System.out.println("dimension : "+d);
System.out.println("class name; "+ele.getClass());
	String tagName= ele.getTagName();
System.out.println("tagName of ele = "+tagName);
String attribute= ele.getAttribute("src");
System.out.println(attribute);
ele.getCssValue(attribute);
Dimension size= ele.getSize();
int height= size.getHeight();
int width= size.getWidth();
System.out.println("height"+ height);
System.out.println("width" +width);
Thread.sleep(2000);
driver.close();
}
}
