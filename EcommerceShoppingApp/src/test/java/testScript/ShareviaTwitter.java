package testScript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.LoginPage;
import pomPages.Seleniumpage;
import pomPages.TakeThisCoursepage;

public class ShareviaTwitter extends BaseClass {
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException
	{
		LoginPage l=new LoginPage(driver);
		l.submitbtn();
		l.searchbox(pfile.getPropertyData("coursename"));
		l.searchbutton();
		
		utilies.switchTabs(driver);
		
		Seleniumpage s=new Seleniumpage(driver);
		
		utilies.mouseHover(driver, s.getTesting());
		s.automationtestingtab();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavacourse();
		
		TakeThisCoursepage t=new TakeThisCoursepage(driver);
		utilies.switchFrame(driver);
		t.playbutton();
		Thread.sleep(10000);
		t.pausebutton();
	    utilies.switchBackFrame(driver);
		t.twitter();
	
		
		
		
	}
	
}
