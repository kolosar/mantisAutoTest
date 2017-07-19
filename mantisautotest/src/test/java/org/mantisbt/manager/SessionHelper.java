package org.mantisbt.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vera on 17/07/2017.
 */
public class SessionHelper extends HelperBase {
    WebDriver driver;

    public SessionHelper (WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        fillField( By.name("username"), username);
        fillField( By.name("password"), password);
        click(By.xpath("//input[@value='Login']"));
    }


    public void logout() {
        //perform logout
        click(By.linkText("Logout"));
    }
}
