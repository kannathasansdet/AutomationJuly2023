package selenium.testng.features;

import org.testng.annotations.Test;

public class LearnPriority {

	
	@Test(priority=1,description="This test case deals about eidtlead functionality",invocationCount=7)
	public void editLead() {
		System.out.println("editLead");

	}
	
	@Test
	public void deletelead() {
		System.out.println("deletelead");

	}
	
	@Test
	public void aeletelead() {
		System.out.println("aeletelead");

	}

	@Test(priority=3)
	public void creatLead() {
		System.out.println("creatLead");
	}
	
	@Test(priority=-2)
	public void duplicateLead() {
		System.out.println("duplicateLead");

	}
	
	
}
