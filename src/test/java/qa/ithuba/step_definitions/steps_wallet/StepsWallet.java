package qa.ithuba.step_definitions.steps_wallet;

import qa.ithuba.globals.World;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.core.SkipStepException;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.screens.screen_wallet.ScreenWallet;
import qa.ithuba.utilities.HelperUtil;

import java.math.BigInteger;

public class StepsWallet extends HelperUtil {

    ScreenWallet screenWallet;
    ScreenBase screenBase;
    World world;

    @And("Player clicks {string} button")
    public void playerClicksWITHDRAWALSButton(String option) {
        switch (option) {
            case "TOP UP" -> screenWallet.clickTopUpButton();
            case "WITHDRAWALS" -> screenWallet.clickWithdrawalsButton();
            case "TRANSACTION HISTORY" -> screenWallet.clickTransactionHistory();
            default -> throw new IllegalArgumentException(option);
        }


    }

    @And("Check whether Pay Via Payu button is changed to DEPOSIT button")
    public void checkWhetherButtonIsChangedToButton() {
        screenWallet.verifyDepositButton();
    }

    @And("For Payment Method select {string}")
    public void forPaymentMethodSelectBankCard(String option) {
        screenWallet.clickDropDownPaymentMethod(option);
    }

    @And("Enter Deposit Amount {string}")
    public void enterDepositAmount(String amount) {
        world.depositAmount = amount;
        screenWallet.enterDepositAmount(amount);
    }

    @And("Enter Withdrawal Amount {string}")
    public void enterWithdrawalAmount(String amount) {
        world.withdrawalAmount = amount;
        screenWallet.enterWithdrawalAmount(amount);
    }

    @And("Click DEPOSIT button")
    public void clickDEPOSITButton() {
        screenWallet.clickDepositButton();
    }

    @And("User should be redirected to FNB interface for deposit")
    public void userShouldBeRedirectedToFNBInterfaceForDeposit() {
        screenWallet.verifyOnFNBPage();
    }

    @And("Player captures a successful FNB transaction")
    public void playerCapturesASuccessfulFNBTransaction() {
        screenWallet.captureFNBTransaction();
    }

    @And("Player captures an unsuccessful FNB transaction")
    public void playerCapturesUnsuccessfulSuccessfulFNBTransaction() {
        screenWallet.captureFailedFNBTransaction();
    }

    @Then("Player should get a Decline confirmation once the FNB system confirms the payment has been failed")
    public void playerShouldGetADeclineConfirmationOnceTheFNBSystemConfirmsThePaymentHasBeenFailed() {
        screenWallet.verifyFailedFNB();
    }

    @And("Player notes Before Wallet balance")
    public void playerNotesBeforeWalletBalance() {
        world.beforeBalance = screenWallet.noteWalletBalance();
    }

    @And("Player notes After Wallet balance")
    public void playerNotesAfterWalletBalance() {
        world.afterBalance = screenWallet.noteWalletBalance();
    }

    @And("Compare Before with After Wallet Balance")
    public void compareBeforeWithAfterWalletBalance() {
        String bBalance = world.beforeBalance.replace("R", "").replace(",", "").replace(".", "");
        String aBalance = world.afterBalance.replace("R", "").replace(",", "").replace(".", "");
        String depositAmount = world.depositAmount;

        System.out.println(bBalance);
        System.out.println(aBalance);

        int int_bBalance = Integer.parseInt(bBalance);
        int int_aBalance = Integer.parseInt(aBalance);
        int int_depositAmount = Integer.parseInt(depositAmount);

        System.out.println(int_bBalance);
        System.out.println(int_aBalance);
        System.out.println(int_depositAmount);

    }

    @And("Compare Before with After Wallet Balance with a Voucher")
    public void compareBeforeWithAfterWalletBalanceVoucher() {
        String bBalance = world.beforeBalance.replace("R", "").replace(",", "").replace(".", "");
        String aBalance = world.afterBalance.replace("R", "").replace(",", "").replace(".", "");

        BigInteger bigIntbBalance = new BigInteger(bBalance);
        BigInteger bigIntaBalance = new BigInteger(aBalance);

        System.out.println(bigIntbBalance);
        System.out.println(bigIntaBalance);
        logger("WALLET DIFFERENCE AFTER VOUCHER TOP UP  (without decimal for cents) : " + (bigIntaBalance.subtract(bigIntbBalance)));
    }

    @And("Verify Top Up Success Message")
    public void verifyTopUpSuccessMessage() {
        screenWallet.verifySuccessTopUp();
    }

