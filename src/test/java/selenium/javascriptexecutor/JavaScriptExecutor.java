package selenium.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement email=	driver.findElement(By.id("ta1"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value='kannathasan@gmail.com';", email);
		
		String str = (String) jse.executeScript("return document.title");
		
		System.out.println("The title "+str);

		Thread.sleep(9000);
		
		jse.executeScript("window.scrollBy(0,600);");
		//arguments[0].value='Kannathasan@gmail.com';
		
		Thread.sleep(9000);

		jse.executeScript("window.scrollBy(0,-300);");
		
		Thread.sleep(9000);
		
		System.out.println("Value entered");
		
		
		driver.quit();


	}

}

/*
 * //To Scroll down
 * 
 * jse.executeScript("window.scrollBy(0,600);"); Thread.sleep(3000);
 * 
 * //To Scroll up
 * 
 * jse.executeScript("window.scrollBy(0,-300);"); Thread.sleep(3000); . 
 * 
 * // To click
 * 
 * Option 1
 * 
 * WebElement alertbutton= driver.findElement(By.id("alert1"));
 * 
 * jse.executeScript("arguments[0].click()",alertbutton);
 * 
 * Option 2
 * 
 * driver.get("https://login.yahoo.com/?.intl=us");
 * 
 * jse.executeScript("document.getElementById('alert1').click()");
 * 
 * 
 * //To send value
 * 
 * jse.executeScript("arguments[0].value='kanna@gmail.com",email);
 * 
 * //Title of the page with JavascriptExecutor :
 * 
 * 
 * // return the title of the page
 * 
 * js.executeScript("return document.title");
 * 
 * //(same as above) get title driver.getTitle();
 * 
 * 
 * 
 * 
 * // Webpage loaded or not using JavascriptExecutor :
 * 
 * // it returns a Complete as a value if the page is still loading it returns
 * 'interactive' as a result return the state of the page load
 * 
 * js.executeScript("return document.readyState");
 * 
 */