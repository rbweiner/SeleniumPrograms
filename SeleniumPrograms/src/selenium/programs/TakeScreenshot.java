package selenium.programs;

import java.io.File;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class TakeScreenshot {
    public static void main(String args[]) throws Exception{

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver;
    	driver = new ChromeDriver();
    	
        //goto url
        driver.get("http://www.facebook.com");

        //Call take screenshot function
        takeSnapShot(driver, "C://users//rbwei//facebook.png") ;   
        Thread.sleep(1000);
        driver.get("http://www.amazon.com");
        takeSnapShot(driver, "C://users//rbwei//amazon.png") ;  
      
       
    }
  
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File DestFile=new File(fileWithPath);

        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
        
    }

}