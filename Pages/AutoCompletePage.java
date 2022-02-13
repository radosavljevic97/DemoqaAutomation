package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement searchBoxOne;
    WebElement autoComplete;

    public AutoCompletePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getSearchBoxOne() {
        return driver.findElement(By.id("autoCompleteMultipleContainer"));
    }

    public WebElement getAutoComplete() {
        return driver.findElement(By.cssSelector(".auto-complete__menu.css-2613qy-menu"));
    }

    //-----------------------------------------------------------

    public void insertColor(String c){
        this.getSearchBoxOne().clear();
        this.getSearchBoxOne().sendKeys(c);
    }

}
