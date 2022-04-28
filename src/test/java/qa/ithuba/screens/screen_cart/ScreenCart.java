package qa.ithuba.screens.screen_cart;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import qa.ithuba.utilities.HelperUtil;

import java.util.List;

public class ScreenCart extends HelperUtil {
    boolean topGameInCart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'com.nationallottery.ithuba:id/ib_cart' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade iconCart;

    @AndroidFindBy(className = "android.view.ViewGroup")
//    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> itemsInCart;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.ImageView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade deleteInCart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonOKDelete;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Empty Cart.' or . = 'Empty Cart.') and @resource-id = 'com.nationallottery.ithuba:id/txt_lbl']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade emptyCartText;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txt_cart_count']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade cartItems;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'PAY FROM MY WALLET' or . = 'PAY FROM MY WALLET') and @resource-id = 'com.nationallottery.ithuba:id/b_pay_from_wallet']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPayFromWallet;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'PAY NOW' or . = 'PAY NOW') and @resource-id = 'com.nationallottery.ithuba:id/b_pay']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPayNow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MY CART' or . = 'MY CART') and @resource-id = 'com.nationallottery.ithuba:id/txtCartPlaySuccess']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelMyCart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Great,Your Play was Successful!' or . = 'Great,Your Play was Successful!') and @resource-id = 'com.nationallottery.ithuba:id/tv_cart_play_status']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelSuccessPlay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txtReceiptNumber']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelReceiptNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txtGameName']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelGame;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txtDrawDate']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelDrawDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txtDrawNumber']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelDrawNumber;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.ScrollView[1]/android.view.ViewGroup[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelPlayedNumbers;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/txtTotalCost']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTicketCost;

    @AndroidFindBy(id = "com.nationallottery.ithuba:id/iv_delete")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade deleteItemInCart;

    public void clickCartIcon() {
        SLEEP(2000);
        clickOn(iconCart);
    }

    public void removeAllItemsFromCart() {
        try {
            while (deleteItemInCart.isDisplayed()) {
                clickOn(deleteItemInCart);
                clickOn(buttonOKDelete);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCart() {
        return cartItems.getText();
    }

    public void clickPayFromWallet() {
        clickOn(buttonPayFromWallet);
    }

    public void clickPayNow() {
        clickOn(buttonPayNow);
    }

    public void verifyPlayedNumbers() {
        System.out.println("NUMBERS PLAYED: " + labelPlayedNumbers.getText());
    }

    public void verifyReceipt() {
        logger(labelSuccessPlay.getText());
        logger(labelReceiptNumber.getText());
        logger(labelGame.getText());
//        logger(labelDrawDate.getText());
        logger(labelDrawNumber.getText());
        logger(labelPlayedNumbers.getText());
        logger(labelTicketCost.getText());
    }

//
//    public void verifyItemInCartSS8() {
//        Assert.assertTrue("❌ Game is NOT in cart", topItemInCartSS8.isDisplayed());
//    }

//    public void verifyItemInCartSS13() {
//        Assert.assertTrue("❌ Game is NOT in cart", topItemInCartSS13.isDisplayed());
//    }
//
//    public void verifyItemInCartRaffle() {
//        Assert.assertTrue("❌ Game is NOT in cart", topItemInCartSS13.isDisplayed());
//    }
//
//    public void verifyItemInCartQuickPick() {
//        Assert.assertTrue("❌ Game is NOT in cart", topItemInCartQuickPick.isDisplayed());
//    }
//
//
//    public void isItemInCart(String purchasedItem) {
//        System.out.println("cartItems.getText(): " + cartItems.getText());
//        Assert.assertTrue("❌ Purchased Item is not in Cart", cartItems.getText().contains(purchasedItem));
//    }
//


//
//    public void clickXButtonTopItem() {
//        if (emptyCartText.isDisplayed()) {
//            logger("Cart is Empty");
//        } else {
//            buttonXTop.click();
//        }
//    }
//
//    public void verifyFailCount() {
//        logger("FAILED TRANSACTIONS: " + labelTxnFailed.getText());
//    }
}
