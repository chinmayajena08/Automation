package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rDriver) {

		ldriver=rDriver;
		PageFactory.initElements(rDriver, rDriver);
	}

	@FindBy(id= "Email")
	WebElement email; 

	@FindBy(id= "Password")
	WebElement password; 

	@FindBy(xpath= "//button[normalize-space()='Log in']")
	WebElement LogBtn; 

	@FindBy(linkText = "Logout")
	WebElement logout; 

	public void enterEmail(String emailadd) {
		email.sendKeys(emailadd);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);    
	}
	public void clickOnLoginButton() {
		LogBtn.click();
	}
	public void clickOnLogoutButton() {
		logout.click();
	}
}
