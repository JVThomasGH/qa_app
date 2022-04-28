package qa.ithuba.screens.screen_wallet;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.SkipStepException;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import qa.ithuba.screens.screen_base.ScreenBase;
import qa.ithuba.utilities.HelperUtil;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ScreenWallet extends HelperUtil {

    ScreenBase screenBase;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'MY WALLET' or . = 'MY WALLET') and @resource-id = 'com.nationallottery.ithuba:id/txt_my_wallet']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingWallet;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TOP UP' or . = 'TOP UP') and @resource-id = 'com.nationallottery.ithuba:id/txt_top_up']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingTopUp;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TOP UP' or . = 'TOP UP') and @resource-id = 'com.nationallottery.ithuba:id/tab_topup']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonTopUp;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TRANSACTION HISTORY' or . = 'TRANSACTION HISTORY') and @resource-id = 'com.nationallottery.ithuba:id/tab_transaction_history']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonTransactionHistory;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'WITHDRAWALS' or . = 'WITHDRAWALS') and @resource-id = 'com.nationallottery.ithuba:id/tab_withdrawals']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonWithdrawals;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'DEPOSIT' or . = 'DEPOSIT') and @resource-id = 'com.nationallottery.ithuba:id/b_submit']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonDeposit;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select your Payment Method' or . = 'Select your Payment Method') and @resource-id = 'android:id/text1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dropDownPaymentMethod;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Bank Card' or . = 'Bank Card') and @resource-id = 'android:id/text1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionBankCard;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Instant EFT' or . = 'Instant EFT') and @resource-id = 'android:id/text1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionInstantEFT;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Voucher' or . = 'Voucher') and @resource-id = 'android:id/text1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionVoucher;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select Voucher Provider' or . = 'Select Voucher Provider') and @resource-id = 'android:id/text1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade selectVoucherProvider;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '1Voucher' or . = '1Voucher') and @resource-id = 'android:id/text1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade option1Voucher;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Enter code*' or . = 'Enter code*') and @resource-id = 'com.nationallottery.ithuba:id/et_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputVoucherNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'CREDIT WALLET' or . = 'CREDIT WALLET') and @resource-id = 'com.nationallottery.ithuba:id/b_submit']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCreditWallet;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Enter Deposit Amount' or . = 'Enter Deposit Amount') and @resource-id = 'com.nationallottery.ithuba:id/et_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputDepositAmount;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Enter Withdrawal Amount' or . = 'Enter Withdrawal Amount') and @resource-id = 'com.nationallottery.ithuba:id/et_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputWithdrawalAmount;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = ' Payment Details:' or . = ' Payment Details:')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelPaymentDetails;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[5]/android.view.View[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelMerchant;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[9]/android.view.View[2]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelMerchantOrder;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[12]/android.view.View[2]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelAmount;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and @resource-id = 'name' and (@text = '' or . = '')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputNameOnCard;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and @resource-id = 'cardNumber' and (@text = '' or . = '')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputCardNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Spinner' and (@text = 'MM' or . = 'MM') and @resource-id = 'expiryMonth']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputSpinnerMonth;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Spinner' and (@text = 'YYYY' or . = 'YYYY') and @resource-id = 'expiryYear']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputSpinnerYear;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Spinner' and @resource-id = 'budgetPeriod']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade spinnerBudgetPeriod;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Image' and (@text = 'FNB' or . = 'FNB')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade logoFNB;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.RadioButton' and (@text = 'Straight' or . = 'Straight') and @resource-id = 'budget1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade rButtonStraight;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.RadioButton' and (@text = 'Budget' or . = 'Budget') and @resource-id = 'budget2']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade rButtonBudget;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Spinner' and @resource-id = 'budgetPeriod']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputSpinnerBudget;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and @resource-id = 'securityCode' and (@text = '' or . = '')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade inputSecurityCode;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Pay now' or . = 'Pay now') and @resource-id = 'pay']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonPayNow;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Top up unsuccessful:' or . = 'Top up unsuccessful:') and @resource-id = 'com.nationallottery.ithuba:id/lbl_top_up_unsuccess']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelUnsuccessfulTxn;

    @AndroidFindBy(xpath = "//*[@class = 'android.view.View' and (@text = 'Cancel' or . = 'Cancel') and @resource-id = 'lnkCancel1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCancel;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Cancel' or . = 'Cancel') and @resource-id = 'com.nationallottery.ithuba:id/b_cancel']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCancelNewBank;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SUBMIT' or . = 'SUBMIT') and @resource-id = 'com.nationallottery.ithuba:id/b_submit']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSubmitNewBank;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Top up unsuccessful:' or . = 'Top up unsuccessful:') and @resource-id = 'com.nationallottery.ithuba:id/lbl_top_up_unsuccess']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTopUpUnsuccessful;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/balance_value']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade walletBalance;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.RadioButton' and (@text = '' or . = '')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade radioButtonIPay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'Continue' or . = 'Continue')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonContinueIPay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Cancel' or . = 'Cancel')]]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonCancelIPay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'TEST SUCCESSFUL RESPONSE' or . = 'TEST SUCCESSFUL RESPONSE')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSuccessIPay;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Top up successful:' or . = 'Top up successful:') and @resource-id = 'com.nationallottery.ithuba:id/lbl_top_up_success']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelSuccessTopUp;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select your Withdrawal Method' or . = 'Select your Withdrawal Method') and @resource-id = 'android:id/text1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade selectWithdrawalMethod;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select Banking Profile' or . = 'Select Banking Profile') and @resource-id = 'android:id/text1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade selectBankingProfile;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Direct Transfer' or . = 'Direct Transfer') and @resource-id = 'android:id/text1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionDirectTransfer;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Add New Banking Profile' or . = 'Add New Banking Profile') and @resource-id = 'android:id/text1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionAddNewBankingProfile;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '51103687942' or . = '51103687942') and @resource-id = 'android:id/text1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionSelect51103687942;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ATM Withdrawal' or . = 'ATM Withdrawal') and @resource-id = 'android:id/text1']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade optionATMWithdrawal;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'ADD A NEW BANKING PROFILE' or . = 'ADD A NEW BANKING PROFILE')]")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingAddNewBankingProfile;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'First Name *' or . = 'First Name *') and @resource-id = 'com.nationallottery.ithuba:id/edit_fname']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankFirstName;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Last Name *' or . = 'Last Name *') and @resource-id = 'com.nationallottery.ithuba:id/edit_lname']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankLastName;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select Name of Bank' or . = 'Select Name of Bank') and @resource-id = 'com.nationallottery.ithuba:id/tv_spinner_item_form']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankSelectBankName;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Please select Bank Name.' or . = 'Please select Bank Name.') and @resource-id = 'com.nationallottery.ithuba:id/tv_spinner_item_form']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankBankNameError;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Select' or . = 'Select') and @resource-id = 'com.nationallottery.ithuba:id/tv_spinner_item_form']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankSelectAccountType;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Please select Account Type.' or . = 'Please select Account Type.') and @resource-id = 'com.nationallottery.ithuba:id/tv_spinner_item_form']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankAccountTypeError;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Branch Code*' or . = 'Branch Code*') and @resource-id = 'com.nationallottery.ithuba:id/et_branch_name']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankSelectBranchCode;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Please enter Branch Code.' or . = 'Please enter Branch Code.') and @resource-id = 'com.nationallottery.ithuba:id/et_branch_name']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankBranchCodeError;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Account Number*' or . = 'Account Number*') and @resource-id = 'com.nationallottery.ithuba:id/et_account_number']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankSelectAccountNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Please enter Account Number.' or . = 'Please enter Account Number.') and @resource-id = 'com.nationallottery.ithuba:id/et_account_number']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade newBankAccountNumberError;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'Direct Transfer Successful:' or . = 'Direct Transfer Successful:') and @resource-id = 'com.nationallottery.ithuba:id/withdrawal_successful']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelSuccessDirectTransfer;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'TRANSACTION HISTORY' or . = 'TRANSACTION HISTORY') and @resource-id = 'com.nationallottery.ithuba:id/txt_my_wallet']")
    //    @iOSXCUITFindBy (id = "")
    private WebElementFacade headingTH;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/transaction_type']")
    //    @iOSXCUITFindBy (id = "")
    private List<WebElementFacade> itemsTransactionHistory;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_from_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateStart;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_to_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateEnd;


    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'SEARCH' or . = 'SEARCH') and @resource-id = 'com.nationallottery.ithuba:id/btn_historical_results_search']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSearchDates;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'SEARCH' or . = 'SEARCH') and @resource-id = 'com.nationallottery.ithuba:id/b_search']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonSearchTHDates;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'android:id/date_picker_header_year']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade datePickerYear;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'OK' or . = 'OK') and @resource-id = 'android:id/button1']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateOK;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.Button' and (@text = 'CANCEL' or . = 'CANCEL') and @resource-id = 'android:id/button2']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade dateCancel;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'android:id/prev' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade monthPrevious;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.ImageButton' and @resource-id = 'android:id/next' and (@text = '' or . = '')]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade monthNext;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/transaction_closing_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelLedgerBalance;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'No transaction details found for selected date range.' or . = 'No transaction details found for selected date range.') and @resource-id = 'com.nationallottery.ithuba:id/no_transactions']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelNoTxnInHistory;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/transaction_type']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHItemName;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[2]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHItemAmount;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.TextView[3]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHItemDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/transaction_closing_amount']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade labelTHItemClosingBalance;


    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade buttonViewTicketDetails;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_tansaction_details_game_name']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewGameName;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_purchase_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewTxnTypeDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_serial_number']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewSerialNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_draw_number']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewDrawNumber;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_draw_date']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewDrawDate;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_ticket_cost']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewDrawAmount;

    @AndroidFindBy(xpath = "//*[@class = 'android.widget.TextView' and @resource-id = 'com.nationallottery.ithuba:id/tv_draw_duration']")
