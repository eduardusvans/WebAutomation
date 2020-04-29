package demo.steps;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaStepsDefinition {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();
    @Given("User open wikipedia homepage")
    public void userOpenWikipediaHomepage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on homepage")
    public void userInputSearchOnHomepage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @When("User click button search on homepage")
    public void userClickButtonSearchOnHomepage() {
        homePage.clickSearch();
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String title) {
        String actual = articlePage.getTitle();
        Assert.assertEquals(title, actual);
    }
}
//Lifecycle
//ScenarioA - ScenarioB - ScenarioC
//hooks before - scenario - hooks after
