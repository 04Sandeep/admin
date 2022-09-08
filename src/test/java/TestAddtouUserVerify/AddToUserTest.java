package TestAddtouUserVerify;

import org.testng.annotations.Test;
public class AddToUserTest extends BaseClass
{
    @Test(priority = 1)
    public void UserLogin()
    {
        pageFactory.getUserLogin().userLogin();
    }
    @Test(priority = 2)
    public void AdminPage()
    {
        pageFactory.getAdminPage().adminPage();
    }
    @Test(priority = 3)
    public void AddUserDetail()
    {
        pageFactory.getAddUserDetail().addUserDetail();
    }
}
