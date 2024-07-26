package selenium.keyboard.mouse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement scr = driver.findElement(By.id("form:drag_content"));

		WebElement target = driver.findElement(By.id("form:drop_content"));


		Actions op=new Actions(driver);

		Thread.sleep(4000);

		op.dragAndDrop(scr, target).perform();

	}

}
