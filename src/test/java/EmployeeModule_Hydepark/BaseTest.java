package EmployeeModule_Hydepark;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ammaskuldeep on 23/10/14.
 */
public class BaseTest extends BasePage {
    @Before
    public void startBrowser(){
        driver = new FirefoxDriver();
        driver.get("http://demo.orangehrmlive.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void stopBrowser(){
        driver.quit();
    }
}
