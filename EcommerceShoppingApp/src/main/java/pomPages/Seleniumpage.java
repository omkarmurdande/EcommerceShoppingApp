package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumpage {
	@FindBy(xpath="//span[text()='Testing']")
	private WebElement testing;
	
	
	@FindBy(xpath="//a[text()='Automation Testing']")
	private WebElement automationtesting;

	public WebElement getTesting() {
		return testing;
	}
	
	public Seleniumpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void automationtestingtab()
	{
		automationtesting.click();
	}
	
  
}
