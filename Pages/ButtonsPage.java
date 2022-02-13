package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement doubleClickMeButton;
    WebElement rightClickMeButton;
    WebElement clickMeButton;
    WebElement doubleClickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDoubleClickMeButton() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClickMeButton() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMeButton() {
        return driver.findElement(By.id("Y2awR"));
    }

    public WebElement getDoubleClickMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    //--------------------------------------------------------

    public void dounleClickOnDoubleClickMeButton(){
        Actions action = new Actions(driver);
        action.doubleClick(this.getDoubleClickMeButton()).perform();
    }

    public String getDoubleClickMessageText(){
        return this.getDoubleClickMessage().getText();
    }
}
