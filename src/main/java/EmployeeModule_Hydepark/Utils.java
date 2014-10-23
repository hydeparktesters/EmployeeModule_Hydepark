package EmployeeModule_Hydepark;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by ammaskuldeep on 23/10/14.
 */
public class Utils extends BasePage {
    //select From dropdown menu
    public void selectFromDropDownMenu(By by,String text)
    {
        Select sel=new Select(driver.findElement(by));
        sel.selectByVisibleText(text);
    }

    //isTextPresent Method
    public static boolean isElementPresent (By element)
    {
        try {
            return driver.findElement(element).isDisplayed();

        }
        catch (Exception e)
        {
            return false;
        }
    }
}
