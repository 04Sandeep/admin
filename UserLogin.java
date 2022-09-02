package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLogin {
    WebDriver driver;
    By username = By.name("username");
    By password = By.name("password");
    By submit = By.xpath("//button");

    public UserLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void userLogin() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement((username)).sendKeys("Admin");
        driver.findElement((password)).sendKeys("admin123");
        driver.findElement(submit).click();
    }
}