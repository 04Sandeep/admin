package TestAddtouUserVerify;

import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
public class BaseClass
{
    protected static PageFactory pageFactory;
    static WebDriver driver;
    @BeforeClass
    @Parameters("browserName")

    public static void setup(String browserName)
    {
        if(browserName.equalsIgnoreCase("chrome")) {
           driver = WebDriverManager.chromedriver().create();
           driver.manage().window().maximize();
           driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
           pageFactory=new PageFactory(driver);
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
            driver = WebDriverManager.firefoxdriver().create();
            driver.manage().window().maximize();
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            pageFactory=new PageFactory(driver);
        }
        }
    /*@AfterClass
    public void close()
    {
        driver.close();
    }*/
}


