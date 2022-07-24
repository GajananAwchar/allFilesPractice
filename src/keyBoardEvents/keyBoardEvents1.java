package keyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoardEvents1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		//act.sendKeys(Keys.ESCAPE).perform();
		//act.sendKeys(Keys.TAB).perform();
		//if(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("ESCAPE")){
		//act.sendKeys(Keys.ALT).perform();	
		act.sendKeys(Keys.ENTER).perform();
		if(driver.findElement(By.cssSelector("#result")).getText().contains("ENTER"))
		{
			System.out.println(" Enter Keys Pressed");
	}
	}	
}