package selenium.keyboard.mouse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();


		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rc = driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"));
		
		Actions builder= new Actions(driver);
		
		//builder.contextClick(driver.findElement(By.xpath("//span[contains(@class,'context-menu')]"))).perform();

		builder.contextClick(rc).perform();
	}

}
