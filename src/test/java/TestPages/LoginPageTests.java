package TestPages;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BasePage {
    WebDriverWait wait;

// test change


    @Test
    public void testSuccessLogin() throws InterruptedException {

    loginPage.setUserName("Admin");
    loginPage.setPassWord("admin123");
    loginPage.LoginButtonClick();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        wait.wait(5000);
    }

    @Test
    public void testInvalidUserName(){

        loginPage.setUserName("Ad");
        loginPage.setPassWord("admin123");
        loginPage.LoginButtonClick();
        Assert.assertTrue(loginPage.isInvalidErrorMessageVisible());

    }



    @Test
    public void testInvalidPassWord(){

        loginPage.setUserName("Admin");
        loginPage.setPassWord("admin");
        loginPage.LoginButtonClick();
        Assert.assertTrue(loginPage.isInvalidErrorMessageVisible());

    }


    @Test
    public void testEmptyPassWord(){

        loginPage.setUserName("Admin");
        loginPage.setPassWord("");
        loginPage.LoginButtonClick();
        Assert.assertTrue(loginPage.isRequiredErrorMessageVisible());

    }

}
