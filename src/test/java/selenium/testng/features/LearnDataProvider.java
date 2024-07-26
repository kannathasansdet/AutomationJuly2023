package selenium.testng.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LearnDataProvider {

	//	@Parameters({"emailId"})
	@Test(dataProvider = "logintestdata", 
			dataProviderClass = DataUtils.class)
	public void login(String email,String pass) throws InterruptedException {
	
		
		//		System.err.println("from parameters: "+id);
		/*
		 * System.err.println("Email: "+data[0]); System.err.println("Pass: "+data[1]);
		 */

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click(); 
		System.out.println("Logged in successfully");
		String title =
				driver.getTitle();
		System.out.println("Title is "+title); 
		
		driver.quit();

	}

}
