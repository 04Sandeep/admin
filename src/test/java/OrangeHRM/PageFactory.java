package OrangeHRM;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AdminPage adminPage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public AdminPage getAdminPage() {
        if (adminPage == null) {
            adminPage = new AdminPage(driver);
        }
        return adminPage;
    }
}