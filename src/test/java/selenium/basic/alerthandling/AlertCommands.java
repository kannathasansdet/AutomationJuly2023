package selenium.basic.alerthandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertCommands {
	
@Test
	public void alertMethod() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// To click the alert button

		driver.findElement(By.id("prompt")).click();

		Thread.sleep(5000);

		// Without handling the alert when you tring to print the current URL so you will be ended up with UnhandledAlertException

		// To move to the alert popup

		Alert alert = driver.switchTo().alert();

		// To get the text from alert

		Thread.sleep(5000);

		String prompttxt = alert.getText();

		System.out.println("The Prompt text is " + prompttxt);

		alert.sendKeys("Kanna");

		alert.dismiss();

		String currenturl = driver.getCurrentUrl();

		System.out.println("The Prompt text is " + currenturl);

		Thread.sleep(5000);

		driver.close();

	}

}
