package pompages;

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
private WebElement btn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setUsername(String usr)
{
	un.sendKeys(usr);
}

public void setPassword(String pw)
{
	pwd.sendKeys(pw);
}

public void mClick()
{
	btn.click();
}
	
}
