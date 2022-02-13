package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement clickButtonToSeeAlertButton;
    WebElement fiveSecDelayButton;
    WebElement confirmBoxButton;
    WebElement prompBoxButton;

    public AlertsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getClickButtonToSeeAlertButton() {
        return driver.findElement(By.id("alertButton"));
    }

    public WebElement getFiveSecDelayButton() {
        return driver.findElement(By.id("timerAlertButton"));
    }

    public WebElement getConfirmBoxButton() {
        return driver.findElement(By.id("confirmButton"));
    }

    public WebElement getPrompBoxButton() {
        return driver.findElement(By.id("promtButton"));
    }

    //-------------------------------------------------

    public void clickToSeeAlertButton(){
        this.getClickButtonToSeeAlertButton().click();
    }
}
