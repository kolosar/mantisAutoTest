package org.mantisbt.tests;

import org.mantisbt.data.IssueData;
import org.testng.annotations.Test;

/**
 * Created by Vera on 15/07/2017.
 */
public class IssueCreatingTest extends TestBase{

    @Test
    public void testCreateIssue() {
        mgr.issueCreationHelper().initIssueCreation();
        mgr.issueCreationHelper().fillIssueForm(new IssueData("[All Projects] General", "always", "text", "low", "PC", "manager_auto", "Test Summary", "First line\r\nSecond Line"));

        mgr.issueCreationHelper().submitCreationForm();
        mgr.goToIssueList();
    }


}

