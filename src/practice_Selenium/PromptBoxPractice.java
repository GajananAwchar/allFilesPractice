package practice_Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
public class PromptBoxPractice {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
+ "\\Automation\\Drivers\\operadriver.exe");
// instance of opera browser
OperaDriver driver = new OperaDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//alert type : Confirm box  with ok and Cancel)
//alert type : Confirm box
driver.findElement(By.xpath("//button[@id='promptBox']")).click();
Alert alert2 = driver.switchTo().alert();
//Thread.sleep(4000);
String string2 = alert2.getText();
System.out.println(string2);
//Thread.sleep(4000);
alert2.sendKeys("Gajanan");
alert2.accept();;;  // this will dismiss confirm box
Thread.sleep(5000);
WebElement stringEle2 =driver.findElement(By.xpath("//div[contains(text(),'You entered text')]"));
String string21= stringEle2.getText();
if(string2.contains("Please enter your name:")) {
System.out.println("you switched to confirmBox");
if (string21.contains("You entered text Gajanan in propmt popup")) {
System.out.println(" you entered name and pressed ok in prompt box "); }
else {
System.out.println("you have not performed action on prompt Box");}	
driver.close();
}}}

			
