package selenium.programs;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting the driver executable
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	               
	    //Initiating your chromedriver
	    WebDriver driver=new ChromeDriver();
	    
	    		
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(10))
	    .pollingEvery(Duration.ofMillis(250))
	    .ignoring(NoSuchElementException.class);
	   
	    
	    WebElement email = driver.findElement(By.id("email"));
	    wait.until(ExpectedConditions.visibilityOf(email)).sendKeys("ronw@gmail.com");
	    
	    WebElement password = driver.findElement(By.id("pass"));
	    wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("Testit");
	    
	    WebElement loginbutton = driver.findElement(By.id("loginbutton"));
	    wait.until(ExpectedConditions.visibilityOf(loginbutton)).click();
	    
	   	 driver.close();
	}

}
