package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base implements IAutoConstant{
public static WebDriver driver;
	static
	{
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();		
	}
	
	 @BeforeMethod
	 public void openApp() throws Exception{	
	 driver=new FirefoxDriver();	  
	 String url = Lib.getConfig(CONFIG_FILE,"URL");		
	 System.out.println(url);
	 driver.get(url);
	 String ito=Lib.getConfig(CONFIG_FILE, "IMPLICIT_TIMEOUT");
	 int timeoutPeriod=Integer.parseInt(ito);
	 driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
	}
	 
	/* @AfterMethod
	 public void closeApp()
	 {
		 driver.close();
	 }*/
} 

