package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;
import steps.LoginStepsDef;
import utility.Hooks;

import java.util.List;

public class LoginScreen extends LoginStepsDef {

    AppiumDriver driver;

    public LoginScreen(AppiumDriver driver) throws Exception {
        super();
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void login(String username, String pw) throws InterruptedException {
        List<MobileElement> userField =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.widget.EditText");
        userField.get(0).sendKeys(username);
        List<MobileElement> pwField =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View/android.widget.EditText");
        pwField.get(0).sendKeys(pw);
        Thread.sleep(3000);
    }

    public void pressLogIn(){
        List<MobileElement> btnLogIn =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button");
        btnLogIn.get(0).click();
    }

    public boolean verifyCorrectLogInScreen() {
        List<MobileElement> els4 =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button");
        if(els4.get(0).isDisplayed()){
            System.out.println("Login Button is displayed, correct screen");
        }
        return els4.get(0).isDisplayed();
    }

    public void pressAgree() throws InterruptedException {
        List<MobileElement> btnAgree = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.widget.Button[2]");
        btnAgree.get(0).click();
        Thread.sleep(9000);
    }

}
