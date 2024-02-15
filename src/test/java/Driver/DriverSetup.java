package Driver;

import Data.LoadProperties;
import commonUtils.CommonHelper;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.HashMap;

public class DriverSetup {
    protected static WebDriver driver;

    String browser = LoadProperties.useData.getProperty("Browser");

    @Parameters({"browser"})
    public static void driverConf(@Optional("chrome") String browser) {
        if (browser.toLowerCase().equals("firefox")) {
            driver = new FirefoxDriver();
            Dimension dem = new Dimension(1024,768);
            driver.manage().window().setSize(dem);
        } else if (browser.toLowerCase().equals("chrome")) {
            driver = new ChromeDriver();
            Dimension dem = new Dimension(1024,768);
            driver.manage().window().setSize(dem);
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }


    @AfterSuite
    public void stopDriver() {
        driver.quit();
    }

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking Screenshot...");
            CommonHelper.takeSnapShot(result.getName(), driver);
        }
    }

}
