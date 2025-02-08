package pages;

import base.PageBase;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;

public class ProductSearch extends PageBase {

    public ProductSearch(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "small-searchterms")
    WebElement searchTxtBox;

    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    WebElement searchBtn;
    
    @FindBy(xpath = "//img[@alt='Picture of Apple MacBook Pro 13-inch']")
    public WebElement assertimage;

    public ProductSearch productsearch(String searchBarBox) {
        setTextElement(searchTxtBox, searchBarBox);
        clickButton(searchBtn);
        return this;
    }
}
