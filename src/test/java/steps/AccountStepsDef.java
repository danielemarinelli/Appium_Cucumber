package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hooks;



public class AccountStepsDef extends BaseStep {

    public AccountStepsDef() throws Exception {
        super();
        this.driver = Hooks.getDriver();
    }

    private AppiumDriver driver;

    @When("User clicks on the cart button")
    public void user_clicks_on_the_cart_button() throws Exception {
        getAccount().verifyCartButton();
    }

    @And("User clicks add product")
    public void userClicksAddProduct() throws Exception {
        getAccount().addProduct();
    }

    @And("User clicks calculate button")
    public void user_clicks_calculate_button() throws Exception {
        getAccount().verifyCalculate();
    }

    @Then("The total vat changes")
    public void theTotalVatChanges() {

        }

}
