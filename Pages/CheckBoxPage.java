package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckBoxPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement homeCheckBox;
    WebElement expandAll;
    WebElement reactCheckBox;
    WebElement result;

    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getHomeCheckBox() {
        return driver.findElement(By.className("rct-checkbox"));
    }

    public WebElement getExpandAll() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }

    public WebElement getReactCheckBox() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-check"));
    }

    public WebElement getResult() {
        return driver.findElement(By.id("result"));
    }

    //------------------------------------------------------------------------------

    public void checkHomeCheckBox(){
        this.getHomeCheckBox().click();
    }

    public void expandAll(){
        this.getExpandAll().click();
    }
}
