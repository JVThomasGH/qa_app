package qa.ithuba.screens.screen_how_to;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.utilities.HelperUtil;

public class ScreenHowToEaziWIN extends HelperUtil {

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageView' and @resource-id = 'com.nationallottery.ithuba:id/game_img' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoHowToEaziWIN;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'DISKI ACTION' or . = 'DISKI ACTION')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameDiskiAction;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'FRUITY BUCKS' or . = 'FRUITY BUCKS')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameFruityBucks;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'AQUA ZAKA' or . = 'AQUA ZAKA')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameAquaZaka;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'ANCIENT MOOLA' or . = 'ANCIENT MOOLA')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameAncientMoola;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'Morabaraba' or . = 'Morabaraba')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameMorabaraba;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = '4 Siya Wina' or . = '4 Siya Wina')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade game4SiyaWina;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'LOBOLA CASH' or . = 'LOBOLA CASH')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameLobolaCash;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'SPIN 4 CASH' or . = 'SPIN 4 CASH')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameSpin4Cash;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'LUCKY 21' or . = 'LUCKY 21')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameLucky21;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'FAFI FORTUNE' or . = 'FAFI FORTUNE')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameFafiFortune;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'CALABASH CASH' or . = 'CALABASH CASH')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameCalabashCash;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'POPA FEELA PLUS' or . = 'POPA FEELA PLUS')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gamePopaFeelaPlus;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'BALLOON BONANZA' or . = 'BALLOON BONANZA')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameBalloonBonanza;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'CANDY CASH' or . = 'CANDY CASH')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameCandyCash;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'MONEY BEE' or . = 'MONEY BEE')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameMoneyBee;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'TREASURE HUNT' or . = 'TREASURE HUNT')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameTreasureHunt;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'SOCCER LEAGUE' or . = 'SOCCER LEAGUE')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameSoccerLeague;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'TIC TAC TOE' or . = 'TIC TAC TOE')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameTicTacToe;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'LUCKY JERSEY' or . = 'LUCKY JERSEY')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameLuckyJersey;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'HAVE A BREAK' or . = 'HAVE A BREAK')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade gameHaveABreak;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'RULES AND REGULATIONS' or . = 'RULES AND REGULATIONS')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonRulesAndRegs;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PLAY ONLINE GAME' or . = 'PLAY ONLINE GAME') and @resource-id = 'com.nationallottery.ithuba:id/play_game_how_to']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPlayOnlineGame;


    public void verifyHowToEaziWINText() {
        logoHowToEaziWIN.waitUntilVisible();
        Assert.assertEquals("DISKI ACTION", gameDiskiAction.getText());
        Assert.assertEquals("FRUITY BUCKS", gameFruityBucks.getText());
        Assert.assertEquals("AQUA ZAKA", gameAquaZaka.getText());
        Assert.assertEquals("ANCIENT MOOLA", gameAncientMoola.getText());
        Assert.assertEquals("Morabaraba", gameMorabaraba.getText());
        Assert.assertEquals("4 Siya Wina", game4SiyaWina.getText());
        swipeUp(1);

        Assert.assertEquals("LOBOLA CASH", gameLobolaCash.getText());
        Assert.assertEquals("SPIN 4 CASH", gameSpin4Cash.getText());
        Assert.assertEquals("LUCKY 21", gameLucky21.getText());
        Assert.assertEquals("FAFI FORTUNE", gameFafiFortune.getText());
        swipeUp(1);

        Assert.assertEquals("CALABASH CASH", gameCalabashCash.getText());
        Assert.assertEquals("POPA FEELA PLUS", gamePopaFeelaPlus.getText());
        Assert.assertEquals("BALLOON BONANZA", gameBalloonBonanza.getText());
        Assert.assertEquals("CANDY CASH", gameCandyCash.getText());
        swipeUp(1);

        Assert.assertEquals("MONEY BEE", gameMoneyBee.getText());
        Assert.assertEquals("TREASURE HUNT", gameTreasureHunt.getText());
        Assert.assertEquals("SOCCER LEAGUE", gameSoccerLeague.getText());
        Assert.assertEquals("TIC TAC TOE", gameTicTacToe.getText());
        swipeUp(1);

        Assert.assertEquals("LUCKY JERSEY", gameLuckyJersey.getText());
        Assert.assertEquals("HAVE A BREAK", gameHaveABreak.getText());
        Assert.assertEquals("RULES AND REGULATIONS", buttonRulesAndRegs.getText());
        Assert.assertEquals("PLAY ONLINE GAME", buttonPlayOnlineGame.getText());
        swipeDown(4);
    }
}
