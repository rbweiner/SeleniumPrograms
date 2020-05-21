package selenium.programs;

import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;	

public class HandleWebElements {
	
	public static void main(String[] args) throws Exception {									
		
    	// declaration and instantiation of objects/variables		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbwei\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		
        
        

        //-------------------------------RADIO-BUTTON----------------------------//
        driver.get("http://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        //Call take screenshot function
        takeSnapShot(driver, "C://users//rbwei//radio.png") ; 
        
       
        //------------------------------ CHECKBOX----------------------------------//
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
        
        Thread.sleep(3000); 
        //Selecting Checkbox and using isSelected Method		
        driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
        //Call take screenshot function
        takeSnapShot(driver, "C://users//rbwei//checkbox.png") ; 
        
        //-------------------------------DROP-DOWN---------------------------------//
        driver.get("http://demo.guru99.com/test/newtours/register.php");	
        Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA"); //1 : Method- selectByVisibleText()
		Thread.sleep(3000); 
		drpCountry.selectByValue("ALGERIA");   //2 : Method- selectByValue()
		Thread.sleep(3000); 
		  //Call take screenshot function
        takeSnapShot(driver, "C://users//rbwei//dropdown.png") ; 
		
		//------------------------MULTI SELECT DROP-DOWN BOX------------------------//
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);           //3 : selectByIndex()
		  //Call take screenshot function
        takeSnapShot(driver, "C://users//rbwei//multiselect.png") ; 
		driver.close();		    		
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
