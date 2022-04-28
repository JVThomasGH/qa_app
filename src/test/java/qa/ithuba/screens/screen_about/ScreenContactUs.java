package qa.ithuba.screens.screen_about;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

public class ScreenContactUs extends HelperUtil {

    ScreenBase screenBase;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'CONTACT US' or . = 'CONTACT US') and @resource-id = 'com.nationallottery.ithuba:id/title_txt']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'DO YOU NEED TO SPEAK TO OUR CALL CENTRE AGENTS?' or . = 'DO YOU NEED TO SPEAK TO OUR CALL CENTRE AGENTS?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade heading2ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'For players please contact the Player Help Line on' or . = 'For players please contact the Player Help Line on')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line1ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '0800 484 822' or . = '0800 484 822')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line2ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = '(Toll-free from a landline)' or . = '(Toll-free from a landline)')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line3ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'For retailers please contact the Retailer Help Line on' or . = 'For retailers please contact the Retailer Help Line on')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line4ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '0860 456 886' or . = '0860 456 886')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line5ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'The office hours are:' or . = 'The office hours are:')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line6ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Monday to Saturday' or . = 'Monday to Saturday')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line7ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '06:00am - 23:00pm' or . = '06:00am - 23:00pm')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line8ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Sundays' or . = 'Sundays')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line9ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '6:00am - 21:00pm' or . = '6:00am - 21:00pm')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line10ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Alternatively please send an email to' or . = 'Alternatively please send an email to')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line11ContactUs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'info@ithubalottery.co.za' or . = 'info@ithubalottery.co.za')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade line12ContactUs;

    public void verifyIfOnContactUsScreen(String screenName) {
        Assert.assertEquals(screenName, headingContactUs.getText());
    }

    public void verifyContactUsScreen() {
        Assert.assertEquals("CONTACT US", headingContactUs.getText());
        Assert.assertEquals("DO YOU NEED TO SPEAK TO OUR CALL CENTRE AGENTS?", heading2ContactUs.getText());
        Assert.assertEquals("For players please contact the Player Help Line on", line1ContactUs.getText());
        Assert.assertEquals("0800 484 822", line2ContactUs.getText());
        Assert.assertEquals("(Toll-free from a landline)", line3ContactUs.getText());
        Assert.assertEquals("For retailers please contact the Retailer Help Line on", line4ContactUs.getText());
        Assert.assertEquals("0860 456 886", line5ContactUs.getText());
        Assert.assertEquals("The office hours are:", line6ContactUs.getText());
        Assert.assertEquals("Monday to Saturday", line7ContactUs.getText());
        Assert.assertEquals("06:00am - 23:00pm", line8ContactUs.getText());
        Assert.assertEquals("Sundays", line9ContactUs.getText());
        Assert.assertEquals("6:00am - 21:00pm", line10ContactUs.getText());
        Assert.assertEquals("Alternatively please send an email to", line11ContactUs.getText());
        Assert.assertEquals("info@ithubalottery.co.za", line12ContactUs.getText());
    }

    public void clickLink(String link) {
        switch (link) {
            case "0800 484 822" -> {
                SLEEP(1000);
                clickOn(line2ContactUs);
                SLEEP(200);
                getDriver().navigate().back();
                SLEEP(200);
                getDriver().navigate().back();
                SLEEP(200);
                getDriver().navigate().back();
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "0860 456 886" -> {
                SLEEP(1000);
                clickOn(line5ContactUs);
                SLEEP(200);
                getDriver().navigate().back();
                SLEEP(200);
                getDriver().navigate().back();
                SLEEP(200);
                getDriver().navigate().back();
                SLEEP(1000);
                screenBase.clickBackArrow();
            }
            case "info@ithubalottery.co.za" -> {
                clickOn(line12ContactUs);
            }
            default -> throw new IllegalArgumentException(link);
        }
    }
}
