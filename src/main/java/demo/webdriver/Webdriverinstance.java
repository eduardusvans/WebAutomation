package demo.webdriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class Webdriverinstance {
    public static WebDriver driver;

    public static void initialize() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized", "-incognito", "-disable-extension");
        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        //initialize the webdriver
        driver = new ChromeDriver(options);
        //khusus mac untuk tidak bug
        //driver.manage().window().maximize();
        //untuk menunggu kalau ada error tergantung dikasih waktu berapa
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implict wait
    }

    public static void quit(){
        //quit driver
        driver.quit();
    }
}
