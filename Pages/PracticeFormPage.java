package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PracticeFormPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement male;
    WebElement female;
    WebElement other;
    WebElement mobileNumber;
    WebElement dateOfBirth;
    WebElement selectMonth;
    WebElement selectYear;
    WebElement selectDay;
    WebElement subjects;
    WebElement sports;
    WebElement reading;
    WebElement music;
    WebElement chooseFileButton;
    WebElement currentAddress;
    WebElement state;
    WebElement city;
    WebElement submitButton;
    WebElement practiceFormePopUp;

    public PracticeFormPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getMale() {
        return driver.findElement(By.id("gender-radio-1"));
    }

    public WebElement getFemale() {
        return driver.findElement(By.id("gender-radio-2"));
    }

    public WebElement getOther() {
        return driver.findElement(By.id("gender-radio-3"));
    }

    public WebElement getMobileNumber() {
        return driver.findElement(By.id("userNumber"));
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    public WebElement getSelectMonth() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }

    public WebElement getSelectYear() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }

    public WebElement getSelectDay() {
        return driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[4]"));
    }

    public WebElement getSubjects() {
        return driver.findElement(By.id("subjectsContainer"));
    }

    public WebElement getSports() {
        return driver.findElement(By.id("hobbies-checkbox-1"));
    }

    public WebElement getReading() {
        return driver.findElement(By.id("hobbies-checkbox-2"));
    }

    public WebElement getMusic() {
        return driver.findElement(By.id("hobbies-checkbox-3"));
    }

    public WebElement getChooseFileButton() {
        return driver.findElement(By.id("uploadPicture"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getState() {
        return driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));
    }

    public WebElement getCity() {
        return driver.findElement(By.cssSelector(".css-yk16xz-control"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getPracticeFormPopUp() {
        return driver.findElement(By.id("example-modal-sizes-title-lg"));
    }

    //-------------------------------------------------

    public void insertName(String name){
        this.getFirstName().clear();
        this.getFirstName().sendKeys(name);
    }

    public void insertLastName(String ln){
        this.getLastName().clear();
        this.getLastName().sendKeys(ln);
    }

    public void insertEmail(String mail){
        this.getEmail().clear();
        this.getEmail().sendKeys(mail);
    }

    public void clickOnMale(){
        this.getMale().click();
    }

    public void clickOnFemale(){
        this.getFemale().click();
    }

    public void clickOnOther(){
        this.getOther().click();
    }

    public void insertMobileNumber(String mn){
        this.getMobileNumber().clear();
        this.getMobileNumber().sendKeys(mn);
    }

    public void clickOnDatePicker(){
        this.getDateOfBirth().click();
    }

    public void selectMonth(String monthName){
        Select monthOption = new Select(this.getSelectMonth());
        monthOption.selectByVisibleText(monthName);
    }

    public void selectYear(String yearName){
        Select yearOption = new Select(this.getSelectYear());
        yearOption.selectByVisibleText(yearName);
    }

    public void selectDay(){
        this.getSelectDay().click();
    }


    public void insertSubjects(String sub){
        //this.getSubjects().clear();
        this.getSubjects().sendKeys(sub);
    }

    public void selectSports(){
        this.getSports().click();
    }

    public void selectReading(){
        this.getReading().click();
    }

    public void selectMusic(){
        this.getMusic().click();
    }

    public void uploadPicture(String s){
        this.getChooseFileButton().sendKeys(s);
    }

    public void insertCurrentAddres(String curAdd){
        this.getCurrentAddress().clear();
        this.getCurrentAddress().sendKeys(curAdd);
    }

    public void selectState(String s){
        Select state = new Select(this.getState());
        state.selectByValue(s);
    }

    public void selectCity(String c){
        Select city = new Select(this.getCity());
        city.selectByValue(c);
    }

    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }

    public String getPracticeFormPopUpText(){
        return this.getPracticeFormPopUp().getText();
    }
}
