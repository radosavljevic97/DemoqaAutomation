package Tests;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ElementsTest extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyThatUserGetOutputMessageAfterFillingAllTextBoxFields(){
        String fullName = "Stefan Radosavljevic";
        String email = "stefanradosavljevic009@gmail.com";
        String currentAddress = "Emila Zatopeka 19";
        String permanentAddress = "Emila Zatopeka";

        mainPage.clickOnElements(0);
        elementsPage.clickOnTextBox();
        textBoxPage.insertFullName(fullName);
        textBoxPage.insertEmail(email);
        textBoxPage.insertCurrentAddress(currentAddress);
        textBoxPage.insertPermanentAddress(permanentAddress);
        scroll(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();

        Assert.assertTrue(textBoxPage.getOutput().isDisplayed());
        String expectedName = "Name:Stefan Radosavljevic";
        String actualName = textBoxPage.getOutputName().getText();
        Assert.assertEquals(actualName, expectedName);
    }

    @Test
    public void verifyThatReactCheckboxIsCheckedWhenUserCheckHomeCheckbox(){
        String expectedMessage = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        mainPage.clickOnElements(0);
        elementsPage.clickOnCheckBox();
        checkBoxPage.checkHomeCheckBox();
        checkBoxPage.expandAll();

        Assert.assertTrue(checkBoxPage.getReactCheckBox().isEnabled());
        scroll(checkBoxPage.getResult());
        Assert.assertEquals(checkBoxPage.getResult().getText(), expectedMessage);
    }

    @Test
    public void verifyThatAppropriateMessageAppearsWhenUserCheckYesRadioButton(){
        mainPage.clickOnElements(0);
        elementsPage.clickOnRadioButton();
        click(radioButtonPage.getYes());

        Assert.assertTrue(radioButtonPage.getYouHaveSelectedMessage().isDisplayed());
        String expectedText = "Yes";
        String actualText = radioButtonPage.getSuccessMessageText();
        Assert.assertEquals(actualText, expectedText);
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/radio-button";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void verifyThatUserCanAddEmployeeInWebTables(){
        String firstName = "Stefan";
        String lastName = "Radosavljevic";
        String email = "stefanradosavljevic009@gmail.com";
        String age = "24";
        String salary = "1200";
        String department = "QA";

        mainPage.clickOnElements(0);
        elementsPage.clickOnWebTables();
        webTablesPage.clickOnAddButton();
        webTablesPage.insertFirsName(firstName);
        webTablesPage.insertLastName(lastName);
        webTablesPage.insertEmail(email);
        webTablesPage.insertAge(age);
        webTablesPage.insertSalary(salary);
        webTablesPage.insertDepartment(department);
        webTablesPage.clickOnSubmitButton();

        //Assertovi
    }

    @Test
    public void verifyThatUserCanSearchEmployeeInWebTablesPage(){
        String name = "Cierra";

        mainPage.clickOnElements(0);
        elementsPage.clickOnWebTables();
        webTablesPage.insertToSearch(name);

        //Assertovi
    }

    @Test
    public void verifyThatAppropriateMessageAppearsWhenUserDoubleClickDoubleClickMeButton(){
        String expectedDCMessage = "You have done a double click";

        mainPage.clickOnElements(0);
        scroll(elementsPage.getButtons());
        elementsPage.clickOnButtons();
        buttonsPage.dounleClickOnDoubleClickMeButton();

        Assert.assertTrue(buttonsPage.getDoubleClickMessage().isDisplayed());
        Assert.assertEquals(buttonsPage.getDoubleClickMessageText(), expectedDCMessage);
    }

    @Test
    public void verifyThatClickingOnHomeLinkWillOpenNewHomeTab(){
        mainPage.clickOnElements(0);
        scroll(elementsPage.getLinks());
        elementsPage.clickOnLinks();
        wdwait.until(ExpectedConditions.elementToBeClickable(linksPage.getHomeLink()));
        linksPage.clickOnHomeLink();
        driver.getWindowHandles();
        ArrayList<String> listOfTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listOfTabs.get(1));

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/";

        Assert.assertTrue(mainPage.getBannerImage().isDisplayed());
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void verifyThatAppropriateMessageWillAppearAfterClickingOnNotFoundLink(){
        String expectedMessage = "Link has responded with staus 404 and status text Not Found";

        mainPage.clickOnElements(0);
        scroll(elementsPage.getLinks());
        elementsPage.clickOnLinks();
        scroll(linksPage.getNotFoundLink());
        linksPage.clickOnNotFoundLink();

        Assert.assertTrue(linksPage.getLinkResponseText().contains(expectedMessage));
        Assert.assertEquals(linksPage.getLinkResponseText(), expectedMessage);
    }

    @Test
    public void verifyThatClickingOnBrokenLinkWillRedirectUserToBrokenLinkPage(){
        mainPage.clickOnElements(0);
        scroll(elementsPage.getBrokenLinksImages());
        elementsPage.clickOnBrokenLinksImages();
        scroll(brokenLinksImages.getBrokenLinkLink());
        brokenLinksImages.clickOnBrokenLinkLink();
        wdwait.until(ExpectedConditions.urlToBe("http://the-internet.herokuapp.com/status_codes/500"));

        String actualURL = driver.getCurrentUrl();
        String expectedURL ="http://the-internet.herokuapp.com/status_codes/500";
        Assert.assertEquals(actualURL, expectedURL);

        Assert.assertTrue(brokenLinkPage.getStatusCodes().isDisplayed());
        Assert.assertEquals(brokenLinkPage.getStatusCodesText(), "Status Codes");
    }

    @Test
    public void verifyThatUserCanUploadPicture(){
        String picture = "C:\\Users\\stefa\\Desktop\\IT Bootcamp\\8. Nedelja\\Upload Slika\\Slika.jpg";

        mainPage.clickOnElements(0);
        scroll(elementsPage.getUploadAndDownload());
        elementsPage.clickOnUploadAndDownload();
        uploadAndDownloadPage.uploadPicture(picture);

        Assert.assertTrue(uploadAndDownloadPage.getSuccessfullUpload().isDisplayed());
        Assert.assertTrue(uploadAndDownloadPage.getSuccessfullUploadText().contains(".jpg"));
    }

    @Test
    public void verifyThatUserCanDownloadPicture(){
        mainPage.clickOnElements(0);
        scroll(elementsPage.getUploadAndDownload());
        elementsPage.clickOnUploadAndDownload();
        uploadAndDownloadPage.clickOnDownloadButton();

        //Assert za download videti: "https://www.seleniumeasy.com/selenium-tutorials/verify-file-after-downloading-using-webdriver-java"
    }

    @Test
    public void verifyThatElementWillAppearAfterFiveSeconds() throws InterruptedException {
        String expectedText = "Visible After 5 Seconds";

        mainPage.clickOnElements(0);
        scroll(elementsPage.getDynamicProperties());
        elementsPage.clickOnDynamicProperties();
        //Thread.sleep(6000);
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("visibleAfter")));

        Assert.assertTrue(dynamicPropertiesPage.getVisibleAfterFiveSeconds().isDisplayed());
        Assert.assertEquals(dynamicPropertiesPage.getVisibleAfterFiveSecondsText(), expectedText);
    }

}
