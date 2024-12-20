package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage {


        WebDriver driver;
        WebDriverWait wait;

    //WebElement

        By userNameField = By.cssSelector("input[name=\"username\"]");
        By passWordField = By.cssSelector("input[name=\"password\"]");
        By loginButton = By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button");
        By invalidMessage= By.xpath("//p[contains(.,\"Invalid\")]");
        By requiredMessage = By.xpath("//span[contains(.,\"Required\")]");

        public LoginPage (WebDriver driver){
                this.driver = driver;
                this.wait = new WebDriverWait(driver, 5);
        }




        //Methods
        public void setUserName(String username){
                wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
                driver.findElement(userNameField).sendKeys(username);
        }

        public void setPassWord(String password){
                driver.findElement(passWordField).sendKeys(password);
        }

        public void LoginButtonClick(){

                driver.findElement(loginButton).click();
        }

        public boolean isInvalidErrorMessageVisible(){
                wait.until(ExpectedConditions.visibilityOfElementLocated(invalidMessage));
                return driver.findElement(invalidMessage).isDisplayed();
        }


        public boolean isRequiredErrorMessageVisible(){
                wait.until(ExpectedConditions.visibilityOfElementLocated(requiredMessage));
                return driver.findElement(requiredMessage).isDisplayed();

        }

}
