package stepdefinitions;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utilities.WebDriverHelpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Hooks extends WebDriverHelpers {

    private WebDriverHelpers webDriverHelpers;

    public Hooks(WebDriverHelpers driverHelpers){
        this.webDriverHelpers = driverHelpers;

    }

    @Before
    public void initialisation() {

        /*Properties prop = new Properties();
        FileInputStream ip = new FileInputStream ("/Programming Lang/Myfirstwork/" +  "/src/main/resources/configuration/config.properties");
        prop.load(ip);

        System.out.println(prop.getProperty("browser"));
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/44772/Downloads/chromedriver.exe");
            webDriverHelpers.driver = new ChromeDriver();
        }else if(browserName.equals("FireFox")){
            webDriverHelpers.driver = new FirefoxDriver();
        }else if(browserName.equals("IE")){
            webDriverHelpers.driver = new InternetExplorerDriver();
        }else System.out.println("no browser name given");*/

        String path =System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path+ "/tools/chromedriver.exe");
        webDriverHelpers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriverHelpers.driver.manage().window().maximize();
        webDriverHelpers.driver.manage().deleteAllCookies();




    }

    @After
     public void tearDown()
    {
        webDriverHelpers.driver.close();
    }
}
