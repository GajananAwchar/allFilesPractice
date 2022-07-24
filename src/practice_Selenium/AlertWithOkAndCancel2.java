package practice_Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
public class AlertWithOkAndCancel2 {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.opera.driver", "C:\\Users\\Aarya\\eclipse-workspace"
+ "\\Automation\\Drivers\\operadriver.exe");
// instance of opera browser
OperaDriver driver = new OperaDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//alert type : Confirm box  with ok and Cancel)
//alert type : Confirm box
driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
Alert alert2 = driver.switchTo().alert();
//Thread.sleep(4000);
String string2 = alert2.getText();
System.out.println(string2);
//Thread.sleep(4000);
alert2.dismiss();;  // this will dismiss confirm box
Thread.sleep(5000);
WebElement stringEle2 =driver.findElement(By.xpath("//div[text()='You pressed Cancel in confirmation popup']"));
String string21= stringEle2.getText();
if(string2.contains("Press a button!")) {
System.out.println("you switched to confirmBox");
if (string21.contains("You pressed Cancel in confirmation popup")) {
System.out.println(" you pressed Cancel in confirm box "); }
else {
System.out.println("you have not performed action on confirm Box");}	
driver.close();
}}}

			
