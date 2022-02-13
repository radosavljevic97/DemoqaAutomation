package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement smallModalButton;
    WebElement largeModalButton;
    WebElement largeModalHeader;
    WebElement largeModalText;

    public ModalDialogsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSmallModalButton() {
        return driver.findElement(By.id("showSmallModal"));
    }

    public WebElement getLargeModalButton() {
        return driver.findElement(By.id("showLargeModal"));
    }

    public WebElement getLargeModalHeader() {
        return driver.findElement(By.id("example-modal-sizes-title-lg"));
    }

    public WebElement getLargeModalText() {
        return driver.findElement(By.className("modal-body"));
    }

    //----------------------------------------------------

    public void clickOnSmallModalButton(){
        this.getSmallModalButton().click();
    }

    public void clickOnLargeModalButton(){
        this.getLargeModalButton().click();
    }

    public String getHeaderText(){
        return this.getLargeModalHeader().getText();
    }

    public String getText(){
        return this.getLargeModalText().getText();
    }
}
