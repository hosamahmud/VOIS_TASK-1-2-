package amazonTestCase2;

import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonTestCase2Helper extends AmazonTestCase2Po {

    public AmazonTestCase2Helper(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void openTodaysDeals(WebDriver driver) {
        CommonHelper.clickWhenReady(dismissButton, driver);
        CommonHelper.clickWhenReady(todaysDeals, driver);
    }


    public void selectHeadPhonesCheckBox(WebDriver driver) {
        CommonHelper.scrollToElement(groceryCheckBox, driver);
        CommonHelper.clickWhenReady(headPhonesCheckBox, driver);
    }

    public void selectGroceryCheckBox(WebDriver driver) {
        CommonHelper.clickWhenReady(groceryCheckBox, driver);
    }

    public void selectTenPercentDiscount(WebDriver driver) {
        CommonHelper.scrollToElement(tenPercentDiscount, driver);
        CommonHelper.clickWhenReady(tenPercentDiscount, driver);
    }

    public void goToThirdPage(WebDriver driver) {
        CommonHelper.waitUntilElementAppears(loadedDeals, driver);
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CommonHelper.scrollToElement(thirdPage, driver);
        CommonHelper.clickWhenReady(thirdPage, driver);
    }


    public void selectFirstItem(WebDriver driver) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        CommonHelper.clickWhenReady(firstItem, driver);
    }

    public void addSelectedItemToCart(WebDriver driver) {
        CommonHelper.clickWhenReady(addToCartButton, driver);
    }

}

