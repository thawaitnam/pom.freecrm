package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//input[@name='username']")
	WebElement userName;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	WebElement login;
	
	public HomePage login() throws IOException
	{
		userName.sendKeys("thawaitnam");
		password.sendKeys("mahobianam18");
		login.click();
		return new HomePage();
	}
}
