package ksrtcTestcase;

import Data.LoadProperties;
import Driver.DriverSetup;
import amazonTestCase1.AmazonTestCase1Helper;
import commonUtils.CommonHelper;
import commonUtils.RandomSource;
import ksrtcTestCase.KsrtcTestCaseHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KstrcTestCase {

    String URL = LoadProperties.useData.getProperty("ksrtcURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    String mobileNumber = LoadProperties.useData.getProperty("MobileNumber");
    String gender = LoadProperties.useData.getProperty("Gender");
    String concession = LoadProperties.useData.getProperty("Concession");
    String name = LoadProperties.useData.getProperty("Name");

    String age = LoadProperties.useData.getProperty("Age");

    KsrtcTestCaseHelper ksrtcTestCaseHelper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        ksrtcTestCaseHelper = new KsrtcTestCaseHelper(driver);
    }

    @Test(priority = 1)
    void verifyReserveAppointment() {
        CommonHelper.openWebPage(URL, driver);
        ksrtcTestCaseHelper.chooseDestination(driver);
        ksrtcTestCaseHelper.chooseDate(driver);
        ksrtcTestCaseHelper.clickSearchForBus(driver);
        ksrtcTestCaseHelper.clickSelectSeats(driver);
        ksrtcTestCaseHelper.selectSeats(driver);
        ksrtcTestCaseHelper.clickCustomerDetails(driver);
        ksrtcTestCaseHelper.enterMobileNumber(mobileNumber, driver);
        ksrtcTestCaseHelper.enterEmail(RandomSource.generateRandomEmail(5), driver);
        ksrtcTestCaseHelper.enterName(name, driver);
        ksrtcTestCaseHelper.selectGender(gender);
        ksrtcTestCaseHelper.enterAge(age, driver);
        ksrtcTestCaseHelper.selectConcession(concession);
        ksrtcTestCaseHelper.clickTermsAndConditions(driver);
        ksrtcTestCaseHelper.clickMakePayment(driver);
    }

    @AfterTest()
    void closure() {
        driver.close();
    }
}
