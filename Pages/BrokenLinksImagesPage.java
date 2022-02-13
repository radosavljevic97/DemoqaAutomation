package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImagesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement brokenLinkLink;

    public BrokenLinksImagesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBrokenLinkLink() {
        return driver.findElement(By.linkText("Click Here for Broken Link"));
    }

    //------------------------------------------------------------------

    public void clickOnBrokenLinkLink(){
        this.getBrokenLinkLink().click();
    }
}
