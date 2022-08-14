package cssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
public class Css_SelectorsPracticeAll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();      // maximize window
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000)");     // this  javascript will scroll page down by (x,y) value
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#firstName")).sendKeys("shree");   // by css selector id
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("more"); // by css selector attribute name
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".gender")).sendKeys("Male"); // by css selector class name
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='City']")).sendKeys("Aurangabad");  // by css selector attribute name
		// // by css selector  using 2 attribute name for filtering of result from using one attribute
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text'][placeholder='Country']")).sendKeys("India");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,1000)");     // this will scroll page down by (x,y) value
		// by using css selector end with ($) syntax tagname[attributename$='attribute value']
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder$='question']")).sendKeys("favourate sport");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder$='answer']")).sendKeys("Cricket");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder^='Verify']")).sendKeys("Cricket");
	// by using syntax  parentTagName>CHildTagName[attributeName='value of Attribute']
		Thread.sleep(4000);
		// by using css selector start with (^) syntax tagname[attributename^='attribute value']
		driver.findElement(By.cssSelector("div>input[type='checkbox']")).click();  
		Thread.sleep(4000);
		driver.close();	
	}}
