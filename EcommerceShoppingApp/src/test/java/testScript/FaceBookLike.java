package testScript;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.FacebookPage;
import pomPages.LoginPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.TestingPage;

public class FaceBookLike extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException
	{
		LoginPage l=new LoginPage(driver);
		l.gearsButton();
		l.skillraryDemoAppbtn();
		
		SkillraryDemoLoginPage s=new SkillraryDemoLoginPage(driver);
		utilies.dropdown(s.getTestingdd(), pfile.getPropertyData("testingdd"));
		
		TestingPage t=new TestingPage(driver);
		WebElement f = t.getFb();
		Point loc = f.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		utilies.scrollBar(driver, x, y);
		
		t.getFb().click();
		
		FacebookPage fb=new FacebookPage(driver);
		fb.likebtn();
		
		
	}

}
