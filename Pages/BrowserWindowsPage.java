package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement newWindowButton;
    WebElement samplePageMessage;

    public BrowserWindowsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getNewWindowButton() {
        return driver.findElement(By.id("windowButton"));
    }

    public WebElement getSamplePageMessage() {
        return driver.findElement(By.id("sampleHeading"));
    }

    //------------------------------------------------------

    public void clickOnNewWindowButton(){
        this.getNewWindowButton().click();
    }

    public String getSamplePageMessageText(){
        return this.getSamplePageMessage().getText();
    }
}
