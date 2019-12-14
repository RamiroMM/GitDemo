package stepDefinitions;

import CucumberTest.AutomationTest.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	public void printSomething() {
		System.out.println("This is only to make chages in code");
		System.out.println("This is only to make chages in code 2");
		System.out.println("This is only to make chages in code 3");
		System.out.println("Adding comment from the other user's project");
	}
	
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
