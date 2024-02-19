package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.BaseClass;

public class LoginPage extends BaseClass {

    //Sign In link
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a") WebElement loginLink;

    //Logo
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img") WebElement logo;

    @FindBy(id = "email") WebElement enterEmail;
    @FindBy(id = "pass") WebElement enterPassword;
    @FindBy(id = "send2") WebElement loginButton;


    public void loginIntoApp(String uname, String pass){
        loginLink.click();
        enterEmail.sendKeys(uname);
        enterPassword.sendKeys(pass);
        loginButton.click();

    }

}
