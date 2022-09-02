package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserDetail {
    WebDriver driver;

    By userrole = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]");
    By addadmin = By.xpath("//*[contains(text(),'Admin')]");
    By status = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]");
    By enabled= By.xpath("//*[contains(text(),'Enabled')]");
    By username = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    By password= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    By confirmpassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    By employeename = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div");
    By employee = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
    By save = By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public AddUserDetail(WebDriver driver) {
        this.driver = driver;
    }
    public void addUserDetail()
    {
        driver.findElement(userrole).click();
        driver.findElement(addadmin).click();
        driver.findElement(status).click();
        driver.findElement(enabled).click();
        driver.findElement(employeename).click();
        driver.findElement(employee).sendKeys("Sandeep");
        driver.findElement(username).sendKeys("Sandy04");
        driver.findElement(password).sendKeys("Sandeep@123");
        driver.findElement(confirmpassword).sendKeys("Sandeep@123");
        driver.findElement(save).click();
    }
}

