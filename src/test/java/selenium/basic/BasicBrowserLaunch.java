package selenium.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://softwaretestingo.blogspot.com/2020/08/tag-locator-practice-example-1.html");
	      
	      
	      List<WebElement> list=driver.findElements(By.tagName("a"));
	      
	      int size=list.size();
	      
	      System.out.println("In this page we have found "+size+" links ");

		/*
		 * driver.get("https://omayo.blogspot.com/");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.partialLinkText("popup windowtriuewriuewyiu")).click();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("email")).sendKeys("kannathasan.e@gmail.com");
		 * 
		 * 
		 * WebElement emailtextBox = driver.findElement(By.name("email"));
		 * 
		 * emailtextBox.sendKeys("kannathasane@gmail.com");
		 * 
		 * 
		 * driver.findElement(By.name("pass")).sendKeys("Password123");
		 * 
		 * driver.findElement(By.name("login")).click();
		 * 
		 * driver.quit();
		 */

	}

}
