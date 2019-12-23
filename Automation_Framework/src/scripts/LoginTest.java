package scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import generic.Base;
import generic.IAutoConstant;
import generic.Lib;
import pom.LoginPage;

public class LoginTest extends Base implements IAutoConstant{	
	@Test
	public void login() throws Exception, IOException
	{
		LoginPage lp=new LoginPage(driver);
		String un=Lib.getCellValue(EXCEL_FILE, "invalid login", 1, 0);		
		lp.username(un);
		String pw=Lib.getCellValue(EXCEL_FILE, "invalid login", 1, 1);
		lp.password(pw);
		lp.clickBtn();
		
	}
	
}
