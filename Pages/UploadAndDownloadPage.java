package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadAndDownloadPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement uploadButton;
    WebElement downloadButton;
    WebElement successfullUpload;

    public UploadAndDownloadPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUploadButton() {
        return driver.findElement(By.id("uploadFile"));
    }

    public WebElement getDownloadButton() {
        return driver.findElement(By.id("downloadButton"));
    }

    public WebElement getSuccessfullUpload() {
        return driver.findElement(By.id("uploadedFilePath"));
    }

    //---------------------------------------------------------

    public void uploadPicture(String picture){
        this.getUploadButton().sendKeys(picture);
    }

    public String getSuccessfullUploadText(){
        return this.getSuccessfullUpload().getText();
    }

    public void clickOnDownloadButton(){
        this.getDownloadButton().click();
    }
}
