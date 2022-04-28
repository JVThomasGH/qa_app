package qa.ithuba.step_definitions.steps_popups;

import qa.ithuba.globals.World;
import io.cucumber.java.en.Then;
import qa.ithuba.screens.screen_popups.ScreenPopUps;
import qa.ithuba.utilities.HelperUtil;

public class StepsPopUps extends HelperUtil {

    public World world;
    ScreenPopUps screenPopUps;


    @Then("Verify Pop Up {string} Close PopUp? {string}")
    public void alertMessageShouldBeDisplayed(String popUsMessage, String flag) {
        SLEEP(1000);

        switch (popUsMessage) {
            case "Ticket Deleted Successfully" -> {
                screenPopUps.confirmPopUpSavedTicketDeleted();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
            case "Success Voucher" -> {
                screenPopUps.confirmPopUpSuccessVoucher();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
            case "ATM withdrawals not available" -> {
                screenPopUps.confirmPopUpNoAtm();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }


            case "Price is greater than R2000" -> {
                screenPopUps.priceIsGreaterThan2k();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }

            case "Price is greater than R2,000.00" -> {
                screenPopUps.priceIsGreaterThan2kSS4();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }

            case "Price is greater than R2000.00" -> {
                screenPopUps.priceIsGreaterThan2kSS8();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
            case "Please select any 5 numbers" -> {
                screenPopUps.popUpPleaseSelectAny5Numbers();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
            case "Please select any 6 numbers" -> {
                screenPopUps.popUpPleaseSelectAny6Numbers();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
            case "Please select any 5 numbers and 1 powerball" -> {
                screenPopUps.popUpPleaseSelectAny5NumbersAndOnePowerBall();
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
            default -> {
                screenPopUps.confirmPopUp(popUsMessage);
                if (flag.equalsIgnoreCase("Yes")) {
                    screenPopUps.close();
                }
            }
        }

//        switch (popUsMessage) {
//
//            case "Your saved ticket is deleted. If required, please save it again." -> {
//                screenPopUps.popUpSaveTicketDeleted();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//
//            case "Ticket Saved Successfully" -> {
//                screenPopUps.popUpTicketSaved();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//
//            case "Please select any 6 numbers" -> {
//                screenPopUps.popUpPleaseSelectAny6Numbers();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//            case "Please select any 5 numbers and 1 powerball" -> {
//                screenPopUps.popUpPleaseSelectAny5NumbersAndOnePowerBall();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }

//            case "Board Max Reached" -> {
//                screenPopUps.popUpBoardMaxReached();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//
//            case "You have successfully added ticket to your cart." -> {
//                screenPopUps.successAddToCart();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//
//            case "Please select at least one result from each row" -> {
//                screenPopUps.selectMoreRows();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }

//
//            case "Amount should be in between R1.00 to R10,000.00" -> {
//                screenPopUps.amountShouldBeBetween1_10k();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//
//            case "Success Voucher" -> {
//                screenPopUps.confirmPopUpSuccessVoucher();
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }
//
//            case "Invalid Voucher PIN" -> {
//                screenPopUps.confirmPopUp(popUsMessage);
//                if (flag.equalsIgnoreCase("Yes")) {
//                    screenPopUps.close();
//                }
//            }

//            default -> throw new IllegalStateException("Unexpected value: " + popUsMessage);
//        }
    }

}
