package Tests;

import Base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AlertsFrameWindowsTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyThatNewWindowButtonWillOpenNewWindow(){
        mainPage.clickOnElements(2);
        driver.navigate().to("https://demoqa.com/browser-windows");
        browserWindowsPage.clickOnNewWindowButton();
        driver.getWindowHandles();
        ArrayList<String> listOfTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listOfTabs.get(1));

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/sample";

        Assert.assertTrue(browserWindowsPage.getSamplePageMessage().isDisplayed());
        Assert.assertEquals(browserWindowsPage.getSamplePageMessageText(), "This is a sample page");
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void verifyThatAlertWillAppear(){
        mainPage.clickOnElements(2);
        driver.navigate().to("https://demoqa.com/alerts");
        alertsPage.clickToSeeAlertButton();
        String alertMessage = driver.switchTo().alert().getText();

        Assert.assertEquals(alertMessage, "You clicked a button");
    }

    @Test
    public void verifyThatFramesAreVisible(){
        mainPage.clickOnElements(2);
        driver.navigate().to("https://demoqa.com/frames");

        Assert.assertTrue(framesPage.getFrame1().isDisplayed());
        Assert.assertTrue(framesPage.getFrame2().isDisplayed());
    }

    @Test
    public void verifyThatLargeModalAppearsWhenUserClicksOnLargeModalButton(){
        mainPage.clickOnElements(2);
        driver.navigate().to("https://demoqa.com/modal-dialogs");
        modalDialogsPage.clickOnLargeModalButton();

        Assert.assertTrue(modalDialogsPage.getLargeModalHeader().isDisplayed());
        Assert.assertTrue(modalDialogsPage.getLargeModalText().isDisplayed());
        Assert.assertEquals(modalDialogsPage.getHeaderText(), "Large Modal");
        Assert.assertTrue(modalDialogsPage.getText().contains("Lorem Ipsum is simply dummy text"));
    }
}
