package Tests;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WidgetsTests extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyThatTextWillAppearOnAccordianPage(){
        mainPage.clickOnElements(3);
        driver.navigate().to("https://demoqa.com/accordian");
        accordianPage.clickOnSectionThree();

        Assert.assertTrue(accordianPage.getSection3Content().isDisplayed());
        Assert.assertTrue(accordianPage.getHeader3Text().contains("It is a long established fact"));
    }

    @Test
    public void verifyThatAutoCompleteAppears(){
        String color = "Blue";

        mainPage.clickOnElements(3);

    }

}
