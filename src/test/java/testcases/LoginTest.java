package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.BaseClass;

public class LoginTest extends BaseClass{

    @Test
    public void loginTest(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginIntoApp(excel.getEmail("LoginDetails",1,0),
                excel.getPassword("LoginDetails",1,1));
    }


}
