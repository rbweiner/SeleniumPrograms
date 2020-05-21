package selenium.programs;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setting the driver executable
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	               
	    //Initiating your chromedriver
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.cleartrip.com/");
	    
	    driver.manage().window().maximize();
	  
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    
	    WebElement departloc = driver.findElement(By.xpath("//input[@id='FromTag']"));
	    wait.until(ExpectedConditions.visibilityOf(departloc)).sendKeys("DEL");
	    
	    WebElement datepicker = driver.findElement(By.xpath("//div[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i"));
	    wait.until(ExpectedConditions.visibilityOf(datepicker)).click();
	    
	    WebElement pickdate = driver.findElement(By.xpath("//div[@class='monthBlock last']/table[@class='calendar']/tbody/tr/td[4]/a[text()='4']"));
	    wait.until(ExpectedConditions.visibilityOf(pickdate)).click();
	  	  
	    WebElement arriveloc = driver.findElement(By.xpath("//input[@id='ToTag']"));
	    wait.until(ExpectedConditions.visibilityOf(arriveloc)).sendKeys("ORD");
	    
	    WebElement search = driver.findElement(By.id("SearchBtn"));
	    wait.until(ExpectedConditions.visibilityOf(search)).click();
	   	    
	   	// driver.close();
	}

	}

