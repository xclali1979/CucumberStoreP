package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver {
    public static WebDriver driver;

    public static WebDriver driverSetup(String browser){

        if(driver!=null){
            return driver;
        }

        switch (browser.toLowerCase()){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "ff":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
            case "ie":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
            case "opera":
                WebDriverManager.operadriver().setup();
                driver=new OperaDriver();
            case"edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            default:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;

    }
    public static void closeDriver(){

        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }










}
