package demo.steps;

import demo.pages.DanaRegisterPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class iOSStepDefinitions {

    private DanaRegisterPage registerPage = new DanaRegisterPage();

    @Given("User is on DANA register page")
    public void userIsOnDANARegisterPage() {
        boolean result = registerPage.isOnPage();
        Assert.assertTrue(result);
    }
}
