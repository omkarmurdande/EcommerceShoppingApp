package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
	public void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void switchTabs(WebDriver driver)
	{
		Set<String> window = driver.getWindowHandles();
		
		for(String wb:window)
		{
			driver.switchTo().window(wb);
		}
	}
	
	public void scrollBar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	


}
