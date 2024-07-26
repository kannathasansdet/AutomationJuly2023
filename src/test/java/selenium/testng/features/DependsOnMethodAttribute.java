package selenium.testng.features;

import org.testng.annotations.Test;

public class DependsOnMethodAttribute {
	
		@Test(priority = 1)
		public void signUp() {
			System.out.println("signUp");
		}
		@Test(dependsOnMethods = "signUp")
		public void login() {
			System.out.println("login");
		}
		
		/*	@Test(dependsOnMethods = "testNgBasic.LearnAttributes1.signUp", priority = -1)

			* The above format is applicable when your class is there in other packages
		 * 
		 * @Test(dependsOnMethods = "signUp", priority = -1) public void login() {
		 * When your class is in same package you can give same like above
		 * 
		 * System.out.println("login"); }
		 */
		@Test(dependsOnMethods = "login")
		public void searchProduct() {
			System.out.println("search Product");
			  throw new RuntimeException();

				 			 
		}
		
		
		@Test(dependsOnMethods = "searchProduct" ,priority = 3,alwaysRun = true)
		public void addToCart() {
			System.out.println("add to cart");
		}

		@Test(priority = 4)
		public void signOut() {
			System.out.println("sign out");
		}


	}


