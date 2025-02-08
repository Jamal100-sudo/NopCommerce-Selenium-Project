package tests;

import base.TestBase;

import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    @SuppressWarnings("deprecation")
	@Test
    public void testLogin() {
    	driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
        
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        LoginPage loginPage = new LoginPage(driver);
        
        loginPage.login("WWilson@gmail.com" ,"MercWithAMouth" );
    }

}
