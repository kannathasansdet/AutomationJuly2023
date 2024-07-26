package selenium.iframehandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		
		
		//1st
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		Thread.sleep(8000);

		
		driver.switchTo().frame(1);
		
		Thread.sleep(8000);



		//2nd frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();

		Thread.sleep(8000);

		
		//switch to first frame
		driver.switchTo().parentFrame();//1st access
		
		String str = driver.findElement(By.xpath("//button[text()='Click Me']")).getText();
		
System.out.println(str);
		
		Thread.sleep(8000);

		//main page 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//i[contains(@class ,'pi-home')]")).click();

		Thread.sleep(8000);

		driver.close();
		

	}

}
