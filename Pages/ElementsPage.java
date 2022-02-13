package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadAndDownload;
    WebElement dynamicProperties;

    public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenLinksImages() {
        return driver.findElement(By.id("item-6"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.id("item-7"));
    }

    public WebElement getDynamicProperties() {
        return driver.findElement(By.id("item-8"));
    }

    //-----------------------------------------------------

    public void clickOnTextBox(){
        this.getTextBox().click();
    }

    public void clickOnCheckBox(){
        this.getCheckBox().click();
    }

    public void clickOnRadioButton(){
        this.getRadioButton().click();
    }

    public void clickOnWebTables(){
        this.getWebTables().click();
    }

    public void clickOnButtons(){
        this.getButtons().click();
    }

    public void clickOnLinks(){
        this.getLinks().click();
    }

    public void clickOnBrokenLinksImages(){
        this.getBrokenLinksImages().click();
    }

    public void clickOnUploadAndDownload(){
        this.getUploadAndDownload().click();
    }

    public void clickOnDynamicProperties(){
        this.getDynamicProperties().click();
    }
}
