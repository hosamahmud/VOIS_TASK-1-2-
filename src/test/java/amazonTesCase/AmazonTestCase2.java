package amazonTesCase;

import Data.LoadProperties;
import Driver.DriverSetup;
import amazonTestCase2.AmazonTestCase2Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestCase2 {

    String URL = LoadProperties.useData.getProperty("AmazonURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    AmazonTestCase2Helper amazonTestCase2Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        amazonTestCase2Helper = new AmazonTestCase2Helper(driver);
    }

    @Test(priority = 1)
    void verifyFilterProducts() {
        CommonHelper.openWebPage(URL, driver);
        amazonTestCase2Helper.openTodaysDeals(driver);
        amazonTestCase2Helper.selectHeadPhonesCheckBox(driver);
        amazonTestCase2Helper.selectGroceryCheckBox(driver);
        amazonTestCase2Helper.selectTenPercentDiscount(driver);
        amazonTestCase2Helper.goToThirdPage(driver);
        amazonTestCase2Helper.selectFirstItem(driver);
        amazonTestCase2Helper.addSelectedItemToCart(driver);
    }

    @AfterTest()
    void closure() {
        driver.close();
    }
}
