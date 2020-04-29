package demo.pages;

import demo.webdriver.Webdriverinstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    public void openHomePage(){
        Webdriverinstance.driver.get("https://wikipedia.org/");
    }
    public void inputSearch(String keyword){
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(keyword);
    }
    public void clickSearch(){
        WebElement buttonSearch = Webdriverinstance.driver.findElement(By.xpath("//button[@type = 'submit']"));
        //button[contains(@class, 'pure-button')]
        buttonSearch.click();
    }

}
