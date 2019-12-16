package scripts;

import org.testng.annotations.Test;
import Generic.Base;
import pompages.LoginPage;


public class TestLogin extends Base{

	@Test	
	public void loginApp() throws Exception{	
	
	LoginPage lp= new LoginPage(driver);
	lp.setUsername("admin");
	lp.setPassword("manager");
	lp.mClick();	
		
	}
	
}
