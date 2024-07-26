package selenium.keyboard.mouse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement ddb = driver.findElement(By.id("form:conpnl_header"));

		Actions op=new Actions(driver);

		Thread.sleep(4000);

		op.dragAndDropBy(ddb, 100, 0).perform();

	}

}
