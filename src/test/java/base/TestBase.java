package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;

public class TestBase {
    protected static WebDriver driver;

    public static String userDir = System.getProperty("user.dir");
    public static String relativePath = "\\Downloads";
    public static String downloadPath = userDir + relativePath;

    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("applicationCacheEnabled", false);
        chromeOptions.addArguments("--disable-extensions");
        //chromeOptions.addArguments("--headless=new");
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        return chromeOptions;
    }

    @BeforeClass
    public TestBase setUp() {
        driver = new ChromeDriver(getChromeOptions());
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        return this;
    }

    @AfterClass
    public TestBase tearDown() {
        if (driver != null) {
            driver.quit();
        }
        return this;
    }
}