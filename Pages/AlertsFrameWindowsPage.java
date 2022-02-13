package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AlertsFrameWindowsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement browseWindows;
    WebElement alerts;
    WebElement frames;
    WebElement nestedFrames;
    WebElement modalDialogs;

    public AlertsFrameWindowsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getBrowseWindows() {
        return browseWindows;
    }

    public WebElement getAlerts() {
        return alerts;
    }

    public WebElement getFrames() {
        return frames;
    }

    public WebElement getNestedFrames() {
        return nestedFrames;
    }

    public WebElement getModalDialogs() {
        return modalDialogs;
    }

    //-----------------------------------------------------------


}
