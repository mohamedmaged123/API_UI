 package ui.uiFramework.driver;



import ui.uiFramework.driver.Enums.BrowserType;
import ui.uiFramework.driver.Enums.ConfigProperties;
import ui.uiFramework.driver.factories.BrowserFactory;
import ui.uiFramework.helpers.PropertyUtils;

import java.util.Objects;

 public final class DriverActions extends BrowserFactory {
     public static void quitDriver() {
         if (Objects.nonNull(DriverManager.getDriver())) {
             DriverManager.getDriver().quit();
             DriverManager.unload(); //clean after quit the driver
         }
     }
     public static void initDriver() throws Exception {
         if (DriverManager.getDriver() == null) {
             initBrowser(BrowserType.CHROME);
             DriverManager.getDriver().manage().window().maximize();

             DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
             // DriverManager.getDriver().get("https://reqres.in/api/users");
         }
     }
 }


