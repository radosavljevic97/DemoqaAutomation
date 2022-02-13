package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement homeLink;
    WebElement notFoundLink;
    WebElement linkResponse;

    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getNotFoundLink() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getLinkResponse() {
        return driver.findElement(By.id("linkResponse"));
    }

    //--------------------------------------------------------

    public void clickOnHomeLink(){
        this.getHomeLink().click();
    }

    public void clickOnNotFoundLink(){
        this.getNotFoundLink().click();
    }

    public String getLinkResponseText(){
        return this.getLinkResponse().getText();
    }
}
