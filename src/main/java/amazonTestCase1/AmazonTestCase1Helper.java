package amazonTestCase1;

import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonTestCase1Helper extends AmazonTestCase1Po {

    public AmazonTestCase1Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    AmazonTestCase1Constants amazonTestCase1Constants = new AmazonTestCase1Constants();

    public void searchForItem(WebDriver driver) {
        CommonHelper.sendText(searchBar, amazonTestCase1Constants.carAccessories, driver);
        CommonHelper.pressEnterButton(searchBar, driver);
    }

    public void clickFirstItem(WebDriver driver) {
        CommonHelper.clickWhenReady(firstItem, driver);
    }

    public void addSelectedItemToCart(WebDriver driver) {
        CommonHelper.clickWhenReady(addToCartButton, driver);
    }

    public void verifyItemImage(WebDriver driver) {
        CommonHelper.verifyElementAppears(confirmationImage, driver);
    }

    public void goToCart(WebDriver driver) {
        CommonHelper.clickWhenReady(goToCartButton, driver);
    }

    public void addItemToCart(WebDriver driver) {
        this.searchForItem(driver);
        this.clickFirstItem(driver);
        this.addSelectedItemToCart(driver);
        this.verifyItemImage(driver);
        this.goToCart(driver);
    }

    public void verifyOneItemAdded(WebDriver driver) {
        CommonHelper.verifyElementAppears(subTotalItem, driver);
    }
}

