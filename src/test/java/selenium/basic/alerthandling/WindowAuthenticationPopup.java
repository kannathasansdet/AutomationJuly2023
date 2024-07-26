package selenium.basic.alerthandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//To launch the chrome driver
		
		/*
		 * https://the-internet.herokuapp.com/
		 * driver.get("http://admin:admin@yoururl.com");
		 * 
		 * username:password@URL
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(5000);
		
	}

}