//    @iOSXCUITFindBy (id = "")
    private WebElementFacade viewDrawDuration;


    public void clickTopUpButton() {
        clickOn(buttonTopUp);
    }

    public void clickWithdrawalsButton() {
        clickOn(buttonWithdrawals);
    }

    public void clickTransactionHistory() {
        clickOn(buttonTransactionHistory);
    }

    public void verifyDepositButton() {
        Assert.assertEquals("DEPOSIT", buttonDeposit.getText());
    }

    public void verifyIfOnWalletScreen(String screenName) {
        Assert.assertEquals("MY WALLET", headingWallet.getText());
    }

    public void verifyIfOnTopUpScreen(String screenName) {
        Assert.assertEquals(screenName, headingTopUp.getText());
    }

    public void clickDropDownPaymentMethod(String option) {
        clickOn(dropDownPaymentMethod);
        switch (option) {
            case "Bank Card" -> clickOn(optionBankCard);
            case "Instant EFT" -> clickOn(optionInstantEFT);
            case "Voucher" -> clickOn(optionVoucher);
            default -> throw new IllegalArgumentException(option);
        }
    }

    public void enterDepositAmount(String amount) {
        typeInto(inputDepositAmount, amount);
    }

    public void enterWithdrawalAmount(String amount) {
        typeInto(inputWithdrawalAmount, amount);
    }

    public void clickDepositButton() {
        clickOn(buttonDeposit);
    }

    public void verifyOnFNBPage() {
        Assert.assertTrue(logoFNB.isDisplayed());
    }

    public void enterMonth(String month) {
        clickOn(inputSpinnerMonth);
        SLEEP(700);
        switch (month) {
            case "09", "10", "11", "12" -> {
                swipeUp(1);
                clickOn($("//*[@class = 'android.widget.CheckedTextView' and (@text = '" + month + "' or . = '" + month + "') and @resource-id = 'android:id/text1']"));
            }
            default -> clickOn($("//*[@class = 'android.widget.CheckedTextView' and (@text = '" + month + "' or . = '" + month + "') and @resource-id = 'android:id/text1']"));
        }
    }

    public void enterYear(String year) {
        clickOn(inputSpinnerYear);
        SLEEP(700);
        clickOn($("//*[@class = 'android.widget.CheckedTextView' and (@text = '" + year + "' or . = '" + year + "') and @resource-id = 'android:id/text1']"));
    }

    public void enterBudgetPeriod(String budget_period) {
        clickOn(rButtonBudget);
        swipeUp(1);
        clickOn(inputSpinnerBudget);
        SLEEP(700);
        clickOn($("//*[@class = 'android.widget.CheckedTextView' and (@text = '" + budget_period + "' or . = '" + budget_period + "') and @resource-id = 'android:id/text1']"));
    }

    String card_number_invalid = "5412345678912345";

    String card_number = "5413330089020011";
    String name_on_card = "Mr J Card";
    String expiry_month = "12";
    String expiry_year = "2022";
    String budget_period = "6";
    String security_code = "123";

    public void captureFNBTransaction() {
        logger("Merchant Description: " + labelMerchant.getText());
        logger("Merchant Order Number: " + labelMerchantOrder.getText());
        logger("Amount: " + labelAmount.getText());
        typeInto(inputNameOnCard, name_on_card);
        typeInto(inputCardNumber, card_number);
        enterMonth(expiry_month);
        enterYear(expiry_year);
        swipeUp(1);
        enterBudgetPeriod(budget_period);
        typeInto(inputSecurityCode, security_code);
        clickOn(buttonPayNow);
        SLEEP(15000);
        if (labelUnsuccessfulTxn.isDisplayed()) {
            screenBase.clickBackArrow();
            SLEEP(500);
            screenBase.clickBackArrow();
            SLEEP(500);
            throw new SkipStepException("TOP UP NOT SUCCESSFUL");
        }
    }

    public void captureFailedFNBTransaction() {
        logger("Merchant Description: " + labelMerchant.getText());
        logger("Merchant Order Number: " + labelMerchantOrder.getText());
        logger("Amount: " + labelAmount);
        typeInto(inputNameOnCard, name_on_card);
        typeInto(inputCardNumber, card_number_invalid);
        enterMonth(expiry_month);
        enterYear(expiry_year);
        swipeUp(1);
        enterBudgetPeriod(budget_period);
        typeInto(inputSecurityCode, security_code);
        clickOn(buttonPayNow);
        SLEEP(10000);

    }

    public void verifyFailedFNB() {
        SLEEP(5000);
        Assert.assertTrue(labelTopUpUnsuccessful.isDisplayed());
    }

    public String noteWalletBalance() {
        String balance = walletBalance.getText();
        logger("WALLET BALANCE IS: " + balance);
        return balance;
    }

    public void verifySuccessTopUp() {
        Assert.assertEquals("Top up successful:", labelSuccessTopUp.getText());
    }

    public void clickiPayRadioButton() {
        clickOn(radioButtonIPay);
    }

    public void clickContinueButton() {
        clickOn(buttonContinueIPay);
    }

    public void completePayU() {
        waitFor(buttonSuccessIPay);
        clickOn(buttonSuccessIPay);
        SLEEP(10000);
        waitFor(labelSuccessTopUp);
        Assert.assertTrue(labelSuccessTopUp.isDisplayed());
    }

    public void selectVoucher(String option) {
        clickOn(selectVoucherProvider);
        clickOn(option1Voucher);
    }

    public void enterVoucher(String voucherNumber) {
        typeInto(inputVoucherNumber, voucherNumber);
    }

    public void clickCreditWallet() {
        clickOn(buttonCreditWallet);
    }

    public void clickSelectWithdrawalMethod(String option) {
        clickOn(selectWithdrawalMethod);
        SLEEP(500);
        switch (option) {
            case "Direct Transfer" -> clickOn(optionDirectTransfer);
            case "ATM Withdrawal" -> clickOn(optionATMWithdrawal);
            default -> throw new IllegalArgumentException(option);
        }
    }

    public void clickSelectBankingProfile(String option) {
        clickOn(selectBankingProfile);
        switch (option) {
            case "Add New Banking Profile" -> clickOn(optionAddNewBankingProfile);
            default -> clickOn($("//*[@class = 'android.widget.TextView' and (@text = '" + option + "' or . = '" + option + "') and @resource-id = 'android:id/text1']"));
        }
    }

    public void verifyIfOnPage() {
        Assert.assertEquals("ADD A NEW BANKING PROFILE", headingAddNewBankingProfile.getText());

    }

    public void verifyNewBankFields(String fieldText) {
        switch (fieldText) {
            case "Please select Bank Name." -> {
                Assert.assertEquals(fieldText, newBankBankNameError.getText());
                logger("FIELD RETURNED: " + newBankBankNameError.getText());
            }
            case "Please select Account Type." -> {
                Assert.assertEquals(fieldText, newBankAccountTypeError.getText());
                logger("FIELD RETURNED: " + newBankAccountTypeError.getText());
            }
            case "Please enter Branch Code." -> {
                Assert.assertEquals(fieldText, newBankBranchCodeError.getText());
                logger("FIELD RETURNED: " + newBankBranchCodeError.getText());
            }
            case "Please enter Account Number." -> {
                Assert.assertEquals(fieldText, newBankAccountNumberError.getText());
                logger("FIELD RETURNED: " + newBankAccountNumberError.getText());
            }
        }
    }

    public void confirmSuccessDirectTransfer() {
        Assert.assertEquals("Direct Transfer Successful:", labelSuccessDirectTransfer.getText());
    }

    public void verifyScreenTH(String screenName) {
        Assert.assertEquals(screenName, headingTH.getText());

    }

    int clicks;

    public void enterStartDate(String day, String month, String year) {
        int monthInt = Integer.parseInt(month);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month_ = cal.get(Calendar.MONTH);
        int actual_month = month_ + 1;
        clickOn(dateStart);
        clickOn(datePickerYear);
        clickOn($("//*[@class = 'android.widget.TextView' and (@text = '" + year + "' or . = '" + year + "') and @resource-id = 'android:id/text1']"));
        if (monthInt > actual_month) {
            clicks = monthInt - actual_month;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthNext);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else if (monthInt < actual_month) {
            clicks = actual_month - monthInt;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthPrevious);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else {
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        }
    }

    public void enterEndDate(String day, String month, String year) {
        int monthInt = Integer.parseInt(month);
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month_ = cal.get(Calendar.MONTH);
        int actual_month = month_ + 1;
        clickOn(dateEnd);
        clickOn(datePickerYear);
        clickOn($("//*[@class = 'android.widget.TextView' and (@text = '" + year + "' or . = '" + year + "') and @resource-id = 'android:id/text1']"));
        if (monthInt > actual_month) {
            clicks = monthInt - actual_month;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthNext);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else if (monthInt < actual_month) {
            clicks = actual_month - monthInt;
            for (int i = 0; i < clicks; i++) {
                clickOn(monthPrevious);
            }
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        } else {
            clickOn($("//*[@class = 'android.view.View' and (@text = '" + day + "' or . = '" + day + "')]"));
            clickOn(dateOK);
        }
    }

    public void clickSearchHistory() {
        clickOn(buttonSearchTHDates);
    }

    public void verifyBalanceInLedgerEntries() {
        Assert.assertTrue(labelLedgerBalance.isDisplayed());
        logger("BALANCE IN LEDGER ENTRIES: " + labelLedgerBalance.getText());
    }

    public void verifyBalancesWalletAndLedger(String wallet) {
        String trimmed = labelLedgerBalance.getText().replace("Closing Balance: ", "");
        Assert.assertEquals(wallet, trimmed);
        logger("WALLET BALANCE: " + wallet);
        logger("LEDGER BALANCE: " + trimmed);
    }

    public void verifyNoTransactionHistoryMessage() {
        Assert.assertEquals("No transaction details found for selected date range.", labelNoTxnInHistory.getText());
    }

    public void scrollTransactionHistoryPage() {
        swipeUp(4);
    }

    public void verifyInformationTransactionHistory() {
        logger("TRANSACTION HISTORY - ITEM NAME: " + labelTHItemName.getText());
        logger("TRANSACTION HISTORY - ITEM AMOUNT: " + labelTHItemAmount.getText());
        logger("TRANSACTION HISTORY - ITEM DATE: " + labelTHItemDate.getText());
        logger("TRANSACTION HISTORY - CLOSING BALANCE: " + labelTHItemClosingBalance.getText());
    }

    public void verifyTicketDetails() {
        clickOn(buttonViewTicketDetails);
        logger("VIEW - GAME NAME: " + viewGameName.getText());
        logger("VIEW - TRANSACTION TYPE AND DATE: " + viewTxnTypeDate.getText());
        logger("VIEW - SERIAL NUMBER: " + viewSerialNumber.getText());
        logger("VIEW - DRAW NUMBER: " + viewDrawNumber.getText());
        logger("VIEW - DRAW DATE: " + viewDrawDate.getText());
        logger("VIEW - DRAW AMOUNT: " + viewDrawAmount.getText());
        logger("VIEW - DRAW DURATION: " + viewDrawDuration.getText());
    }
}