    @And("Player clicks iPay radio button")
    public void playerClicksIPayRadioButton() {
        screenWallet.clickiPayRadioButton();
    }

    @And("Player clicks CONTINUE button")
    public void playerClicksCONTINUEButton() {
        screenWallet.clickContinueButton();
    }

    @And("Complete the PayU payment")
    public void completeThePayUPayment() {
        screenWallet.completePayU();
    }

    @And("For Voucher Provider select {string}")
    public void forVoucherProviderSelect(String option) {
        screenWallet.selectVoucher(option);
    }

    @And("Enter Voucher Number {string}")
    public void enterVoucherNumber(String voucherNumber) {
        screenWallet.enterVoucher(voucherNumber);
    }

    @And("Click CREDIT WALLET")
    public void clickCREDITWALLET() {
        screenWallet.clickCreditWallet();
    }

    @And("For Withdrawal Method select {string}")
    public void forWithdrawalMethodSelect(String option) {
        screenWallet.clickSelectWithdrawalMethod(option);
    }

    @And("For Banking Profile select {string}")
    public void forBankingProfileSelect(String option) {
        screenWallet.clickSelectBankingProfile(option);
    }

    @Then("Player should be on New Banking Profile page")
    public void shouldBeOnNewBankingProfile() {
        screenWallet.verifyIfOnPage();
    }

    @And("Verify {string} cannot be left blank and field returns {string}")
    public void verifyFieldCannotBeLeftBlank(String field, String fieldText) {
        screenWallet.verifyNewBankFields(fieldText);
    }

    @And("Click ALLOW APP PERMISSIONS")
    public void clickALLOWAPPPERMISSIONS() {
        screenBase.clickAllowButton();
    }

    @And("Confirmation message should open up")
    public void confirmationMessageShouldOpenUp() {
        screenWallet.confirmSuccessDirectTransfer();
    }

    @And("Enter the Transaction History Start Date - d m yyyy {string} {string} {string}")
    public void enterTheStartDate(String day, String month, String year) {
        screenWallet.enterStartDate(day, month, year);
    }

    @And("Enter the Transaction History End Date - d m yyyy {string} {string} {string}")
    public void enterTheEndDate(String day, String month, String year) {
        screenWallet.enterEndDate(day, month, year);
    }

    @And("Click SEARCH Transaction History")
    public void clickSEARCHTransactionHistory() {
        screenWallet.clickSearchHistory();
    }

    @And("Player balance should be displayed with ledger entries")
    public void playerBalanceShouldBeDisplayedWithLedgerEntries() {
        screenWallet.verifyBalanceInLedgerEntries();
    }

    @And("Displayed ledger entries with closing balance should be correct")
    public void displayedLedgerEntriesWithClosingBalanceShouldBeCorrect() {
        String wallet = world.beforeBalance;
        screenWallet.verifyBalancesWalletAndLedger(wallet);
    }

    @And("Message should display - No transaction details found for selected date range")
    public void messageShouldDisplayNoTransactionDetailsFoundForSelectedDateRange() {
        screenWallet.verifyNoTransactionHistoryMessage();
    }

    @And("Navigate BACK on Mobile device")
    public void navigateBACKOnMobileDevice() {
        screenBase.navigateBackOnDevice();
    }

    @And("Player should be able to scroll down to see wagers and winnings")
    public void playerShouldBeAbleToScrollDownToSeeWagersAndWinnings() {
        screenWallet.scrollTransactionHistoryPage();
    }

    @And("Check the Information of the transaction history for the game")
    public void checkTheInformationOfTheTransactionHistoryForTheGame() {
        screenWallet.verifyInformationTransactionHistory();
    }

    @And("Verify the ticket details is displayed for each winning ticket")
    public void verifyTheTicketDetailsIsDisplayedForEachWinningTicket() {
        screenWallet.verifyTicketDetails();
    }

    @And("Verify that the Eaziwin Ticket Details option is available in the drop down before the Search button")
    public void verifyThatTheEaziwinTicketDetailsOptionIsAvailableInTheDropDownBeforeTheSearchButton() {
        throw new SkipStepException("OPTION NOT AVAILABLE ON MOBILE APP");
    }

    @And("Verify whether the user is able to select Eaziwin Ticket Details option from drop down of Transaction history")
    public void verifyWhetherTheUserIsAbleToSelectEaziwinTicketDetailsOptionFromDropDownOfTransactionHistory() {
        throw new SkipStepException("OPTION NOT AVAILABLE ON MOBILE APP");
    }
}
