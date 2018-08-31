package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties property;
	
	
	public TestBase() throws IOException {
	
		try {
			FileInputStream fio=new FileInputStream("C:\\Users\\Num\\git\\pom.freecrm\\pom.freecrm\\src\\main\\java\\testdata\\data.properties");
			property=new Properties();
			property.load(fio);
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	
	}

	public static WebDriver launchBrowser()
	{
		String browserName=property.getProperty("BROWSER_NAME");
		if(browserName.equals("firefox")){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Num\\Google Drive\\NAMWorld\\QATester\\NamWorkPlaceKepler\\Selenium\\src\\utility\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver.get("https://www.freecrm.com");
		}
		
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Num\\Google Drive\\NAMWorld\\QATester\\NamWorkPlace\\com.selenium.pom\\src\\test\\resources\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;

	}

	
	

}
