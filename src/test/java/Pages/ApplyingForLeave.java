package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ApplyingForLeave {
    WebDriver driver;
By leave =  By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']");
By apply = By.xpath("//a[text()='Apply']");
By leavetype = By.xpath("//div[@class='oxd-select-text--after']");
By leavefromdate = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
//By leaveTodate=By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");

    By addingcomment = By.xpath("//textarea[@class ='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
By clickonleave = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public ApplyingForLeave(WebDriver driver) {
        this.driver = driver;
    }
public void applyForLeave()
{
    driver.findElement(leave).click();
    driver.findElement(apply).click();

    driver.findElement(leavetype).click();
    driver.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]")).click();

    driver.findElement(leavefromdate).sendKeys("2022-09-08");

   // driver.findElement(leaveTodate).sendKeys("2022-09-15");

    driver.findElement(addingcomment).sendKeys("Orange HRM");
    driver.findElement(clickonleave).click();
}
}

