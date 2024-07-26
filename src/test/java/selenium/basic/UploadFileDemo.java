package selenium.basic;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadFileDemo {

	public static void main(String[] args) throws InterruptedException {
						
		// Instantiating objects and variables
			
		WebDriver driver = new ChromeDriver();

	    //To maximize browser
							
		driver.manage().window().maximize(); 
				  
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		WebElement uploadEle = driver.findElement(By.xpath("//input[@type='file']"));
		
		Thread.sleep(4000);

	
		//To upload the files 
				
		uploadEle.sendKeys("C:\\Users\\priya\\eclipse-workspace\\testing.qa\\Screenshots\\Selenium1720579314571.png");
		
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//span[.='Start upload']")).click();
		
		Thread.sleep(4000);

		
		WebElement DeleteButton = driver.findElement(By.cssSelector("button[data-type='DELETE']"));
		
				
		
		  if(DeleteButton.isDisplayed()) {
		  
		  Thread.sleep(5000);
		  
		  DeleteButton.click();
		  
		  }
		 
		
		driver.close();
		
		
	}

}
