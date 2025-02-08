package base;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	public PageBase(WebDriver driver) 
	{ 
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	protected WebDriver driver;
    public JavascriptExecutor js;
    public Select select;
    public Actions action;
    
    protected PageBase clickButton(WebElement button) {
        button.click();
        return this;
    }

    protected PageBase setTextElement(WebElement textElement, String value) {
        textElement.sendKeys(value);
        return this;
    }
    
    protected PageBase dropdownSelect(WebElement dropdownElement, String value) {
        select = new Select(dropdownElement);
        select.selectByValue(value);
        return this;
    }
    
    

}
