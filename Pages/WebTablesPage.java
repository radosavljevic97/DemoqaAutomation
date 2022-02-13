package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebTablesPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement addButton;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submitButton;
    WebElement searchBox;
    WebElement serachButton;

    public WebTablesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
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

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getSearchBox() {
        return driver.findElement(By.id("searchBox"));
    }


    //---------------------------------------------------------

    public void clickOnAddButton(){
        this.getAddButton().click();
    }

    public void insertFirsName(String fn){
        this.getFirstName().clear();
        this.getFirstName().sendKeys(fn);
    }

    public void insertLastName(String ln){
        this.getLastName().clear();
        this.getLastName().sendKeys(ln);
    }

    public void insertEmail(String e){
        this.getEmail().clear();
        this.getEmail().sendKeys(e);
    }

    public void insertAge(String age){
        this.getAge().clear();
        this.getAge().sendKeys(age);
    }

    public void insertSalary(String sal){
        this.getSalary().clear();
        this.getSalary().sendKeys(sal);
    }

    public void insertDepartment(String de){
        this.getDepartment().clear();
        this.getDepartment().sendKeys(de);
    }

    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }

    public void insertToSearch(String text){
        this.getSearchBox().clear();
        this.getSearchBox().sendKeys(text);
    }


}
