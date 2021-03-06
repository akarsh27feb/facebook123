package Firefox;		//To handle synchronization of getTitle() using Explicit Wait statement with Firefox

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Firefox01 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//To sync the speed of selenium with browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("loboakarsh303@gmail.com");;
		driver.findElement(By.id("pass")).sendKeys("sadbs");;
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//defining the explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		//defining conditions for explicit wait. it will wait for 10 sec unitl title contains facebook
		wait.until(ExpectedConditions.titleContains("Facebook"));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@title='Profile']")).click();
		driver.findElement(By.xpath("(//a[.='About'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='Account Settings'])[5]")).click();
		driver.findElement(By.xpath("(//span[.='Log Out'])[2]")).click();
		driver.quit();
	}
}

/*
To handle explicit wait we need to use WebDriverWait class.
It takes 2 arguments 1st is address of the browser and 2nd is duration in sec
Defining the conditions is compulsory with Explicit wait
 */
