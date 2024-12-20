package Helper;

import Pages.LoginPage;
import Pages.PIMPage;
import org.openqa.selenium.WebDriver;

public class AuthHelper {

    WebDriver driver;
    LoginPage loginPage;
    PIMPage pimPage;
    public  AuthHelper (WebDriver driver){

        this.driver = driver;
        this.loginPage = new LoginPage(driver);
        this.pimPage = new PIMPage(driver);
    }

    public void performValidLogin (){

        loginPage.setUserName("Admin");
        loginPage.setPassWord("admin123");
        loginPage.LoginButtonClick();

    }

}
