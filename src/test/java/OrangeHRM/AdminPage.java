package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;

    By username = By.name("username");
    By password = By.name("password");
    By submit = By.xpath("//button");


    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void adminPage() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement((username)).sendKeys("Admin");
        driver.findElement((password)).sendKeys("admin123");
        driver.findElement((submit)).click();

    }
}