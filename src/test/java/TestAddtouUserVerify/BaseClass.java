package TestAddtouUserVerify;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
public class BaseClass
{
    protected static PageFactory pageFactory;
    public static WebDriver driver;
    @BeforeClass
    public static void setup()
    {
        driver = new ChromeDriver();
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        pageFactory = new PageFactory(driver);
    }

    @AfterClass
    public void close()
    {
        driver.close();
    }
}


