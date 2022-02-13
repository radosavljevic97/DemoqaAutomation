package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FormsPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement practiceForm;

    public FormsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPracticeForm() {
        return driver.findElement(By.cssSelector(".btn.btn-light."));
    }

    //----------------------------------------------------

    public void clickOnPracticeForm(){
        this.getPracticeForm().click();
    }
}
