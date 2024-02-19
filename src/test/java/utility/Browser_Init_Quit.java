package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browser_Init_Quit {

    public static WebDriver launchBrowser(WebDriver driver, String browserName, String appURL){

        if(browserName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("Chrome")) {
            System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if(browserName.equals("Chrome")) {
            System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }
        else{
            System.out.println("No such browser");
        }

        //launching URL
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        return driver;
    }

    //quitting browser
    public static void quitBrowser(WebDriver driver) {
        driver.quit();
    }
}
