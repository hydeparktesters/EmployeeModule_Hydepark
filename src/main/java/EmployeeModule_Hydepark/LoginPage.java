package EmployeeModule_Hydepark;

import org.openqa.selenium.By;

/**
 * Created by ammaskuldeep on 23/10/14.
 */
public class LoginPage extends BasePage {

    public void loginAdmin (String Username, String Password)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(Username);
        driver.findElement(By.id("txtPassword")).sendKeys(Password);
        driver.findElement(By.id("btnLogin")).click();
    }
    public boolean isUserLogginIn()
    {
        return driver.findElement(By.id("welcome")).getText().equalsIgnoreCase("Welcome Admin");
    }
    public void forgotPassword() {driver.findElement(By.linkText("Forgot your password?")).click();
    }
}
