package TestAddtouUserVerify;

import org.testng.annotations.Test;

public class LoginTest extends  BaseClass
{
    //public static void main(String[] args) throws InterruptedException {
    @Test
    public void UserLogin() throws InterruptedException
    {
        pageFactory.getUserLogin().userLogin();
    }

    }

