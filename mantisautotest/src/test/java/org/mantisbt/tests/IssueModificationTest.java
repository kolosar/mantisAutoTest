package org.mantisbt.tests;

import org.mantisbt.data.IssueData;
import org.testng.annotations.Test;

/**
 * Created by Vera on 15/07/2017.
 */
public class IssueModificationTest extends TestBase {

    @Test
    public void testCreateIssue() {
        mgr.goToIssueList();
        mgr.issueModificationHelper().initIssueModification();
        mgr.issueCreationHelper().fillIssueForm(new IssueData("[All Projects] General", "always", "text", "low", "PC", "manager_auto", "Test Summary changed", "First line\r\nSecond Line changed"));
        mgr.issueModificationHelper().submitModificationForm();
        mgr.goToIssueList();
    }

}
