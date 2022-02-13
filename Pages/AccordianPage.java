package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccordianPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement section3;
    WebElement section3Content;

    public AccordianPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSection3() {
        return driver.findElement(By.id("section3Heading"));
    }

    public WebElement getSection3Content() {
        return driver.findElement(By.id("section3Content"));
    }

    //----------------------------------------------------

    public void clickOnSectionThree(){
        this.getSection3().click();
    }

    public String getHeader3Text(){
        return this.getSection3Content().getText();
    }
}
