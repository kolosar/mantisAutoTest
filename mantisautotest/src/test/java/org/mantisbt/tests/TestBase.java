package org.mantisbt.tests;

import org.mantisbt.manager.Manager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.remote.BrowserType;

/**
 * Created by Vera on 15/07/2017.
 */
public class TestBase extends Manager {
    protected final Manager mgr = new Manager();

    @BeforeMethod
    public void setUp(){
        mgr.init(BrowserType.CHROME);
    }

    @AfterMethod
    public void tearDown(){
        mgr.stop();
    }
}
