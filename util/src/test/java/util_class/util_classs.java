package util_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//{

//	{
//		
//		
//		
//		public static void flash(WebElement element,WebDriver driver) {  // flash method
//			
//			String bgcolor= element.getCssValue("backgroundColor");//gives the background color of the element
//			
//			for(int i=0; i<500; i++) {  // change the background color multiple times
//				changeColor("#000000",element,driver);  //#000000 -> This represent black
//				changeColor(bgcolor,element,driver);  // change to it's original color
//				
//			}
//		}
//}

//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class util_classs extends javascript_util {
	
	WebDriver driver;
	public String Title;
	 public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
@BeforeTest
public void BT()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(url);
		
}
	@Test(priority=0)
	public void tc1() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement web=	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		Thread.sleep(3000);
		javascript_util.drawBorder(web, driver);	
		javascript_util.changeColor("blue", web, driver);
		
		}
	}