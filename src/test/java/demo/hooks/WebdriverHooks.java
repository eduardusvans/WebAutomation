package demo.hooks;

import demo.webdriver.Webdriverinstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebdriverHooks {
    @Before(value = "@Web")
    public void initializeWebDriver(){
        Webdriverinstance.initialize();
    }
    @After(value = "@Web")
    public void quitWebdriver(){
        Webdriverinstance.quit();
    }
}
