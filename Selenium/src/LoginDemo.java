import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//Capture screenshot		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("/home/tyss/Desktop/temp.png");
		FileUtils.copyFile(src, dest);
		
		//Enter Login Credentials
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		
		//Navigate to Google and enter Selenium
		driver.navigate().to("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
//		driver.close();
		
		
	}

}
