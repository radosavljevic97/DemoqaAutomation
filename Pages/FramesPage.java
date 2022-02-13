package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement frame1;
    WebElement frame2;

    public FramesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFrame1() {
        return driver.findElement(By.id("frame1"));
    }

    public WebElement getFrame2() {
        return driver.findElement(By.id("frame2"));
    }
}
