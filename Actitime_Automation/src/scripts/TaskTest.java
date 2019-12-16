package scripts;

import org.testng.annotations.Test;

import pompages.TaskPage;

public class TaskTest extends TestLogin{
	
@Test
	public void testTask() throws InterruptedException
	{
	TaskPage tt=new TaskPage(driver);
	tt.clickTask();
	tt.setSearchText("Big Bang");
	}
	
}
