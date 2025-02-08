package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) {
		super(driver);
}
	
	private By RegisterLink = By.xpath("//div[@class='header-links']//a[@class='ico-register']");
	public By loginLink = By.cssSelector("a.ico-login");
	
	public HomePage OpenRegisterLink()
	{
		clickButton(driver.findElement(RegisterLink));
		return this;
		
	}
	
	public HomePage OpenLoginLink()
	{
		clickButton(driver.findElement(loginLink));
		return this;
		
	}
	
	
}


