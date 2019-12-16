package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(linkText="TASKS")
private WebElement tasks;

@FindBy(xpath="//div[@class='searchField']/..//input[@type='text']")
private WebElement searchBox;

public TaskPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void clickTask() throws InterruptedException
{
Thread.sleep(2000);
	tasks.click();
}

public void setSearchText(String txt)
{
	searchBox.sendKeys(txt);
}
}
