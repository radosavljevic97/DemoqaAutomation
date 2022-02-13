package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinkPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement statusCodes;

    public BrokenLinkPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getStatusCodes() {
        return driver.findElement(By.tagName("h3"));
    }

    //---------------------------------------------------

    public String getStatusCodesText(){
        return this.getStatusCodes().getText();
    }
}
