package stepDefinitions;

import CucumberTest.AutomationTest.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@MobileTest")
	public void beforeValidations() {
		System.out.println("Hook before Mobile Tests");
	}
	
	@After("@MobileTest")
	public void afterValidations() {
		System.out.println("Hook after Mobile Tests");
	}
	
	@After("@SeleniumTest")
	public void afterSeleniumTest() {
		driver.close();
	}

}
