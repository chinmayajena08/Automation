package StepDefenition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class StepDef {
	public WebDriver driver;
	public LoginPage loginPg;
	
	@Given("User Launch chrome Browser")
	public void user_launch_chrome_browser() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 loginPg = new LoginPage(driver); 
	 
	}

	@Given("User Opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);    
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginPg.enterEmail(emailadd);
		loginPg.enterPassword(password); 
	}

	@When("Click on Login")
	public void click_on_login() {
		loginPg.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualtitle = driver.getTitle(); 
		if(actualtitle.equals(expectedTitle)) {
			Assert.assertTrue(true);	   
		}else {
			Assert.assertTrue(false);	
		}
	 
	}

	@When("User click on Logout Link")
	public void user_click_on_logout_link() {
		loginPg.clickOnLogoutButton();
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    driver.close();
	    driver.quit();
	}

}
