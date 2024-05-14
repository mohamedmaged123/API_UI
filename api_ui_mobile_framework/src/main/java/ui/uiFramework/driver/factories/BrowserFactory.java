package ui.uiFramework.driver.factories;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ui.uiFramework.driver.DriverManager;
import ui.uiFramework.driver.Enums.BrowserType;

public class BrowserFactory {
    protected static void initBrowser(BrowserType browserType) {
        switch (browserType) {

            case CHROME:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--lang=en");
                DriverManager.setDriver(new ChromeDriver(options));
                break;

        }
    }
}
