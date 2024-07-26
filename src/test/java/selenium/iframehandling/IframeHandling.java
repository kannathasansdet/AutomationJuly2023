package selenium.iframehandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        
		WebDriver driver = new ChromeDriver();
                       
        // Maximize the window
        driver.manage().window().maximize();
        
		// open webpage
		driver.get("https://chercher.tech/practice/frames");
		
		
		  // store the text value
		  
		  String textValue =driver.findElement(By.xpath("//label/span")).getText();
		  
		  System.out.println(textValue);
		  
		  // switch to frame1
		  
		  driver.switchTo().frame("frame1");
		  
		  // set the value of the textbar to the value stored
		  
		  Thread.sleep(9000);
		  
		  driver.findElement(By.xpath("//body//input")).sendKeys(textValue);
		  
		  Thread.sleep(9000);

			
			// find the frame 3
			WebElement frameUsingWebElement = driver.findElement(By.xpath("//iframe[@id='frame3']"));
			
			// switch to frame 3
			driver.switchTo().frame(frameUsingWebElement);
			
			// find the checkbox
			
			WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
			
			// if checkbox is not selected then click the checkbox
			
			if( !checkbox.isSelected()){
				checkbox.click();
				
				Thread.sleep(9000);
							System.out.println("The Checkbox is clicked successfully");

			}

			
			driver.switchTo().parentFrame();
			
			
			  driver.findElement(By.xpath("//body//input")).clear();
			  
				Thread.sleep(9000);

			  
			  driver.findElement(By.xpath("//body//input")).sendKeys("Kannathasan");
			  
				Thread.sleep(9000);


		
					driver.close();
					
	}
	
}
		 
	


