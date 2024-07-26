package selenium.testng.features;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviderDemo {

	
	@Test(dataProvider = "logintestdata")
	public void login(String email,String pass) throws InterruptedException {
		
		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();

		System.err.println("Email: "+email);
		System.err.println("Pass: "+pass);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://letcode.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='LOGIN']")).click(); 
		System.out.println("Logged in successfully");
		driver.quit();

	}
	
	
	  @DataProvider(name="logintestdata") 
	  
	  public String[][] getLoginData() {
	  
	  String[][] data1 = new String[2][2]; 
	  
	  data1[0][0]="koushik350@gmail.com";
	  data1[0][1]="Pass123$";

	  
	  data1[1][0]="koushik1@letcode.in"; 
	  data1[1][1]="Pass123$";
	  
	
	  	  
	  
	  return data1 ; 
	  }
	 
	
	  
	

}