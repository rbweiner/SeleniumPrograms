package selenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class FirstSeleniumScript {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); // this intializes the chrome web browser
	driver.get("https://www.gmail.com/");
	driver.manage().window().maximize(); // this enables the browser to maximize its width and height
	
	//findElement: finds a single WebElement and returns it as a WebElement object.
	driver.findElement(By.id("identifierId")).sendKeys("virendra@gmail.com"); 
	// this finds the web element of textfield-email and sendKeys is used to send the value to the textfield
	// which we are passing here in sendKeys(" "). This will auto-populate the value into the gmail field.
	
	
	driver.findElement(By.className("CwaK9")).click(); // this finds ths web element of the submit button
	
	Thread.sleep(1000);
	String at= driver.getTitle();
	System.out.println("driver title:"+ at);
	String st= "gmail";
	driver.close();
	
	if(at.equalsIgnoreCase(st))
	{
		System.out.println("Test successfull");
	}
	else
	{
		System.out.println("Not successfull");
	}
	} 
}