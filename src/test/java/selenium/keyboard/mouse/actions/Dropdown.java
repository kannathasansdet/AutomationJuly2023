package selenium.keyboard.mouse.actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/*Example 1- Handling dropdown using Selenium WebDriver
Our use-case would follow the steps below-

Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Old Style Select Menu using the element id.
Print all the options of the dropdown.
Select 'Purple' using the index.
After that, select 'Magenta' using visible text.
Select an option using value.
Close the browser
 */

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		// Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Step#2- Launching URL
		driver.get("https://letcode.in/dropdowns");

		// Maximizing window
		driver.manage().window().maximize();

		WebElement dropdwon = driver.findElement(By.id("fruits"));

		Thread.sleep(3000);

		// Step#3- Selecting the dropdown element by locating its id
		Select select = new Select(dropdwon);

		// Step#4- Printing the options of the dropdown

		select.selectByValue("3");

		Thread.sleep(3000);

		// Get list of web elements

		List<WebElement> lst = select.getOptions();

		// Looping through the options and printing dropdown options
		
		System.out.println("The dropdown options are:");

		for (WebElement options : lst)

			System.out.println(options.getText());

		driver.quit();
	}

}
