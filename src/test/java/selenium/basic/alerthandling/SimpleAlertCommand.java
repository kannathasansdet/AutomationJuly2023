package selenium.basic.alerthandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/alert");

		driver.manage().window().maximize();

		// To click the alert button

	//	driver.findElement(By.id("accept")).click();

		Thread.sleep(5000);

		// Without handling the alert ur tring to print the current URL so you will be
		// ended up with UnhandledAlertException

		// To move to the alert popup
	
		Alert alert = driver.switchTo().alert();
		
		
		alert.accept();

		// To get the text from alert

		
		driver.close();

	}

}
