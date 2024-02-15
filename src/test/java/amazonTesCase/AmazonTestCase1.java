package amazonTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import amazonTestCase1.AmazonTestCase1Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestCase1 {

    String URL = LoadProperties.useData.getProperty("AmazonURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AmazonTestCase1Helper amazonTestCase1Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        amazonTestCase1Helper = new AmazonTestCase1Helper(driver);
    }

    @Test(priority = 1)
    void verifyItemIsAddedToTheCart() {
        CommonHelper.openWebPage(URL, driver);
        amazonTestCase1Helper.addItemToCart(driver);
        amazonTestCase1Helper.verifyOneItemAdded(driver);
    }

    @AfterTest()
    void closure() {
        driver.close();
    }
}
