package cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
public class CSS_SelectorPractice {
	public static void main(String[] args) throws InterruptedException  {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new OperaDriver();
		driver.manage().window().maximize();      // maximize window
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,800)");     // this will scroll page down by (x,y) value
		WebElement textbox = driver.findElement(By.cssSelector("#firstName"));
		boolean displayed =textbox.isDisplayed();
		System.out.println("is textbox displayed: "+displayed);   // print text box displayed status
		boolean enabled =textbox.isEnabled();
		System.out.println("is textbox enabled: "+enabled);       // print text box enabled status
		boolean selected =textbox.isSelected();
		System.out.println("is textbox selected:"+selected);    //  print text box selected status
		if (displayed== true)            // nested if statement
			if (enabled == true) {
				if(selected==false) {	
					textbox.sendKeys("shree");	  // if if statement condition is valid then it will execute sendkeys 
				}
				else { // if nested if condition is not valid it will print below message
					System.out.println("name textbox is not displayed or not enabled or already selected");
				}
				Thread.sleep(4000);
				driver.quit();
		}
	}
	
}
