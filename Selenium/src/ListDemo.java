import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement box=driver.switchTo().activeElement();
		box.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> alloptions=driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		System.out.println("The total options visible are: "+alloptions.size());
		for(WebElement option:alloptions)
		{
			String text=option.getText();
			if(text.equalsIgnoreCase("selenium interview questions"))
				option.click();
		}		
	}
}
