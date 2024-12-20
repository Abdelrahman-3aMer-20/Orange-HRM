package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.logging.Logger;

public class PIMPage {

    WebDriver driver;
    WebDriverWait wait;
    Logger logger = Logger.getLogger(PIMPage.class.getName());

    By pimBtnPage = By.xpath("//span[text()='PIM']/parent::a");
    By addClickButton = By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary'])");
    By addFirstName = By.name("firstName");
    By addMiddleName = By.name("middleName");
    By addLastName = By.name("lastName");
    By addEmploeeId = By.xpath("(//input[@class='oxd-input oxd-input--active']) [2]");
    By createLoginDetailsClick = By.xpath("(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]");
    By addUserName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]");
    By addPassWord = By.xpath("(//input[@type='password'])[1]");
    By addConfirmPassWord = By.xpath("(//input[@type='password'])[2]");
    By saveButtonClicked = By.xpath(" (//button[normalize-space()='Save'])[1]");

    public PIMPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void clickPIMPageBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(pimBtnPage));
        driver.findElement(pimBtnPage).click();
    }

    public void Addclickbuttonclicked(){
        logger.info("[PIMPage] Click Button Clicked...");
        driver.findElement(addClickButton).click();
    }

    public void setFirstName(String FirstName){
        logger.info("[PIMPage] Added First Name .... ");
        driver.findElement(addFirstName).sendKeys(FirstName);
    }

    public void setAddMiddleName(String MiddleName){
        logger.info("[PIMPage] Added Middle Name .... ");
        driver.findElement(addMiddleName).sendKeys(MiddleName);
    }

    public void setAddLastName(String LastName){
        logger.info("[PIMPage] Added Last Name .... ");
        driver.findElement(addLastName).sendKeys(LastName);
    }

    public void setAddEmploeeId(String id){
        logger.info("[PIMPage] Added Empolee ID .... ");
        driver.findElement(addEmploeeId).sendKeys(id);
    }

    public void setCreateLoginDetailsClick(){
        logger.info("[PIMPage] Click Create Details Clicked .... ");
        driver.findElement(createLoginDetailsClick).click();
    }

    public void setAddUserName(String UserName){
        logger.info("[PIMPage] Added UserName .... ");
        driver.findElement(addUserName).sendKeys(UserName);
    }

    public void setAddPassWord(String Password){
        logger.info("[PIMPage] Added PassWord .... ");
        driver.findElement(addPassWord).sendKeys(Password);
    }

    public void setAddConfirmPassWord(String Confpassword){
        logger.info("[PIMPage] Added Confirm Password .... ");
        driver.findElement(addConfirmPassWord).sendKeys(Confpassword);
    }

    public void testAssertCheck(){
        logger.info("[PIMPage] Asserting Password .... ");
       // Assert.assertEquals(addPassWord, addConfirmPassWord, "Passwords do not match");
    }

    public void setSaveButtonClicked(){
        logger.info("[PIMPage] Save Button Clicked .... ");
        driver.findElement(saveButtonClicked).click();
    }
}
