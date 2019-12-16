package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base implements IAutoConstant {
	
public WebDriver driver;

@BeforeTest
public void launchBrowser() throws Exception
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	String url=Lib.propValue(CONFIG_PATH, "URL");
	String ito=Lib.propValue(CONFIG_PATH, "IMPLICIT_TIMEOUT");
	int timeout=Integer.parseInt(ito);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	
}

/*@AfterTest
public void closeBrowser()
{
	driver.close();
}*/
	
}
