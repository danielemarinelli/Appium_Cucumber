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
        List<MobileElement> els1 =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[3]/android.view.View/android.widget.EditText");
        els1.get(0).sendKeys(username);
        List<MobileElement> els3 =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[4]/android.view.View/android.widget.EditText");
        els3.get(0).sendKeys(pw);
        Thread.sleep(3000);
    }

    public void pressLogIn(){
        List<MobileElement> els4 =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button");
        els4.get(0).click();
        System.out.println();
    }

    public boolean verifyCorrectLogInScreen() {
        List<MobileElement> els4 =  driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.widget.Button");
        if(els4.get(0).isDisplayed()){
            System.out.println("Login Button is displayed, correct screen");
        }
        return els4.get(0).isDisplayed();
    }

    public void pressAgree() throws InterruptedException {
        List<MobileElement> els6 = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.widget.Button[2]");
        els6.get(0).click();
        Thread.sleep(9000);
        System.out.println();
    }

}
