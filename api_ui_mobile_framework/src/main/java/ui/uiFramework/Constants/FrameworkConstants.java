package ui.uiFramework.Constants;

public final class FrameworkConstants {
    private static final String CHROME_DRIVER_PATH = getProjectDirectory() + "drivers\\chromedriver.exe";
    private static final String CONFIG_FILE_PATH = getProjectDirectory() + "src\\test\\java\\swinjiUITests\\config\\config.properties";

    private static final int EXPLICIT_WAIT = 30;
    private static final String RESOURCES_PATH = getProjectDirectory() + "src\\test\\java\\swinjiUITests\\data\\";
    private static final String APIBASEURL = getProjectDirectory() + "https://www.boredapi.com";
    private static final String ActivityEndPoint = getProjectDirectory() + "/api/activity";


    public static String getChromePath() {
        return CHROME_DRIVER_PATH;
    }

    public static String getProjectDirectory() {
        return System.getProperty("user.dir") + "\\";
    }

    public static String getConfigFilePath() {
        return CONFIG_FILE_PATH;
    }

    public static int getExplicitWait() {
        return EXPLICIT_WAIT;
    }
    public static String getAPIBaseUrl() {
        return APIBASEURL;
    }
    public static String getActivityEndPoint() {
        return ActivityEndPoint;
    }
    public static String readDataFile(String fileName) {
        System.out.println(RESOURCES_PATH + fileName);
        return RESOURCES_PATH + fileName;
    }
}
