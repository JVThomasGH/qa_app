package qa.ithuba.utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class HelperUtil extends PageObject {

    public Logger log = LogManager.getLogger(Logger.class);

    public void swipeUp(int howManySwipes) {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        Dimension size = androidDriver.manage().window().getSize();
//        System.out.println(size);
        // Calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.85);
        int endVerticalY = (int) (size.height * 0.25);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {

                new TouchAction(androidDriver)
                        .press(PointOption.point(startVerticalX, startVerticalY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                        .moveTo(PointOption.point(startVerticalX, endVerticalY))
                        .release().perform();
            }
        } catch (Exception e) {
            System.out.println("UNABLE TO SWIPE");
        }
    }

    public void swipeDown(int howManySwipes) {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        Dimension size = androidDriver.manage().window().getSize();
        int startVerticalY = (int) (size.height * 0.85);
        int endVerticalY = (int) (size.height * 0.25);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction(androidDriver)
                        .press(PointOption.point(startVerticalX, endVerticalY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                        .moveTo(PointOption.point(startVerticalX, startVerticalY))
                        .release().perform();
            }
        } catch (Exception e) {
            System.out.println("UNABLE TO SWIPE");
        }
    }

    public void swipeUp(double startVYPercent, double endVYPercent) {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        Dimension size = androidDriver.manage().window().getSize();

        int startVerticalY = (int) (size.height * startVYPercent);
        int endVerticalY = (int) (size.height * endVYPercent);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= 1; i++) {
                new TouchAction(androidDriver)
                        .press(PointOption.point(startVerticalX, startVerticalY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                        .moveTo(PointOption.point(startVerticalX, endVerticalY))
                        .release().perform();
            }
        } catch (Exception e) {
            System.out.println("UNABLE TO SWIPE");
        }
    }

    public void swipeDown(double startVYPercent, double endVYPercent) {
        AndroidDriver androidDriver = ((AndroidDriver) ((WebDriverFacade) getDriver()).getProxiedDriver());
        Dimension size = androidDriver.manage().window().getSize();

        int startVerticalY = (int) (size.height * startVYPercent);
        int endVerticalY = (int) (size.height * endVYPercent);
        int startVerticalX = (int) (size.width / 2.1);

        try {
            for (int i = 1; i <= 1; i++) {
                new TouchAction(androidDriver)
                        .press(PointOption.point(startVerticalX, startVerticalY))
                        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                        .moveTo(PointOption.point(startVerticalX,endVerticalY))
                        .release().perform();
            }

        } catch (Exception e) {
            System.out.println("UNABLE TO SWIPE");
        }
    }

    public String GENERATE_DATE() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public ArrayList<Integer> numberGenerator(int numbers, int poolSize) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < poolSize + 1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < numbers; i++) {
            System.out.println(list.get(i));
            list2.add(list.get(i));
        }
        return list2;
    }

    public void SLEEP(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void logger(String message) {
        log.info(message);
    }

    public void disconnectWLAN() {
        try {
            Runtime.getRuntime().exec("netsh wlan disconnect");
            logger("Disconnected WLAN for testing...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reconnectWLAN() {
        try {
            Runtime.getRuntime().exec("netsh wlan connect");
            logger("Reconnected WLAN for testing...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addToClipboard(String addText) {
        StringSelection stringSelection = new StringSelection(addText);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public void pasteFromClipboard() {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_V);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_V);
        } catch (Exception ignored) {
        }
    }

    public void pressEscKey() {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
    }
}