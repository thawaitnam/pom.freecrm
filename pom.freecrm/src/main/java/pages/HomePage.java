package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
@FindBy(how=How.XPATH,using="//a[contains(text(),'Logout')]")
WebElement logout;

public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
}

public LoginPage logout() throws IOException
{
	logout.click();
	return new LoginPage();
}
}


