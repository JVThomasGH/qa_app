package qa.ithuba.screens.screen_about;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenAbout extends HelperUtil {

        @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'National Lottery' or . = 'National Lottery')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade imageAbout;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'In 2015, ITHUBA Holdings (RF) Proprietary Limited was appointed as the official National Lottery operator of South Africa by the National Lotteries Commission.' or . = 'In 2015, ITHUBA Holdings (RF) Proprietary Limited was appointed as the official National Lottery operator of South Africa by the National Lotteries Commission.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade text1About;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'When we took over the National Lottery, we promised to optimise the consumer experience by reinvigorating the National Lottery’s offering. Since then, we have offered bigger and better jackpots that have been won by ordinary South Africans, and as a result, our National Lottery Distribution Trust Fund contributions to socio-economic development through various good cause charity initiatives, remains impactful.' or . = 'When we took over the National Lottery, we promised to optimise the consumer experience by reinvigorating the National Lottery’s offering. Since then, we have offered bigger and better jackpots that have been won by ordinary South Africans, and as a result, our National Lottery Distribution Trust Fund contributions to socio-economic development through various good cause charity initiatives, remains impactful.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade text2About;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'In August 2018, we announced the biggest PowerBall jackpot in the history of the National Lottery. Once again, this was in line with the objective that we set back in 2015: to set the benchmark for Lottery operations in South Africa and beyond.' or . = 'In August 2018, we announced the biggest PowerBall jackpot in the history of the National Lottery. Once again, this was in line with the objective that we set back in 2015: to set the benchmark for Lottery operations in South Africa and beyond.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade text3About;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'On this site, we provide information about winning numbers after each draw; the jackpot prizes and simplified, how to play instructions for all Lottery games. Players also have the opportunity to register to play online and enjoy the convenience of playing their favourite National Lottery games from anywhere.' or . = 'On this site, we provide information about winning numbers after each draw; the jackpot prizes and simplified, how to play instructions for all Lottery games. Players also have the opportunity to register to play online and enjoy the convenience of playing their favourite National Lottery games from anywhere.')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade text4About;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Phanda Pusha Play' or . = 'Phanda Pusha Play')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade text5About;

    public void verifyAboutImage() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("National Lottery image not displayed", "National Lottery", imageAbout.getText());
    }

    public void verifyPageText() {
        Assert.assertEquals("In 2015, ITHUBA Holdings (RF) Proprietary Limited was appointed as the official National Lottery operator of South Africa by the National Lotteries Commission.", text1About.getText());
        Assert.assertEquals("When we took over the National Lottery, we promised to optimise the consumer experience by reinvigorating the National Lottery’s offering. Since then, we have offered bigger and better jackpots that have been won by ordinary South Africans, and as a result, our National Lottery Distribution Trust Fund contributions to socio-economic development through various good cause charity initiatives, remains impactful.", text2About.getText());
        Assert.assertEquals("In August 2018, we announced the biggest PowerBall jackpot in the history of the National Lottery. Once again, this was in line with the objective that we set back in 2015: to set the benchmark for Lottery operations in South Africa and beyond.", text3About.getText());
        swipeUp(1);
        Assert.assertEquals("On this site, we provide information about winning numbers after each draw; the jackpot prizes and simplified, how to play instructions for all Lottery games. Players also have the opportunity to register to play online and enjoy the convenience of playing their favourite National Lottery games from anywhere.", text4About.getText());
        Assert.assertEquals("Phanda Pusha Play", text5About.getText());
    }
}
