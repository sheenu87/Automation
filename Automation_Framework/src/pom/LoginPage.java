package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String usr)
	{
		un.sendKeys(usr);
	}
	
	public void password(String p)
	{
		pwd.sendKeys(p);
	}
	
	public void clickBtn()
	{
		loginBtn.click();
	}
}
