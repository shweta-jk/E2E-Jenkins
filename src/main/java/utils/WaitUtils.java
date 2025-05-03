package utils;

import drivers.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class WaitUtils {

    private static final int DEFAULT_TIMEOUT = 50;

    private static WebDriverWait getWait() {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(DEFAULT_TIMEOUT));
    }

    public static WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(By locator) {
        return getWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static boolean waitForInvisibility(By locator) {
        return getWait().until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static boolean waitForUrlToContain(String partialUrl) {
        return getWait().until(ExpectedConditions.urlContains(partialUrl));
    }

    public static boolean waitForTextToBePresent(By locator, String text) {
        return getWait().until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    public static Alert waitForAlert() {
        return getWait().until(ExpectedConditions.alertIsPresent());
    }
}
