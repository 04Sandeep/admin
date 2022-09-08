package TestAddtouUserVerify;

import org.testng.annotations.Test;

public class AssigningLeaveTest extends BaseClass
{
    @Test(priority = 1)
    public void UserLogin() {
        pageFactory.getUserLogin().userLogin();
    }

    @Test(priority = 2)
    public void ApplyingForLeave()
    {
        pageFactory.getUserLogin().userLogin();
        pageFactory.getApplyingForLeave().applyForLeave();
    }

  @Test(priority = 3)
    public void AssigningLeaveToEmployee()
    {
        pageFactory.getUserLogin().userLogin();
        pageFactory.getApplyingForLeave();
        pageFactory.getAssigningLeaveToEmployee().assigningLeaveToEmployee();
    }
}
