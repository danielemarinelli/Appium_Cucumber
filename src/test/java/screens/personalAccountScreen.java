package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;
import steps.LoginStepsDef;
import utility.Hooks;

import java.util.List;

public class personalAccountScreen extends LoginStepsDef {

    AppiumDriver driver;

    public personalAccountScreen(AppiumDriver driver) throws Exception {
        super();
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver,this);
    }


    public void verifyCartButton() {
        System.out.println("Click on cart button");
        List<MobileElement> els5 = driver.findElementsByXPath("//android.view.View[@content-desc=\"2\"]/android.widget.Button");
        els5.get(0).click();
    }

    public void addProduct() throws InterruptedException {
        List<MobileElement> els6 = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.widget.Button[2]");
        els6.get(0).click();
        Thread.sleep(2000);
    }

    public void verifyCalculate() {
        System.out.println("Click on CALCULATE button");
        List<MobileElement> els7 = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.widget.Button[1]");
        els7.get(0).click();
        System.out.println();
    }


}
