package pompages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TimeTrackPage {
@FindBy(xpath="//div[@class='taskNameBlock']/..//div[text()='Calls']")
private WebElement calls;

@FindBy(xpath="//div[@class='reportedTime']/..//span[contains(text(),'REPORTED TIME ')]")
private WebElement managers;

@FindBy(xpath="//div[text()='Add Managers']")
private WebElement addManagers;

public TimeTrackPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void getCalls( )
{
	
	calls.click();
}

public void getManagers(WebDriver driver)
{
	/*WebDriverWait wd=new WebDriverWait(driver,15);
	wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='details']/..//span[contains(text(),'MANAGERS')]")));*/
	if(managers.isDisplayed())
	managers.click();
	else
		System.out.println("Managers tab is not present");
}

public void clickAddManagers()
{
	addManagers.click();
}
}
