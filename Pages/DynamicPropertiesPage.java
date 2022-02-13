package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement visibleAfterFiveSeconds;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getVisibleAfterFiveSeconds() {
        return driver.findElement(By.id("visibleAfter"));
    }

    //----------------------------------------------------

    public String getVisibleAfterFiveSecondsText(){
        return this.getVisibleAfterFiveSeconds().getText();
    }
}
