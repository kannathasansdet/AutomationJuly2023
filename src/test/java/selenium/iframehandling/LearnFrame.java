package selenium.iframehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.manage().window().maximize();
		
		//here i am handling frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		Thread.sleep(8000);
		
		//switch back main page 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//i[contains(@class ,'pi-home')]")).click();
		
		Thread.sleep(8000);

		driver.close();

	}

}
