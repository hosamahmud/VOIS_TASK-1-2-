package amazonTestCase2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonTestCase2Po {


    @FindBy(xpath = "//input[@data-action-type=\"DISMISS\"]")
    WebElement dismissButton;
    @FindBy(xpath = "//a[text()=\"Today's Deals\"]")
    WebElement todaysDeals;

    @FindBy(xpath = "//span[text()=\"Headphones & Earbuds\"]/preceding-sibling::input")
    WebElement headPhonesCheckBox;

    @FindBy(xpath = "//span[text()=\"Grocery & Gourmet Food\"]/preceding-sibling::input")
    WebElement groceryCheckBox;


    @FindBy(xpath = "//span[text()=\"10% off or more\"]")
    WebElement tenPercentDiscount;

    @FindBy(xpath = "//div[contains (text(), 'off')]")
    WebElement loadedDeals;


    @FindBy(xpath = "//a[text()=\"3\"]")
    WebElement thirdPage;

    @FindBy(xpath = "(//div[@data-testid=\"grid-deals-container\"]/div)[1]")
    WebElement firstItem;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;
}
