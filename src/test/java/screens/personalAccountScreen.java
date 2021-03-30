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


    public boolean verifyCartButton() {
            System.out.println("Click on cart button");
            List<MobileElement> cartButton = driver.findElementsByXPath("//android.view.View[@content-desc=\"3\"]/android.widget.Button");
            //cartButton.get(0).isDisplayed();

       try {
            if(cartButton.get(0).isDisplayed()){
                cartButton.get(0).click();
            }
            return true;
        }catch(Exception e) {
            System.out.println("Invalid USER!!!");
            return false;
        }
    }

    public void addProduct() throws InterruptedException {
        List<MobileElement> btnPlusForProduct = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.widget.Button[2]");
        btnPlusForProduct.get(0).click();
        Thread.sleep(2000);
    }

    public void verifyCalculate() {
        System.out.println("Click on CALCULATE button");
        List<MobileElement> btnCalculate = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.widget.Button[1]");
        btnCalculate.get(0).click();
    }


    public void verifyCheckOut() {
        List<MobileElement> btnCheckOut = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button");
        btnCheckOut.get(0).click();
    }

    public void verifyConfirm() throws InterruptedException {
        System.out.println("Click on CONFIRM button");
        List<MobileElement> btnConfirm = driver.findElementsByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]/android.widget.Button");
        btnConfirm.get(0).click();
        Thread.sleep(5000);
    }


}
