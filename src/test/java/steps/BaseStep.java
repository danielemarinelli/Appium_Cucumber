package steps;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import screens.LoginScreen;
import screens.personalAccountScreen;


public class BaseStep {

    AppiumDriver driver;

    public BaseStep() throws Exception { }

    public LoginScreen getLogin() throws Exception {
        return new LoginScreen(driver);
    }

    public personalAccountScreen getAccount() throws Exception {
        return new personalAccountScreen(driver);
    }



}
