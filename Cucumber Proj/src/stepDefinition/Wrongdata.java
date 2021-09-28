package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Wrongdata {
	WebDriver driver;
	@Given("^we are on demowebshop login page$")
	public void we_are_on_demowebshop_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	    
	}

	@When("^user enters invalid credentials$")
	public void user_enters_invalid_credentials() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("rekhab12");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    
	   
	}

	@Then("^user should see error message$")
	public void user_should_see_error_message() throws Throwable {
		String message = driver.findElement(By.xpath("//*[contains(text(),'Login was unsuccessful.')]")).getText();
	    Assert.assertEquals("Invalid Credentials", message);
	}


}
