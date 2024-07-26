package selenium.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshots {
	
	
      public static void main(String[] args) throws IOException {
                         
    	  
  		WebDriver driver = new ChromeDriver();
  		
  	
                         
          // Maximize the window
          driver.manage().window().maximize();
          
          driver.get("https://configureselenium.blogspot.com/");
                         
          // Convert web driver object to TakeScreenshot
          TakesScreenshot ts = (TakesScreenshot) driver;
        
                         
          // Call getScreenshotAs method to create image file
           File source = ts.getScreenshotAs(OutputType.FILE);
                                    
          // Copy file at destination
                     
          FileUtils.copyFile(source, new File("./Screenshots/Selenium" + System.currentTimeMillis() + ".png"));
          
          System.out.println("the Screenshot is taken");
                         
          // close the current browser
          driver.quit();
     }
  
}