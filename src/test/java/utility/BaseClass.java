package utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public ConfigDataProvider config;
    public ExcelDataProvider excel;
    public WebDriver driver;


    @BeforeSuite
    public void setUpSuit(){
        config = new ConfigDataProvider();
        excel = new ExcelDataProvider();
    }
    @BeforeTest
    public void setUp(){
        driver = Browser_Init_Quit.launchBrowser(driver,config.getBrowser(),config.getURL());
    }
    @AfterTest
    public void tearDown(){
        Browser_Init_Quit.quitBrowser(driver);
    }
}
