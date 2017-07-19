package org.mantisbt.manager;

import org.mantisbt.data.IssueData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Vera on 17/07/2017.
 */
public class IssueCreationHelper extends HelperBase{


    private  WebDriver driver;

    public IssueCreationHelper(WebDriver driver) {
        super(driver);
    }


    public void initIssueCreation() {
        //init issue creation
        click(By.linkText("Report Issue"));

           }
    protected void fillField(By locator, String text) {
        //fill login field
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void submitCreationForm() {
        //Click Submit button
        driver.findElement(By.xpath("//input[@value='Submit Report']")).click();
        driver.findElement(By.linkText("View Issues")).click();
    }

    public void fillIssueForm(IssueData issueData) {
        //change Category
        new Select(driver.findElement(By.name("category_id")))
                .selectByVisibleText(issueData.getCategory_id());
        //change Reproducibility
        new Select(driver.findElement(By.name("reproducibility")))
                .selectByVisibleText(issueData.getReproducibility());
        //change severity
        new Select(driver.findElement(By.name("severity")))
                .selectByVisibleText(issueData.getSeverity());
        //choose priority
        new Select(driver.findElement(By.name("priority")))
                .selectByVisibleText(issueData.getPriority());
        //fill platform
        click(By.id("platform"));
        driver.findElement(By.id("platform")).clear();
        driver.findElement(By.id("platform")).sendKeys(issueData.getPlatform());
        //Assign issue
        new Select(driver.findElement(By.name("handler_id")))
                .selectByVisibleText(issueData.getHandler_id());
        //fill summary
        click(By.name("summary"));
        driver.findElement(By.name("summary")).clear();
        driver.findElement(By.name("summary")).sendKeys(issueData.getSummary());
        //fill description
        click(By.name("description"));
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description"))
                .sendKeys(issueData.getDescription());

    }
  }
