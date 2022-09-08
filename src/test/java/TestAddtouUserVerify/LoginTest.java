package TestAddtouUserVerify;

import org.testng.annotations.Test;
public class LoginTest extends  BaseClass
{
    @Test
    public void UserLogin()
    {
        pageFactory.getUserLogin().userLogin();
    }

}

