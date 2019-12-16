package scripts;
import org.testng.annotations.Test;
import pompages.TimeTrackPage;

public class TimeTrackTest extends TestLogin{

	@Test
	public void testClickable() throws Exception
	{				
		TimeTrackPage tp=new TimeTrackPage(driver);		
		tp.getCalls();				
		tp.getManagers(driver);	
		tp.clickAddManagers();
	}
}
