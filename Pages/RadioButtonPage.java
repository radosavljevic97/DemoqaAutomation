package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement yes;
    WebElement impressive;
    WebElement no;
    WebElement youHaveSelectedMessage;
    WebElement successMessage;

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYes() {
        return driver.findElement(By.id("yesRadio"));
    }

    public WebElement getImpressive() {
        return driver.findElement(By.id("yesRadio"));
    }

    public WebElement getNo() {
        return driver.findElement(By.id("noRadio"));
    }

    public WebElement getYouHaveSelectedMessage() {
        return driver.findElement(By.className("mt-3"));
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(By.className("text-success"));
    }

    //------------------------------------------------------

    public void checkYesButton(){
        this.getYes().click();
    }

    public void checkImpressiveButton(){
        this.getImpressive().click();
    }

    public void checkNoButton(){
        this.getNo().click();
    }

    public String getSuccessMessageText(){
        return this.getSuccessMessage().getText();
    }
}
