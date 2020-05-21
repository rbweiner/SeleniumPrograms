package selenium.programs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	public static void main(String[] args) throws InterruptedException {
		
		// System Property for gecko Driver   
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		// create an object for FirefoxDriver class.       
		WebDriver driver=new ChromeDriver();
		//maximize the browser 
		driver.manage().window().maximize(); 
		//navigate to the url
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//handling alert with OK and CANCEL button
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.id("CancelTab")).click(); 
		Thread.sleep(3000);
		
		//creating the alert object
		Alert act=driver.switchTo().alert();
		//print the alert message
		System.out.println(act.getText());
		//validating the alert message
		String msg=act.getText(); 
			if(msg.equals("Press a Button !"))
			{
				System.out.println("actual alert message");
			}
			else{
				System.out.println("in-correct alert message");
			}
		act= driver.switchTo().alert(); 
		
		//click on OK button
		act.accept(); 
		msg=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("click on the OK button:" + msg);
		Thread.sleep(5000); 
		//again move to main button to press cancel button
		driver.findElement(By.cssSelector("#CancelTab")).click();
		act= driver.switchTo().alert();
		Thread.sleep(5000);  
		//click on CANCEL Button
		act.dismiss(); 
		msg=driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println("click on the CANCEL button:" + msg);
		Thread.sleep(3000);
		
		//closing the broswer window                     
		driver.close();
	}
}

