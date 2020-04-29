package demo.pages;

import demo.webdriver.Webdriverinstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticlePage {
    public String getTitle(){
        //check the result
        //WebDriverWait wait = new WebDriverWait(Webdriverinstance.driver, 10);//explicit wait
        //WebElement titleArticle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstHeading")));//explicit wait
        WebElement titleArticle = Webdriverinstance.driver.findElement(By.id("firstHeading"));
        String title = titleArticle.getText();
        return title;
    }
}
