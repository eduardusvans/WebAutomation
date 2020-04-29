package demo;

import demo.pages.ArticlePage;
import demo.pages.HomePage;
import demo.webdriver.Webdriverinstance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();
    //WebDriver driver;
    //@Before
    //public void initializedWebDriver(){
        //chrome bug pakai ini
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("start-maximized", "-incognito", "-disable-extension");
        //options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        //options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
        //initialize the webdriver
        //driver = new ChromeDriver(options);
        //khusus mac untuk tidak bug
        //driver.manage().window().maximize();
        //untuk menunggu kalau ada error tergantung dikasih waktu berapa
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //implict wait
    //}

    //@After
    //public void driverQuit(){
            //quit driver
          //  driver.quit();
    //}

    //@Test
    //public void searchOnWikipedia() throws InterruptedException {

        //open the new tab and go to wikipedia.com
        //driver.get("https://wikipedia.org/");
        //finding elements
        //WebElement inputSearch = driver.findElement(By.id("searchInput"));
        //inputSearch.sendKeys("apple");
        //WebElement buttonSearch = driver.findElement(By.xpath("//button[@type = 'submit']"));
        //button[contains(@class, 'pure-button')]
        //buttonSearch.click();

        //check the result
        //WebDriverWait wait = new WebDriverWait(driver, 10);//explicit wait
        //WebElement titleArticle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));//explicit wait
       //WebElement titleArticle = driver.findElement(By.id("firstHeading"));
        //String title = titleArticle.getText();
        //Assert.assertEquals("Apple", title);
        //for hold web
        //Thread.sleep(5000);
    //}
    @Before
    public void before(){
        Webdriverinstance.initialize();
    }
    @After
    public void after(){
        Webdriverinstance.quit();
    }
    private void searchWikipedia(String keyword, String expected){
        homePage.openHomePage();
        homePage.inputSearch(keyword);
        homePage.clickSearch();
        String title = articlePage.getTitle();
        Assert.assertEquals(expected,title);
    }
    @Test
    public void searching1() {
        searchWikipedia("Apple", "Apple");
    }
    @Test
    public void searching2() {
        searchWikipedia("Peach", "Peach");
    }
    @Test
    public void searching3() {
        searchWikipedia("Orange", "Orange");
    }
    @Test
    public void searching4() {
        searchWikipedia("Pear", "Pear");
    }

    //Before - Test - After
}
