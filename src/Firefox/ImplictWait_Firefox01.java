package Firefox;		//To handle synchronization of findelement using Implicit Wait statement with Firefox

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplictWait_Firefox01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//To execute implicit wait. It takes 2 arguments 1st is the duration and 2nd is unit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("loboakarsh303@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("sdss.");;
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@title='Profile']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[.='About'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='Account Settings'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[.='Log Out'])[2]")).click();
		driver.quit();
	}
}


/*
Implicit Wait will not wait for 10 sec it will wait only until it will find the element. 
As soon as element is found it will perform the action
Implicit wait can handle only two methods findElement() and findElements()
TimeUnit is Abstract Enum
It means that in the browser manage the time and implicitly wait for 10 sec in case element is taking longer duration to find the element.
 */
