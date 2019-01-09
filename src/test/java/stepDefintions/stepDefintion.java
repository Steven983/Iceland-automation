package stepDefintions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;



public class stepDefintion  {

WebDriver driver;


@Given("^I am on iceland login page$")
public void I_am_on_iceland_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Stefan\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://groceries.iceland.co.uk/login") ;
	
}

@When("Title of login page is Iceland Groceries$")
public void title_of_login_page_is_Iceland_Groceries() throws Throwable {
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals("Sign in or Register | Iceland Groceries", title);


}

@Then("^Login details are populated$")
public void login_details_are_populated() throws Throwable {
	driver.findElement(By.name("j_username")).sendKeys("testing@testing.com");
	driver.findElement(By.name("j_password")).sendKeys("Testing10001£");
	 
}

@Then("^I am clicking on sign in$")
public void I_am_clicking_on_sign_in() throws Throwable {
	driver.findElement(By.id("customBtn")).click();
	
}


@Then ("^I am on shopping page") 
public void I_am_on_shopping_page() throws Throwable {
String title = driver.getTitle();
System.out.println("Home Page title ::"+  title);
Assert.assertEquals("Book Delivery Slot | Iceland Groceries", title);

		
		



}

}
