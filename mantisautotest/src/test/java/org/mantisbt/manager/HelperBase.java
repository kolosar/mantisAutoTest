package org.mantisbt.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vera on 17/07/2017.
 */
public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();

    }

    protected void fillField(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }
}
