package TestAddtouUserVerify;

import org.testng.annotations.Test;

public class AdminTest extends BaseClass
{
    @Test(priority = 1)
    public void UserLogin() throws InterruptedException
    {
        pageFactory.getUserLogin().userLogin();
    }

    @Test(priority = 2)
    public void AdminPage()
    {
        pageFactory.getAdminPage().adminPage();

    }
}
