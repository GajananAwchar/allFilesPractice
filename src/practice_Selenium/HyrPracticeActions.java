package practice_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HyrPracticeActions {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.id("course"));
	Select sel = new Select(ele);
	sel.selectByVisibleText("Java");
	WebElement firstEle = sel.getFirstSelectedOption();
	System.out.println("first element" +firstEle.getText());
	
	WebElement ele1 = driver.findElement(By.id("ide"));
	Select sele = new Select(ele1);
	sele.selectByVisibleText("Visual Studio");
	WebElement ele11 = sel.getFirstSelectedOption();
	System.out.println("ele11 element" +ele11.getText());
	
		}

}
