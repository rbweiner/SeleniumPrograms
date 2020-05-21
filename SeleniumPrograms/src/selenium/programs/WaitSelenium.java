package selenium.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String eTitle = "Facebook - Log In or Sign Up";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://www.facebook.com" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
	}
}
