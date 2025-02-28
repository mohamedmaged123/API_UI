package ui.uiFramework.driver.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.uiFramework.Constants.FrameworkConstants;
import ui.uiFramework.driver.DriverManager;
import ui.uiFramework.driver.Enums.WaitStrategy;

import java.time.Duration;


    public class ExplicitWaitFactory {

        public static WebElement performExplicitWait(WaitStrategy waitStrategy, By locator) {
            WebElement element = null;
            if (waitStrategy == WaitStrategy.ClICKABLE) {
                element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                        .until(ExpectedConditions.elementToBeClickable(locator));
            } else if (waitStrategy == WaitStrategy.PRESENCE) {
                element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                        .until(ExpectedConditions.presenceOfElementLocated(locator));
            } else if (waitStrategy == WaitStrategy.VISIBLE) {
                element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(FrameworkConstants.getExplicitWait()))
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
            } else if (waitStrategy == WaitStrategy.NONE) {
                element = DriverManager.getDriver().findElement(locator);
            }
            return element;
        }
    }
