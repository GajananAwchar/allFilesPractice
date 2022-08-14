package verify_Broken_Links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Broken_Links {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();      // maximize window
		driver.get("https://www.google.co.in/");
	List <WebElement> allLinks	=driver.findElements(By.tagName("a"));
	System.out.println("all links are"+allLinks.size());
	for (int i=0; i<allLinks.size();i++) {
	WebElement linkEle=	allLinks.get(i);
	String url= linkEle.getAttribute("href");
		System.out.println(url);
		verifyLinkActive(url);}
	}
	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection urlConnect =(HttpURLConnection) url.openConnection();
			urlConnect.setConnectTimeout(3000);
			urlConnect.connect();
			if(urlConnect.getResponseCode()==200) {
				System.out.println(linkUrl+"-"+urlConnect.getResponseMessage());
				
			}
			if(urlConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+"-"+urlConnect.getResponseMessage()+"-" +HttpURLConnection.HTTP_NOT_FOUND);
			}
			}
			catch(Exception e) {
				
			}
}}