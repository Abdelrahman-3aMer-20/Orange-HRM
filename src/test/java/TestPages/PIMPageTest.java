package TestPages;

import Helper.AuthHelper;
import Pages.PIMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMPageTest extends BasePage {

    // login test enhancement


    @Test
    public void testNavigateToPIMPageAndAddEmployee() throws InterruptedException {

        AuthHelper authHelper = new AuthHelper(driver);
        authHelper.performValidLogin();

        PIMPage pimPage = new PIMPage(driver);



        pimPage.clickPIMPageBtn();
        Thread.sleep(2000);
        pimPage.Addclickbuttonclicked();
        Thread.sleep(2000);
        pimPage.setFirstName("Ali");
        Thread.sleep(2000);
        pimPage.setAddMiddleName("H.");
        Thread.sleep(2000);
        pimPage.setAddLastName("Ahmed");
        Thread.sleep(2000);
        pimPage.setAddEmploeeId("12345");
        Thread.sleep(2000);
        pimPage.setCreateLoginDetailsClick();
        Thread.sleep(2000);
        pimPage.setAddUserName("ali.ahmed");
        Thread.sleep(2000);
        pimPage.setAddPassWord("Password123!");
        Thread.sleep(2000);
        pimPage.setAddConfirmPassWord("Password123!");
        Thread.sleep(2000);
       // pimPage.testAssertCheck();
       // Thread.sleep(2000);
        pimPage.setSaveButtonClicked();

        Thread.sleep(3000);


        Assert.assertTrue(driver.getCurrentUrl().contains("pim"), "Still not on PIM page!");
    }
}
