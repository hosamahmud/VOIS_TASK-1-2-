package amazonTestCase1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonTestCase1Po {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;

    @FindBy(xpath = "//div[@data-index=\"3\"]")
    WebElement firstItem;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(id = "add-to-cart-confirmation-image")
    WebElement confirmationImage;

    @FindBy(xpath = "(//a[normalize-space() = 'Go to Cart'])[2]")
    WebElement goToCartButton;

    @FindBy(xpath = "(//span[normalize-space() = 'Subtotal (1 item):'])[2]")
    WebElement subTotalItem;
}
