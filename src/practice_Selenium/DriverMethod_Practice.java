package practice_Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod_Practice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/");
		// this will print title of web page
		
		System.out.println("The title of webpage is : "+driver.getTitle());
		System.out.println("The current url of webpage is :"+driver.getCurrentUrl());
		
	}

}
