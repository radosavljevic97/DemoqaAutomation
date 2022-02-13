package Tests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormsTests extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyThatPracticeFormTableAppearsAfterUserFillAllAllFieldsANdClickSubmitButton(){
        String firstName = "Stefan";
        String lastName = "Radosavljevic";
        String email = "stefanradosavljevic009@gmail.com";
        String mobileNumber = "0646425921";
        String month = "July";
        String year = "1997";
        String day = "30";
        String subjects = "Math";
        String picturePath = "C:\\Users\\stefa\\Desktop\\IT Bootcamp\\8. Nedelja\\Upload Slika\\Slika.jpg";
        String currentAddress = "Emila Zatopeka 19";
        String stateName = "NCR";
        String cityName = "";
        String headerText = "Thanks for submitting the form";

        mainPage.clickOnElements(1);
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        practiceFormPage.insertName(firstName);
        practiceFormPage.insertLastName(lastName);
        practiceFormPage.insertEmail(email);
        click(practiceFormPage.getMale());
        practiceFormPage.insertMobileNumber(mobileNumber);
        practiceFormPage.clickOnDatePicker();
        practiceFormPage.selectMonth(month);
        practiceFormPage.selectYear(year);
        practiceFormPage.selectDay();
        //practiceFormPage.insertSubjects(subjects);
        click(practiceFormPage.getSports());
        practiceFormPage.uploadPicture(picturePath);
        practiceFormPage.insertCurrentAddres(currentAddress);
        scroll(practiceFormPage.getSubmitButton());
        //practiceFormPage.selectState(stateName);
        //practiceFormPage.selectCity(cityName);
        practiceFormPage.clickOnSubmitButton();

        Assert.assertTrue(practiceFormPage.getPracticeFormPopUp().isDisplayed());
        Assert.assertEquals(practiceFormPage.getPracticeFormPopUpText(), headerText);

    }
}
