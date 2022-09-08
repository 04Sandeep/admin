package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AdminPage
{
    WebDriver driver;

    By admin = By.xpath("//span[@class = 'oxd-text oxd-text--span oxd-main-menu-item--name']");
    By addbutton = By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary']");
    public AdminPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void adminPage()
    {
        driver.findElement(admin).click();
        driver.findElement(addbutton).click();
    }
}

