package TestAddtouUserVerify;

import org.testng.annotations.Test;
public class ApplyingforLeaveTest extends BaseClass{
    @Test(priority = 1)
    public void UserLogin()
    {
        pageFactory.getUserLogin().userLogin();
    }
    @Test(priority = 2)
    public void ApplyingForLeave()
    {
        pageFactory.getUserLogin().userLogin();
        pageFactory.getApplyingForLeave().applyForLeave();
    }
}
