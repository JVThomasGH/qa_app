package qa.ithuba.step_definitions.steps_cart;

import io.cucumber.java.en.And;
import net.serenitybdd.core.SkipStepException;
import qa.ithuba.screens.screen_cart.ScreenCart;
import qa.ithuba.utilities.HelperUtil;

public class StepsCart extends HelperUtil {

    ScreenCart screenCart;

    @And("Verify that the player is able to add a single ticket of the {string} Game to Cart")
    public void verifyThatThePlayerIsAbleToAddASingleTicketOfTheGameToCart(String game) {
//        screenCart.verifyItemInCart(game);
    }

    @And("Confirm tickets in Cart")
    public void confirmTicketsInCart() {
        String numberOfTickets = "6";
//        pageRaffle.confirmAmountOfTicketsSelected(numberOfTickets);
    }

    @And("Remove {int} Items from the Cart")
    public void removeItemsFromTheCart(int tickets) {
//        screenCart.removeItemsFromCart(tickets);
    }

    @And("Player clicks on Cart icon")
    public void player_clicks_on_cart_icon() {
        screenCart.clickCartIcon();
    }

    @And("Remove all Items from Cart")
    public void remove_all_items_from_cart() {
        screenCart.removeAllItemsFromCart();
    }

    @And("Click Go To Cart button")
    public void clickCartIconButton() {
        screenCart.clickCartIcon();
    }

    @And("Verify {string} Item in Cart")
    public void verifyItemInCart(String gameName) throws InterruptedException {
        Thread.sleep(3000);
//        switch (gameName) {
//            case "TICKET" -> screenCart.isItemInCart("TICKET");
//            case "Lotto", "Lotto Plus 2", "PowerBall", "Lotto Plus 1", "Daily Lotto", "PowerBall Plus" -> screenCart.isItemInCart("TICKET");
//            case "SportStake 8" -> screenCart.verifyItemInCartSS8();
//            case "SportStake 13" -> screenCart.verifyItemInCartSS13();
//            case "Raffle" -> screenCart.verifyItemInCartRaffle();
//            case "Quick Pick" -> screenCart.verifyItemInCartQuickPick();
//            default -> throw new IllegalStateException("Invalid option selected: " + gameName);
//        }
    }

    @And("Click on X on a board of a particular ticket you want to remove")
    public void clickOnXOnABoardOfAParticularTicketYouWantToRemove() {
//        screenCart.clickXButtonTopItem();
    }

    @And("Pop up with success fail count should be displayed in case if any ticket fails")
    public void popUpWithSuccessFailCountShouldBeDisplayedInCaseIfAnyTicketFails() {
//        screenCart.verifyFailCount();
    }

    @And("Verify that {string} tickets are flushed")
    public void verifyThatTicketsAreFlushed(String gameName) {
        throw new SkipStepException("Requires Manual Verification after 24 hours");
    }

    @And("Click PAY FROM MY WALLET")
    public void clickPAYFROMMYWALLET() {
        screenCart.clickPayFromWallet();
    }

    @And("Click PAY NOW")
    public void clickPAYNOW() {
        screenCart.clickPayNow();
    }

    @And("Verify played numbers on receipt")
    public void verifyPlayedNumbersOnReceipt() {
        screenCart.verifyPlayedNumbers();
    }

    @And("Player verifies Receipt")
    public void playerVerifiesReceipt() {
        screenCart.verifyReceipt();
    }
}
