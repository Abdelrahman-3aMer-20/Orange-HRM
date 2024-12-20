package Pages;



import TestPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class AdminPage extends BasePage {

    WebDriver driver;
    WebDriverWait wait;
    Logger logger = Logger.getLogger(AdminPage.class.getName());

    By adminButtonClick = By.xpath("(//span[normalize-space()='Admin'])[1]");
    By addButtonClick = By.xpath("(//button[normalize-space()='Add'])[1]");
    By userRoleDropDown = By.xpath("((//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By emploeeName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    By statues = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[2]");
    By userName = By.xpath("(//input[@class='oxd-input oxd-input--focus'])[1]");
    By passWord = By.xpath("(//input[@type='password'])[1]");
    By verifyPassWord = By.xpath("(//input[@type='password'])[2]");
    By saveButtonClicked = By.xpath("(//button[normalize-space()='Save'])[1]");
    By cancelButtonClicked = By.xpath("(//button[normalize-space()='Cancel'])[1]");
    By resetButtonClicked = By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--ghost']");
    By searchUserName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By searchUserRole = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]");
    By searchEmployeeName = By.xpath("(//input[@placeholder='Type for hints...'])[1]");
    By searchStatues = By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[2]");
    By searchButtonClicked = By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

//    By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-wrapper'][1]");
//    By adminOption = By.xpath("//div[@role='option']//span[text()='Admin']");

    public AdminPage (WebDriver driver){
        this.driver = driver;
        this.wait = wait;
    }

    public void setAdminButtonClick () throws InterruptedException{
        Thread.sleep(3000);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(adminButtonClick));
        driver.findElement(adminButtonClick).click();
    }

    public void setAddButtonClick () throws InterruptedException {
        logger.info("[AdminPage] Clicked on add button....");
        Thread.sleep(1000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(addButtonClick));
        driver.findElement(addButtonClick).click();
    }


    public void selectUserRole(String roleText) throws InterruptedException {
        Thread.sleep(2000);
       // wait.until(ExpectedConditions.elementToBeClickable(userRoleDropdown)).click();
        By roleOption = By.xpath("//div[@role='option']//span[text()='" + roleText + "']");
        wait.until(ExpectedConditions.elementToBeClickable(roleOption)).click();
    }

    public void setUserRoleDropDown(By element, String visibleText) {
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        new Select(dropdownElement).selectByVisibleText(visibleText);
    }


    public void setEmploeeName (String Employee){
        logger.info("[AdminPage] Add Employee Name.... ");
        driver.findElement(emploeeName).sendKeys(Employee);
    }

    public void setStatues (){
        logger.info("[AdminPage] DropDownList For Statues....");
        setUserRoleDropDown(statues, "Enabled");
    }

    public void setUserName (String Username){
        logger.info("[AdminPage] added Username....");
        driver.findElement(userName).sendKeys(Username);
    }


    public void setPassWord (String PassWord){
        logger.info("[AdminPage] Set Password... ");
        driver.findElement(passWord).sendKeys(PassWord);
    }

    public void setVerifyPassWord (String PassWord){
        logger.info("[AdminPage] Verify Password... ");
        driver.findElement(verifyPassWord).sendKeys(PassWord);
    }

    public void setSaveButtonClicked (){
        logger.info("[AdminPage] Clicked Save Button.... ");
        driver.findElement(saveButtonClicked).click();
    }


    public void setCancelButtonClicked (){
        logger.info("[AdminPage] Clicked Cancel Button To gonna previous page.... ");
        driver.findElement(cancelButtonClicked).click();
    }

    public void setResetButtonClicked (){
        logger.info("[AdminPage] Clicked Reset Button.... ");
        driver.findElement(resetButtonClicked).click();
    }

    public void setSearchUserName(String Username){
        logger.info("[AdminPage Added Username to Search....");
        driver.findElement(searchUserName).sendKeys(Username);
    }

    public void setSearchUserRole (){
        logger.info("[AdminPage] DropDownList For User Role....");
        setUserRoleDropDown(searchUserRole, "Admin");
    }

    public void setSearchEmployeeName (String Employee){
        logger.info("[AdminPage] Added Employee Name....");
        driver.findElement(searchEmployeeName).sendKeys(Employee);
    }

    public void setSearchStatues(){
        logger.info("[AdminPage] DropDownList For Statue....");
        setUserRoleDropDown(searchStatues, "Enabled");
    }

    public void setSearchButtonClicked (){
        logger.info("Click Search Button....");
        driver.findElement(searchButtonClicked).click();
    }

}
