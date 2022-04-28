package qa.ithuba.utilities;

import net.thucydides.core.pages.PageObject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Props extends PageObject {

    HelperUtil helperUtil;


    /*
     * Options: local | remote
     */
    public static String environment = "local";
    public static String seleniumServerURL = "http://localhost:5555/wd/hub";


    public static String userPIN = "12345";

    /**
     * Set the Browser
     * Options: chrome, chrome_headless, firefox, ie, edge, safari, opera
     */
//    public static String desiredBrowser = "chrome_headless";
    public static String desiredBrowser = "chrome";

    public static String env = "QA";
    public static String AppURL = "https://qa.nationallottery.co.za/";
    public static String userID = "0823914052";
//    public static String userID = "0718933068";


//    public static String env = "PLS";
//    public static String AppURL = "https://qa-pls.nationallottery.co.za/";
    //    public static String userID = "0735808305";
//    public static String userID = "0735808300";

//    public static String env = "PROD";
//    public static String AppURL = "https://www.nationallottery.co.za/";
    //    public static String userID = "0718879677";

    /**
     * Set the Implicit Time
     */
    public static String implicitWaitTime = "5";


    public static String sauceUserID = "jtvincent";
    public static String sauceKey = "ace86b5a-5bab-4faa-b195-8cb229f698bc";

    /**
     * Maximise browser window when launch
     * Options: true | false
     */
    public static String windowMaximize = "true";

    /**
     * Test Data spread sheet relative path (TestData.xlsx)
     */

    public static String testDataSourceFile = System.getProperty("user.dir") + "\\src\\main\\resources\\TestData\\TestData.xlsx";

    public static String testDataSourceFileLinux = System.getProperty("user.dir") + "/TestData/TestData.xlsx";

    /**
     * Share Drive location to save reports
     */
    public static String stringGeneratingReportLocation = "\\\\s-jhb-fs01\\IT\\IT MIS\\MIS - QA\\PROJECTS - ECOMMERCE\\Automation\\Reports\\";

    /**
     * Get Local Machine name for creating folders
     */
    public String MACHINE_NAME = Get_MACHINE_NAME();

    /**
     * Get Date and Create folder
     */
    static String reportFolderName = DateUtils.Folder_Name_Todays_Date();

    /**
     * Attach Screenshot to reports
     * Option: yes | no
     */
    public static String screenshotsAfterFail = "yes";
    public static String screenshotsAtSteps = "yes";

    /**
     * Close Chrome Drivers before runtime
     * Option: yes | no
     */
    public static String closeChromeDriversBeforeRun = "yes";

    /**
     * Close Chrome Browsers before runtime
     * Option: yes | no
     */
    public static String closeChromeBrowserBeforeRun = "yes";

    /**
     * Terminate Driver after runtime
     * Option: yes | no
     */
    public static String closeDriverAfterRun = "no";

    /**
     * Driver Properties
     */
    public static String chromeDriverPath = "src/main/resources/WebDrivers/chromedriver.exe";
    public static String firefoxDriverPath = "src/main/resources/WebDrivers/geckodriver.exe";
    public static String ieDriverPath = "src/main/resources/WebDrivers/IEDriverServer.exe";
    public static String edgeDriverPath = "src/main/resources/WebDrivers/msedgedriver.exe";
    public static String operaDriverPath = "src/main/resources/WebDrivers/operadriver.exe";


    /**
     * Method for getting Machine Name
     *
     * @return Returns the current machine name
     */
    public String Get_MACHINE_NAME() {
        String hostname = "HOST-Unknown";
        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
            helperUtil.logger("Getting Host Name: " + hostname);
        } catch (UnknownHostException ex) {
            System.out.println("Hostname can not be resolved");
        }
        return hostname;
    }

//    public static String reportLocation = FileUtils.createFolder(stringGeneratingReportLocation + MACHINE_NAME + "/" + reportFolderName + "/" + "/");
//    public static String LogLocation = FileUtils.createFolder(stringGeneratingReportLocation + MACHINE_NAME + "/" + "Logs" + "/");
//    public static String screenShot   Location = FileUtils.createFolder(stringGeneratingReportLocation + MACHINE_NAME + "/" + reportFolderName + "/" + "/" + "ScreenShots" + "/");
//    public static String pdfFilesLocation = FileUtils.createFolder(stringGeneratingReportLocation + MACHINE_NAME + "/" + reportFolderName + "/" + "/" + "PdfFiles" + "/");

}
