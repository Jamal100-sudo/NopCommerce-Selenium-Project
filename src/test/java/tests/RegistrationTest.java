package tests;

import base.TestBase;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegistrationTest extends TestBase {
	HomePage homeObject;
	RegisterPage registerObject;
	@Test
    public void userRegistration() {
        homeObject = new HomePage(driver);
        registerObject = new RegisterPage(driver);

        homeObject.OpenRegisterLink();
        registerObject.userRegistration("Tony", "Stark", "TStark@gmail.com", "iloveyou3000" , "15", "12", "1998");
        assertTrue(driver.findElement(registerObject.resultMsg).getText()
                .contains("Your registration completed"));
    }

}
