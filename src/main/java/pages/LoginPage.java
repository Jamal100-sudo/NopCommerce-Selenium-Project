package pages;

import base.PageBase;


import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
	
    @SuppressWarnings("deprecation")
	public LoginPage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	}

	WebDriver driver;
    
	@FindBy(id = "Email")
	private WebElement LoginEmail; 
	
	@FindBy(id = "Password") 
	private WebElement LoginPassword; 
	
	@FindBy(xpath = "//button[@class='button-1 login-button']") 
	private WebElement loginButton;
	
	public void login(String username, String password) 
	{ 
		LoginEmail.sendKeys(username); 
		LoginPassword.sendKeys(password); 
		loginButton.click(); 
	}

    
}
