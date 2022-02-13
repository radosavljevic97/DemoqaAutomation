package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;
    WebElement output;
    WebElement outputName;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    public WebElement getOutputName() {
        return driver.findElement(By.id("name"));
    }

    //---------------------------------------------------------------

    public void insertFullName(String name){
        this.getFullName().clear();
        this.getFullName().sendKeys(name);
    }

    public void insertEmail(String email){
        this.getEmail().clear();
        this.getEmail().sendKeys(email);
    }

    public void insertCurrentAddress(String ca){
        this.getCurrentAddress().sendKeys(ca);
    }

    public void insertPermanentAddress(String pa){
        this.getPermanentAddress().sendKeys(pa);
    }

    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }
}
