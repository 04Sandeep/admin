package TestAddtouUserVerify;

public class LoginTest extends  BaseClass
{
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getUserLogin().userLogin();
        pageFactory.getAdminPage().adminPage();
        pageFactory.getAddUserDetail().addUserDetail();
    }
}
