package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SeleniumWebElement {
 
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	Thread.sleep(4000);
	driver.findElement(By.className("nav-input")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("GPRS")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	driver.findElement(By.partialLinkText("(Renewed) VOTO V9 (5.85")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	
	Thread.sleep(2000);
	driver.navigate().to("https://login.yahoo.com");
	driver.findElement(By.cssSelector("#login-username")).sendKeys("sharma_viru@yahoo.com");	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#login-signin")).click();
	
	Thread.sleep(2000);
	driver.quit();
	}
}