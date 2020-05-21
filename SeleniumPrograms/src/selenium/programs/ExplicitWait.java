package selenium.programs;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
    
	    //setting the driver executable
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	               
	    //Initiating your chromedriver
	    WebDriver driver=new ChromeDriver();
	    
	    		
	    driver.manage().window().maximize();

	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);                       
    	    wait.withTimeout(10, TimeUnit.SECONDS);      
    	    wait.pollingEvery(250, TimeUnit.MILLISECONDS);
    	    wait.ignoring(NoSuchElementException.class);
    		
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("https://www.rentomojo.com/");
    driver.findElement(By.xpath("//span[@class='rm-city__selectorBoxLoca'][contains(text(),'Delhi')]")).click();

    //explicit wait            
   // WebDriverWait wait=new WebDriverWait(driver, 120);
    //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button"))));
   driver.findElement(By.xpath("//div[@class='Campaign__innerWrapper']/button")).click();
    driver.close();
   }
}