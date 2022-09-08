package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private UserLogin userLogin;
    private AdminPage adminPage;
    private AddUserDetail addUserDetail;
    private ApplyingForLeave applyingForLeave;
    public PageFactory(WebDriver driver)
    {
        this.driver=driver;
    }

    public UserLogin getUserLogin() {
        if(userLogin==null)
        {
            userLogin = new UserLogin(driver);
        }
        return userLogin;
    }

    public AdminPage getAdminPage() {
        if(adminPage==null)
        {
            adminPage=new AdminPage(driver);
        }
        return adminPage;
    }

    public AddUserDetail getAddUserDetail() {
        if(addUserDetail==null)
        {
            addUserDetail= new AddUserDetail(driver);
        }
        return addUserDetail;
    }
    public ApplyingForLeave getApplyingForLeave()
    {
        if(applyingForLeave==null)
        {
            applyingForLeave=new ApplyingForLeave(driver);
        }
        return applyingForLeave;
    }
}
