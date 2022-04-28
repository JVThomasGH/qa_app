package qa.ithuba.screens.screen_faq;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

public class ScreenFAQSportStake8 extends HelperUtil {


//    #################################
//    ####### QUESTIONS ###############
//    #################################

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is SPORTSTAKE 8?' or . = 'What is SPORTSTAKE 8?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq1;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How does the SPORTSTAKE 8 Game work?' or . = 'How does the SPORTSTAKE 8 Game work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq2;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where and when may I purchase a SPORTSTAKE 8 Game?' or . = 'Where and when may I purchase a SPORTSTAKE 8 Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq3;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where do I obtain the SPORTSTAKE 8 Fixtures to select the outcomes to predict?' or . = 'Where do I obtain the SPORTSTAKE 8 Fixtures to select the outcomes to predict?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq4;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I win in the SPORTSTAKE 8 Game?' or . = 'How do I win in the SPORTSTAKE 8 Game?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq5;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do I claim the SPORTSTAKE 8 Prize?' or . = 'How do I claim the SPORTSTAKE 8 Prize?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq6;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Where do I obtain the SPORTSTAKE 8 Fixture Lists and Results?' or . = 'Where do I obtain the SPORTSTAKE 8 Fixture Lists and Results?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq7;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do the Prize Divisions Work?' or . = 'How do the Prize Divisions Work?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq8;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What are the odds of winning SPORTSTAKE 8?' or . = 'What are the odds of winning SPORTSTAKE 8?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq9;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What happens to the Jackpot Prize if it is not won?' or . = 'What happens to the Jackpot Prize if it is not won?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq10;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What happens to the other prize division if there are no winners?' or . = 'What happens to the other prize division if there are no winners?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq11;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What is PROPICK?' or . = 'What is PROPICK?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq12;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'How do you play PROPICK?' or . = 'How do you play PROPICK?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq13;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'What considerations does the system make in selections made in PROPICK?' or . = 'What considerations does the system make in selections made in PROPICK?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq14;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Can you use one bet slip to play both PROPICK and own selection?' or . = 'Can you use one bet slip to play both PROPICK and own selection?')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq15;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Additional features on SPORTSTAKE 8' or . = 'Additional features on SPORTSTAKE 8')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade faq16;

    public void expandAndVerifyQuestionsSportStake8() {
        swipeUp(2);
        clickOn(faq16);
        clickOn(faq15);
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
