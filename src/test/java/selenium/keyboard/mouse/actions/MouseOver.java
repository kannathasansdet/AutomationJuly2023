package selenium.keyboard.mouse.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		

		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		ChromeDriver driver= new ChromeDriver(op);

		driver.manage().window().maximize();


		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");

		WebElement mouseOver = driver.findElement(By.xpath("//a[text()='MEN']"));

		WebElement mouseOverWomen = driver.findElement(By.xpath("//a[text()='WOMEN']"));

		//syntax
		
		Actions builder= new Actions(driver);
		
		//actions class important thing obj.method().perfrom()
		builder.moveToElement(mouseOver).perform();
		
		builder.moveToElement(mouseOverWomen).perform();
		
		
		
	}

}
