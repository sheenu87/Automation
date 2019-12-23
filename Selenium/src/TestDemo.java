import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {
	
	public static void main(String args[]) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("selenium");
		Thread.sleep(2000);		
		List<WebElement> lst= driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		//print all options
		for(WebElement ele:lst)
		{
			String text=ele.getText();
			System.out.println("The list option: "+text);
		}
		//click on "selenium interview questions"
		for(WebElement ele:lst)
		{
			String text=ele.getText();
			if(text.equalsIgnoreCase("selenium interview questions"))
			{
				ele.click();
			}
		}
	}
}
