package pages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver; 

import base.PageBase;

public class RegisterPage extends PageBase {

	@SuppressWarnings("deprecation")
	public RegisterPage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	}
	
	WebDriver driver;
	
	private By FirstName = By.id("FirstName");
	private By LastName = By.id("LastName");
	private By DayDropdown = By.name("DateOfBirthDay");
	private By MonthDropdown = By.name("DateOfBirthMonth");
	private By YearDropdown = By.name("DateOfBirthYear");
	private final By emailBox = By.id("Email");
    private final By pwBox = By.id("Password");
    private final By confirmPWBox = By.id("ConfirmPassword");
    private final By registerBtn = By.id("register-button");
    public By resultMsg = By.cssSelector("div.result");
    public By logoutLink = By.xpath("//a[@href='/logout']");
    
    public RegisterPage userRegistration (String firstName, String lastName, String emailAddress, String pass, String DayValue, String MonthValue , String YearValue)
    {
	    setTextElement(driver.findElement(FirstName),firstName);
	    setTextElement (driver.findElement(LastName),lastName);
	    dropdownSelect(driver.findElement(DayDropdown),DayValue);
	    dropdownSelect(driver.findElement(MonthDropdown),MonthValue);
	    dropdownSelect(driver.findElement(YearDropdown),YearValue);
	    setTextElement(driver.findElement(emailBox), emailAddress);
	    setTextElement(driver.findElement(pwBox), pass);
	    setTextElement(driver.findElement(confirmPWBox), pass);
	    clickButton(driver.findElement(registerBtn));
	    return this;
    
    }

}
