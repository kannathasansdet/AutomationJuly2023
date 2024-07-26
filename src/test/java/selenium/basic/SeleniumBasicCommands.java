package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommands {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().window().fullscreen();

		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();

		Thread.sleep(4000);

		driver.findElement(By.name("firstname")).sendKeys("Kannathasan");

		// get title

		String title = driver.getTitle();
		System.out.println(title);

		// get url

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// print text in console

		Thread.sleep(4000);

		String text = driver.findElement(By.name("websubmit")).getText();

		driver.findElement(By.cssSelector("input[type=\"email\"]"));
		System.out.println(text);


	}

}
