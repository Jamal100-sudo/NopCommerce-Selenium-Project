package tests;

import org.testng.annotations.Test;
import pages.ProductSearch;
import base.TestBase;
import static org.testng.Assert.assertTrue;

public class ProductSearchTest extends TestBase {
    
    ProductSearch productsearchObj;
    
    String productname = "Apple MacBook Pro 13-inch";
    
    @Test
    public void SearchForProduct() {
        driver.get("https://demo.nopcommerce.com");
        productsearchObj = new ProductSearch(driver);
        productsearchObj.productsearch(productname);
        assertTrue(productsearchObj.assertimage.isDisplayed());
    }
}
