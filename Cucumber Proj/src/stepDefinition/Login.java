package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
	    
	}

	@When("^User enters email and password and clicks login button$")
	public void user_enters_email_and_password_and_clicks_login_button() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("kodamshanku66@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("shanku");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    
	    
	}

	@Then("^User should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		boolean view = driver.findElement(By.linkText("Log out")).isDisplayed();
        Assert.assertTrue(view);
        driver.findElement(By.linkText("Log out")).click();
        driver.close();
	    
	}



}
