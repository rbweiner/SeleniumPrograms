package selenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathProgram {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar"); //xpath for search box
		WebElement searchIcon = driver.findElement(By.xpath("//input[@id='gh-btn']"));//xpath for search button
		searchIcon.click();
	}
}
