package demo.steps;

import demo.pages.ToDoHomePage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class ToDoStepDefinition {
    ToDoHomePage toDoHomePage = new ToDoHomePage();

    @Given("User is on to do list page")
    public void userIsOnToDoListPage() {
        boolean result = toDoHomePage.isOnPage();
        Assert.assertTrue(result);
    }
}
