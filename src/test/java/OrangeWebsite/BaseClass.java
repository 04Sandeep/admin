package OrangeWebsite;

import OrangeHRM.AdminPage;
import OrangeHRM.LoginPage;
import OrangeHRM.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    protected static PageFactory pageFactory;
    public static WebDriver driver;

    public static void setup() {
        driver = new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pageFactory = new  PageFactory(driver);
    }
public void close()
{
    driver.close();
}
}


