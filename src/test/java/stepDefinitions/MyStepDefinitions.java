package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import CucumberTest.AutomationTest.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;

    @Given("^User is on Greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	driver = Base.getDriver();
    }

    @When("^User searches for \"([^\"]*)\" vegetable$")
    public void user_searches_for_something_vegetable(String strArg1) throws Throwable {
    	h = new HomePage(driver);
    	h.getSearch().sendKeys(strArg1);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }
    
    @Then("^Selected \"([^\"]*)\" item is displayed in checkout page$")
    public void selected_something_item_is_displayed_in_checkout_page(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }

    @And("^Add adds items to cart$")
    public void add_adds_items_to_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(), \"ADD\")]")).click();
    }

    @And("^User proceeds to checkout page$")
    public void user_proceeds_to_checkout_page() throws Throwable {
        driver.findElement(By.xpath("//a[@class=\"cart-icon\"]/img")).click();
        driver.findElement(By.xpath("//button[contains(text(), \"PROCEED\")]")).click();
    }

}