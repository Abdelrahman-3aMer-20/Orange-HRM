package TestPages;

import Pages.AdminPage;
import Helper.AuthHelper;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class AdminPageTest extends BasePage {

//Test - Admin 

    AdminPage adminPage;
    AuthHelper authHelper;
    Logger logger = Logger.getLogger(AdminPageTest.class.getName());

    @Test
    public void NavigateToAdminPage() throws InterruptedException {

        authHelper = new AuthHelper(driver);
        authHelper.performValidLogin();
        adminPage = new AdminPage(driver);


       adminPage.setAdminButtonClick();
       Thread.sleep(3000);
       adminPage.setAddButtonClick();
       Thread.sleep(500);
        adminPage.selectUserRole("Admin");
       adminPage.setEmploeeName("Abdelrahman");
      // adminPage.setStatues();


    }
        @AfterMethod
        public  void  tearDown(){
            //driver.quit();
        }






}
