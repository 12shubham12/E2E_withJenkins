package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

    Properties pro;

    public ConfigDataProvider(){
        File scr = new File("./Config/configuration.properties");

        try {
            FileInputStream fis = new FileInputStream(scr);
            pro = new Properties();
            pro.load(fis);
        }
        catch (Exception e) {
            System.out.println("Not able to load config file"+e.getMessage());
        }
    }

    public String getBrowser(){
           return pro.getProperty("Browser");
        }
    public String getURL(){
        return pro.getProperty("qaURL");
    }

}
