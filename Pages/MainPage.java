package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    List<WebElement> listOfElements;
    WebElement bannerImage;

    public MainPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getListOfElements() {
        return driver.findElements(By.className("card-up"));
    }

    public WebElement getBannerImage() {
        return driver.findElement(By.className("banner-image"));
    }

    //---------------------------------------------------------------

    public void clickOnElements(int i){
       this.getListOfElements().get(i).click();
    }
}
