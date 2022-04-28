package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQSportStake13 extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is SPORTSTAKE 13?' or . = 'What is SPORTSTAKE 13?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the SPORTSTAKE 13 Game work?' or . = 'How does the SPORTSTAKE 13 Game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where and When may I purchase a SPORTSTAKE 13 Game?' or . = 'Where and When may I purchase a SPORTSTAKE 13 Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where do I obtain the SPORTSTAKE 13 Fixtures to select the outcomes to predict?' or . = 'Where do I obtain the SPORTSTAKE 13 Fixtures to select the outcomes to predict?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I win in the SPORTSTAKE 13 Game?' or . = 'How do I win in the SPORTSTAKE 13 Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I claim the SPORTSTAKE 13 Prize?' or . = 'How do I claim the SPORTSTAKE 13 Prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where do I obtain the SPORTSTAKE 13 Fixtures Results?' or . = 'Where do I obtain the SPORTSTAKE 13 Fixtures Results?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do the Prize Divisions Work?' or . = 'How do the Prize Divisions Work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are the odds of winning SPORTSTAKE 13?' or . = 'What are the odds of winning SPORTSTAKE 13?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What happens to the Jackpot Prize if it’s not won?' or . = 'What happens to the Jackpot Prize if it’s not won?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq10;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is PROPICK?' or . = 'What is PROPICK?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq11;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do you play PROPICK?' or . = 'How do you play PROPICK?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq12;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What considerations does the system make in selections made in PROPICK?' or . = 'What considerations does the system make in selections made in PROPICK?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq13;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Can you use one bet slip to play both PROPICK and own selection?' or . = 'Can you use one bet slip to play both PROPICK and own selection?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq14;

    public void expandAndVerifyQuestionsSportStake13() {
        swipeUp(2);
        clickOn(faq14);
        clickOn(faq13);
        clickOn(faq12);
        clickOn(faq11);
        clickOn(faq10);
        clickOn(faq9);
        clickOn(faq8);
        swipeDown(1);
        clickOn(faq7);
        clickOn(faq6);
        clickOn(faq5);
        clickOn(faq4);
        clickOn(faq3);
        clickOn(faq2);
        clickOn(faq1);
    }
}
