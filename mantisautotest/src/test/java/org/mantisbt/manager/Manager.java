package org.mantisbt.manager;

import org.mantisbt.data.IssueData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

/**
 * Created by Vera on 17/07/2017.
 */
public class Manager {
    private SessionHelper sessionHelper;
    WebDriver driver;
    private IssueModificationHelper issueModificationHelper;

    private IssueCreationHelper issueCreationHelper;

    public void init(String browser) {
        if (browser.equals(BrowserType.CHROME)) {
            //createChromeDriver();
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }
        else if(browser.equals(BrowserType.IE)){
            driver = new InternetExplorerDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        issueCreationHelper = new IssueCreationHelper(driver);
        issueModificationHelper  = new IssueModificationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        driver.get("http://manzhos.me/mantis");
        sessionHelper.login("dev_auto", "Developer1");
    }

    public void goToIssueList() {
        //return to issues list
        driver.findElement(By.linkText("View Issues")).click();
    }
    public void stop() {
        sessionHelper.logout();
        //close driver instance
        driver.quit();
    }

    public IssueCreationHelper issueCreationHelper() {
        return issueCreationHelper;
    }
    public IssueModificationHelper issueModificationHelper() {
        return issueModificationHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
