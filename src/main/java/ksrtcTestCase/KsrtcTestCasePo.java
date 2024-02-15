package ksrtcTestCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KsrtcTestCasePo {


    @FindBy(xpath = "(//span[@class=\"carousel-control-next-icon\"])[2]")
    WebElement nextIcon;

    @FindBy(xpath = "//a[text()=\" Chikkamagaluru - Bengaluru\"]")
    WebElement chickToBeng;


    @FindBy(id = "ui-datepicker-div")
    WebElement calendar;


    @FindBy(xpath = "//tr[last()]/td[@data-handler=\"selectDay\"]")
    WebElement selectDay;


    @FindBy(xpath = "//button[normalize-space() = 'Search for Bus']")
    WebElement searchForBus;

    @FindBy(xpath = "(//input[@name=\"SrvcSelectBtnForward\"])[2]")
    WebElement selectSeats;

    @FindBy(xpath = "(//li[@onclick])[1]")
    WebElement firstSeat;

    @FindBy(xpath = "//a[text()=\"Customer Details\"]")
    WebElement customerDetails;

    @FindBy(id = "mobileNo")
    WebElement mobileNumberField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "passengerNameForward0")
    WebElement nameField;

    @FindBy(id = "genderCodeIdForward0")
    WebElement genderField;

    @FindBy(id = "passengerAgeForward0")
    WebElement ageField;

    @FindBy(id = "concessionIdsForward0")
    WebElement concessionField;

    @FindBy(id = "termsChk")
    WebElement termsAndConditionsCheckBox;

    @FindBy(id = "PgBtn")
    WebElement makePaymentButton;
}
