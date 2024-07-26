package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();

		WebElement emailitxtbox = driver.findElement(By.id("username"));

		emailitxtbox.sendKeys("demosalesmanager");

		Thread.sleep(6000);

		WebElement passwordtextbox = driver.findElement(By.id("password"));

		passwordtextbox.sendKeys("crmsfa");

		Thread.sleep(6000);

		WebElement submitButton = driver.findElement(By.className("decorativeSubmit"));
		
		submitButton.click();

		driver.navigate().back();

		Thread.sleep(6000);

		driver.navigate().forward();

		Thread.sleep(6000);

		driver.navigate().refresh();
		
		Thread.sleep(6000);

		driver.close();

	}

}
