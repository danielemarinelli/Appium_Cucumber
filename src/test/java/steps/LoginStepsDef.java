package steps;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.Hooks;

import java.util.List;

public class LoginStepsDef extends BaseStep{

    public LoginStepsDef() throws Exception {
        super();
        this.driver = Hooks.getDriver();
    }

    private AppiumDriver driver;

    @Given("User opens pocket shop app")
    public void user_opens_pocket_shop_app() throws Exception {
        System.out.println("Given step");
        Assert.assertTrue("Screen is not correct",getLogin().verifyCorrectLogInScreen());
        System.out.println();
    }

    @When("^User inserts user (.*?) and password (.*?)$")
    public void user_inserts_user_and_password(String username, String pw) throws Exception {
        System.out.println("When step");
        getLogin().login(username, pw);
        System.out.println();

    }
    @Then("User navigates in the personal account")
    public void user_navigates_in_the_personal_account() {
        System.out.println("Then step");
    }

    @And("User clicks on button login")
    public void userClicksOnButtonLogin() throws Exception { getLogin().pressLogIn();    }

    @And("User clicks on agree button")
    public void userClicksOnAgreeButton() throws Exception {
        getLogin().pressAgree();
    }


}
