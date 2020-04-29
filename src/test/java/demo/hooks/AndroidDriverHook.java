package demo.hooks;

import demo.webdriver.AndroidDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHook {
    @Before(value = "@Android")
    public void initializeAndroidDriver(){
        AndroidDriverInstance.initialize();
    }
    @After(value = "@Android")
    public void quitAndroidDriver(){
        AndroidDriverInstance.quit();
    }
}
