package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssigningLeaveToEmployee {
    WebDriver driver;

    By assignleave = By.xpath("//a[text()='Assign Leave']");
    By employeename = By.xpath("//div[@class = 'oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
    By leavetype = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']");
    By assignfromdate = By.xpath("//input[@class='oxd-input oxd-input--active'])[2]");
    By assigntodate = By.xpath("//input[@class='oxd-input oxd-input--active'])[3]");
    By assigncomments = By.xpath("//textarea[@class = 'oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
    By clickingassignbutton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    String uniqname;

    public AssigningLeaveToEmployee(WebDriver driver) {
        this.driver = driver;
    }

    public void assigningLeaveToEmployee() {

        driver.findElement(assignleave).click();
        String random = String.valueOf((int) (Math.random() * (100 - 50 + 1) + 50));
        uniqname = "Lisa0222Andrews" + random;
        driver.findElement(employeename).sendKeys("Lisa");
        driver.findElement(By.xpath("//*[contains(text(),'Lisa')]")).click();
        driver.findElement(leavetype).click();
        driver.findElement(By.xpath("//div[text()='CAN - Matternity']"));
        driver.findElement(assignfromdate).sendKeys("2022-09-20");
        driver.findElement(assigntodate).sendKeys("2022-09-20");
        driver.findElement(assigncomments).sendKeys("assigning the leave");
        driver.findElement(clickingassignbutton).click();
    }
    }

