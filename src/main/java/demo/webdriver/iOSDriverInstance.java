package demo.webdriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSDriverInstance {
    public static IOSDriver<IOSElement> iosDriver;

    public static void initialize(){
        String appiumUrl = "http://0.0.0.0:4723/wd/hub/";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","iOS");
        caps.setCapability("platformVersion", "13.4.1");
        caps.setCapability("deviceName","iPhone 11 Pro Max");
        caps.setCapability("app","/Users/arderitoe/IdeaProjects/WebAutomation/APP/TestingApp.app");
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("udid","5FADD008-5E1B-4913-B0C4-4BC2B741AD75");

        try{
            iosDriver =  new IOSDriver<IOSElement>(new URL(appiumUrl),caps);
            iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public static void quit(){
        //quit driver
        iosDriver.quit();
    }
}
