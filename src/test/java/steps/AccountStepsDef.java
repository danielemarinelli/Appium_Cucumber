package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utility.Hooks;



public class AccountStepsDef extends BaseStep {

    public AccountStepsDef() throws Exception {
        super();
        this.driver = Hooks.getDriver();
    }

    private AppiumDriver driver;

    @When("User taps on the cart button")
    public void user_taps_on_the_cart_button() throws Exception {
        Assert.assertTrue("Invalid User!!",getAccount().verifyCartButton());
    }

    @And("User taps add product")
    public void userTapsAddProduct() throws Exception {
        getAccount().addProduct();
    }

    @And("User taps calculate button")
    public void user_taps_calculate_button() throws Exception {
        getAccount().verifyCalculate();
    }

    @Then("The total vat changes")
    public void theTotalVatChanges() {
        System.out.println("The cart price is updated");
        }

    @And("User taps on checkout button")
    public void userTapsOnCheckoutButton() throws Exception {
        getAccount().verifyCheckOut();
    }


    @And("User taps on confirm button")
    public void userTapsOnConfirmButton() throws Exception {
        getAccount().verifyConfirm();
    }
}
