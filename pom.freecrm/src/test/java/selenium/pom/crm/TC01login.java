package selenium.pom.crm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class TC01login extends TestBase{
	public static WebDriver driver;
	public static HomePage homepage;
	public static LoginPage loginpage;
	
	public TC01login() throws IOException {
		super();
	}
 	
	@BeforeTest
	public static void login()
	{
		driver=launchBrowser();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	}

	@Test
	 public static void test() throws IOException, InterruptedException
	 {
	    homepage=new HomePage();
	    loginpage=new LoginPage();
	    homepage=loginpage.login();
	    Thread.sleep(3000);
	    loginpage= homepage.logout();
	    
	 }
	

}
