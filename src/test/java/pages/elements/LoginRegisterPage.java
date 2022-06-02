package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginRegisterPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By signIn = By.xpath("//*[@class='login']");
    private By emailInput = By.xpath("//*[@id='email_create']");
    private By clickCreate = By.xpath("//*[@id='SubmitCreate']");
    private By selectTitle = By.xpath("//*[@id='id_gender1']");
    private By enterFirstName = By.xpath("//*[@id='customer_firstname']");
    private By enterLastName = By.xpath("//*[@id='customer_lastname']");
    private By enterEmail = By.id("email");
    private By enterPassword = By.id("passwd");
    private By selectDay = By.xpath("//*[@id='days']/option");
    private By selectMonth = By.xpath("//*[@id='months']/option");
    private By selectYear = By.xpath("//*[@id='years']/option");
    private By checkNewsBox = By.id("uniform-newsletter");
    private By enterCompanyName = By.id("company");
    private By enterAddress = By.id("address1");
    private By enterAddress2=By.id("address2");
    private By enterCity = By.id("city");
    private By selectState = By.xpath("//*[@id='id_state']/option");
    private By enterZipCode = By.id("postcode");
    private By enterPlusInfo = By.id("other");
    private By enterHomePhone = By.id("phone");
    private By enterMobilePhone = By.id("phone_mobile");
    private By enterAddressAlias = By.id("alias");
    private By registerButton = By.id ("submitAccount");
    private By returnEmail = By.xpath("//*[@class='is_required validate form-control']");
    private By returnTitle = By.xpath("//*[@id='uniform-id_gender2']/span");
    private By returnPersonalInfo = By.xpath("//*[@class='is_required validate form-control']");
    private By returnCalendar = By.xpath("//*[@class='col-xs-4']/div/span");
    private By returnNewsOffers = By.xpath("//*[@class='checkbox']/div/span");











    public LoginRegisterPage(WebDriver driver,WebDriverWait wait){
        this.driver=driver;
        this.wait=wait;
    }

    public void clickSignIn(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(signIn)).click();
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
    }
    public void createAccount(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCreate)).click();
    }
    public void checkTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectTitle)).click();
    }
    public void sendFirstName(String firstname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterFirstName)).sendKeys(firstname);
    }
    public void sendLastName(String lastname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterLastName)).sendKeys(lastname);
    }
    public void sendEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterEmail)).sendKeys(email);
    }
    public void sendPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPassword)).sendKeys(password);
    }
    public void selectDay(int day){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectDay)).get(day).click();
    }
    public void selectMonth(int month){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectMonth)).get(month).click();
    }
    public void selectYear(int year){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectYear)).get(year).click();
    }
    public void checkNewsBox(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkNewsBox)).click();
    }
    public void sendCompanyName(String company){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterCompanyName)).sendKeys(company);
    }
    public void sendAddress(String address){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAddress)).sendKeys(address);
    }
    public void sendAddress2(String address2){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAddress2)).sendKeys(address2);
    }
    public void sendCity(String city){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterCity)).sendKeys(city);
    }
    public void selectState(int state){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selectState)).get(state).click();
    }
    public void sendZipCode(String zipcode){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterZipCode)).sendKeys(zipcode);
    }
    public void sendPlusInfo(String info){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterPlusInfo)).sendKeys(info);
    }
    public void sendHomePhone(String homephone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterHomePhone)).sendKeys(homephone);
    }
    public void sendMobilePhone(String mobilephone){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterMobilePhone)).sendKeys(mobilephone);
    }
    public void sendAddressAlias(String addressalias){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAddressAlias)).sendKeys(addressalias);
    }
    public void clickRegisterButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton)).click();
    }
    public String ReturnTitle(int title) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnTitle)).get(title).getAttribute("title");
    }
    public String ReturnPersonalInfo(int info) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(returnPersonalInfo)).get(info).getAttribute("Entered name is: "+info);
    }












}
