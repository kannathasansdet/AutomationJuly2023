package selenium.testng.features;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;


public class AlwaysRunAttribute {
	
	/*
	 * By default enabled is true - enabled= True - Which will help to skip the test cases
	 * 
	 * Below program will never execute since it gives high priority on enabled
	 * 
	 * @Test( alwaysRun =true,enabled=true)
		public void signUp() {
			System.out.println("signUp");
		}
	 */	
	
		@Test(description = "this is used to do the sign up")
		public void signUp() {
			System.out.println("signUp");
		}
		
		
		@Test(description ="Used to test login fucntionality")
		public void login() {
			System.out.println("login");
			
			 throw new NoSuchElementException("element not there"); 
		}
		
		  @Test(dependsOnMethods = "login")
		  
		  public void searchProduct() { 
			  
			  System.out.println("search Product"); }
		 
		

	}


