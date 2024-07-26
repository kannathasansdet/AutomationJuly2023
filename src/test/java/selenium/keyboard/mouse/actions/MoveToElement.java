package selenium.keyboard.mouse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver= new ChromeDriver(op);

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/");
		
		WebElement movetoelement = driver.findElement(By.xpath("//span[text()='KIDS']"));
		
		
		//syntax pass my driver Actions Class
		Actions builder= new Actions(driver);
		
		builder.moveToElement(movetoelement).perform();
		
		Thread.sleep(5000);
		
		
		//perform()-if use this only action will completed
		
		driver.findElement(By.xpath("//a[text()='Denims & Trousers']")).click();

	}

}
