package ksrtcTestCase;

import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class KsrtcTestCaseHelper extends KsrtcTestCasePo {

    public KsrtcTestCaseHelper(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void chooseDestination(WebDriver driver) {
        CommonHelper.scrollToElement(nextIcon, driver);
        CommonHelper.clickWhenReady(nextIcon, driver);
        CommonHelper.clickWhenReady(chickToBeng, driver);
    }

    public void chooseDate(WebDriver driver) {
        CommonHelper.waitUntilElementAppears(calendar, driver);
        CommonHelper.scrollToElement(selectDay, driver);
        CommonHelper.clickWhenReady(selectDay, driver);
    }

    public void clickSearchForBus(WebDriver driver) {
        CommonHelper.clickWhenReady(searchForBus, driver);
    }

    public void clickSelectSeats(WebDriver driver) {
        CommonHelper.clickWhenReady(selectSeats, driver);
    }

    public void selectSeats(WebDriver driver) {
        CommonHelper.clickWhenReady(firstSeat, driver);
    }

    public void clickCustomerDetails(WebDriver driver) {
        CommonHelper.clickUsingJS(customerDetails, driver);
    }

    public void enterMobileNumber(String mobileNo, WebDriver driver) {
        CommonHelper.scrollToElement(mobileNumberField,driver);
        CommonHelper.sendText(mobileNumberField, mobileNo, driver);
    }

    public void enterEmail(String email, WebDriver driver) {
        CommonHelper.sendText(emailField, email, driver);
    }

    public void enterName(String name, WebDriver driver) {
        CommonHelper.scrollToElement(makePaymentButton,driver);
        CommonHelper.sendText(nameField, name, driver);
    }

    public void enterAge(String age, WebDriver driver) {
        CommonHelper.sendText(ageField, age, driver);
    }

    public void selectGender(String gender) {
        CommonHelper.selectFromDropDownByText(genderField, gender);
    }

    public void selectConcession(String concession) {
        CommonHelper.selectFromDropDownByText(concessionField, concession);
    }


    public void clickTermsAndConditions(WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CommonHelper.clickWhenReady(termsAndConditionsCheckBox, driver);
    }


    public void clickMakePayment(WebDriver driver) {
        CommonHelper.clickWhenReady(makePaymentButton, driver);
    }


}

