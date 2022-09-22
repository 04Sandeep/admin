package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class AddUserDetail
{
    WebDriver driver;
    WebDriverWait wait;

    By userrole = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By employeename = By.xpath("(//div/input)[2]");
    By status = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By username = By.xpath("(//div/input[@class='oxd-input oxd-input--active'])[2]");
    By password= By.xpath("(//div/input[@type='password'])[1]");
    By confirmpassword = By.xpath("(//div/input[@type='password'])[2]");
    By save = By.xpath("//button[@type='submit']");
    By usernameVerify = By.xpath("input[@class='oxd-input oxd-input--active'])[2]");
    By userroleverify = By.xpath("//i[@class = 'oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By adminverify = By.xpath("//*[contains(text(),'Admin')]");
    By searchverify = By.xpath("//button[@type='submit']");

    String uniquename;
    public AddUserDetail(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void addUserDetail()
    {
        String random = String.valueOf((int)(Math.random()*(100-50+1)+50));
        uniquename = "Odis026adalwin"+random;
        driver.findElement(userrole).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(employeename).sendKeys("Odis" );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.xpath("//*[contains(text(),'Odis')]")).click();
        driver.findElement(status).click();
        driver.findElement((By.xpath("//*[contains(text(),'Enabled')]"))).click();
        driver.findElement(username).sendKeys(uniquename);
        driver.findElement(password).sendKeys("Sandeep@123");
        driver.findElement(confirmpassword).sendKeys("Sandeep@123");
        driver.findElement(save).click();
    }
    public void verification() throws InterruptedException
    {
        driver.findElement(usernameVerify).sendKeys(uniquename);
        driver.findElement(userroleverify).click();
        driver.findElement(adminverify).click();
        driver.findElement(searchverify).click();
        boolean isAdminDisplayed = driver.findElement(By.xpath(String.format("//div[contains(text(),%s')]", uniquename))).isDisplayed();
        Assert.isTrue(isAdminDisplayed, "User is not added");
    }
}

