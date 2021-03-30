package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static AppiumDriver driver;

    @Before("@appium")
    public void setUpAppium() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8");
        cap.setCapability("appPackage", "com.aphixsoftware.pocketshopapp");
        cap.setCapability("appActivity", "com.aphixsoftware.pocketshopapp.MainActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Before("@web")
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
        //driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void tearDown()    {  driver.quit();    }

    public static AppiumDriver getDriver()   {   return driver;    }

}
