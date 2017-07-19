package org.mantisbt.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vera on 17/07/2017.
 */
public class IssueModificationHelper extends HelperBase {
    private WebDriver driver;

    public IssueModificationHelper(WebDriver driver) {
        super(driver);
    }

    public void initIssueModification() {
               //Init issues modification
        click(By.xpath("//a/img[@alt='Edit']"));
    }

    public void submitModificationForm() {
        //click Update Information button
        click(By.xpath("//input[@value='Update Information']"));
    }
}
