package ui.uiFramework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.uiFramework.driver.Enums.WaitStrategy;
import ui.uiFramework.driver.factories.ExplicitWaitFactory;
import ui.uiFramework.driver.DriverManager;

public class UIActions {
    public WebElement findElement(By locator) {
        return ExplicitWaitFactory.performExplicitWait(WaitStrategy.VISIBLE, locator);
    }

    public void clickOn(By locator) {
        WebElement element = ExplicitWaitFactory.performExplicitWait(WaitStrategy.ClICKABLE, locator);
        element.click();
    }
 
    public String getTextOfElement(By locator)
    {
        return findElement(locator).getText();
    }
    public void scrollToElement(By locator){
        Actions actions = new Actions(DriverManager.getDriver());
        WebElement element = findElement(locator);
        actions.moveToElement(element).build().perform();
    }
  
    public void writeIn(By locator, String text) {
        WebElement element = findElement(locator);
        element.sendKeys(text);
    }
    
    public void DynamicXpathWithOptionAndClick(String value) {

        WebDriver driver = DriverManager.getDriver();
        String dynamicXpath = String.format("//option[normalize-space(text()) = '%s']", value);
        By dynamicLocator = By.xpath(dynamicXpath);
        WebElement dynamicElement = driver.findElement(dynamicLocator);
        clickOn(dynamicLocator);
    }

    public void DynamicXpathWithSpantextAndClick(String value) {

        WebDriver driver = DriverManager.getDriver();
        String dynamicXpath = String.format("//span[normalize-space(text()) = '%s'] ", value);
        By dynamicLocator = By.xpath(dynamicXpath);
        WebElement dynamicElement = driver.findElement(dynamicLocator);
        clickOn(dynamicLocator);
    }
    
}