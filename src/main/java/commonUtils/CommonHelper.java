package commonUtils;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.ArrayList;

public class CommonHelper {


    public static void openWebPage(String url,WebDriver driver) {
        driver.navigate().to(url);
    }


    public static void waitUntilElementAppears(WebElement po,WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(po));
    }

    public static void clickWhenReady(WebElement po,WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(po)).click();
    }

    public static void verifyElementAppears(WebElement Po,WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(Po));
    }

    public static void sendText(WebElement po, String Text,WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(po)).sendKeys(Text);
    }

    public static void selectFromDropDownByText(WebElement po, String text) {
        Select options = new Select(po);
        options.selectByVisibleText(text);
    }

    public static void takeSnapShot(String screenshotName,WebDriver driver) {
        Allure.addAttachment(screenshotName, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    public static void scrollToElement(WebElement po,WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", po);
    }

    public static void clickUsingJS(WebElement po,WebDriver driver) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", po);
    }

    public static void pressEnterButton(WebElement po,WebDriver driver){
        po.sendKeys(Keys.RETURN);
    }
}