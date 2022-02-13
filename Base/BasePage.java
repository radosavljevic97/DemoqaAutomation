package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public MainPage mainPage;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinksImagesPage brokenLinksImages;
    public BrokenLinkPage brokenLinkPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public FormsPage formsPage;
    public PracticeFormPage practiceFormPage;
    public AlertsFrameWindowsPage alertsFrameWindowsPage;
    public BrowserWindowsPage browserWindowsPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;
    public ModalDialogsPage modalDialogsPage;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        mainPage = new MainPage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        checkBoxPage = new CheckBoxPage(driver, wdwait);
        radioButtonPage = new RadioButtonPage(driver, wdwait);
        webTablesPage = new WebTablesPage(driver, wdwait);
        buttonsPage = new ButtonsPage(driver, wdwait);
        linksPage = new LinksPage(driver, wdwait);
        brokenLinksImages = new BrokenLinksImagesPage(driver, wdwait);
        brokenLinkPage = new BrokenLinkPage(driver, wdwait);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wdwait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wdwait);
        formsPage = new FormsPage(driver, wdwait);
        practiceFormPage = new PracticeFormPage(driver, wdwait);
        alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver, wdwait);
        browserWindowsPage = new BrowserWindowsPage(driver, wdwait);
        alertsPage = new AlertsPage(driver, wdwait);
        framesPage = new FramesPage(driver, wdwait);
        modalDialogsPage = new ModalDialogsPage(driver, wdwait);
        accordianPage = new AccordianPage(driver, wdwait);
        autoCompletePage = new AutoCompletePage(driver, wdwait);

    }

    public void scroll(WebElement we){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we);
    }

    public void click (WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }


    @AfterClass
    public void tearDown(){
        //driver.manage().deleteAllCookies();
        //driver.close();
        //driver.quit();
    }
}
