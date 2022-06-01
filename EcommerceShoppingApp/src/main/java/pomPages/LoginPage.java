package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	

	
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillaraydemoapp;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submitbtn()
	{
		submit.click();
	}
	
	
	public void gearsButton()
	{
		gearsBtn.click();
	}
	
	public void skillraryDemoAppbtn()
	{
		skillaraydemoapp.click();
	}
	
	public void searchbox(String coursename)
	{
		searchbtn.sendKeys(coursename);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
	

	
}
