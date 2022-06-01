package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
public WebDriver driver;
public Propertyfile pfile=new Propertyfile();
public WebDriverUtilies utilies=new WebDriverUtilies();
	
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pfile.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String name = res.getName();
		if(status==2)
		{
			Photo p=new Photo();
			p.getPhoto(driver,name);
		}
		driver.close();
	}


}
