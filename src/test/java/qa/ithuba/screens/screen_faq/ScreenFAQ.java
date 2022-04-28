package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenFAQ extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = concat('FAQ' , \"'\" , 's') or . = concat('FAQ' , \"'\" , 's')) and @resource-id = 'com.nationallottery.ithuba:id/txt_lbl']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade textFAQ;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageLotto;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imagePowerBall;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageSportStake4;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[4]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageSportStake8;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[5]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageSportStake13;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[6]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageSportStakeCricket;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[7]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageSportStakeRugby;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[8]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageDailyLotto;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[9]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageRaffle;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.widget.ImageView[10]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageEaziWIN;

    @AndroidFindBy(className = "android.widget.ImageView")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> gameIcons;


    public void verifyTextFAQ () {
        Assert.assertEquals("FAQ's", textFAQ.getText());
        Assert.assertTrue(imageLotto.isDisplayed());
        Assert.assertTrue(imagePowerBall.isDisplayed());
        Assert.assertTrue(imageSportStake4.isDisplayed());
        Assert.assertTrue(imageSportStake8.isDisplayed());
        Assert.assertTrue(imageSportStake13.isDisplayed());
        Assert.assertTrue(imageSportStakeCricket.isDisplayed());
        Assert.assertTrue(imageSportStakeRugby.isDisplayed());
        Assert.assertTrue(imageDailyLotto.isDisplayed());
        Assert.assertTrue(imageRaffle.isDisplayed());
        Assert.assertTrue(imageEaziWIN.isDisplayed());
    }

    public void clickIcon(String icon) {
        switch (icon) {
            case "Lotto" -> gameIcons.get(0).click();
            case "PowerBall" -> gameIcons.get(1).click();
            case "SportStake 4" -> gameIcons.get(2).click();
            case "SportStake 8" -> gameIcons.get(3).click();
            case "SportStake 13" -> gameIcons.get(4).click();
            case "SportStake Cricket" -> gameIcons.get(5).click();
            case "SportStake Rugby" -> gameIcons.get(6).click();
            case "Daily Lotto" -> gameIcons.get(7).click();
            case "Raffle" -> gameIcons.get(8).click();
            case "EaziWIN" -> gameIcons.get(9).click();
            default -> throw new IllegalArgumentException(icon);
        }
    }
}
